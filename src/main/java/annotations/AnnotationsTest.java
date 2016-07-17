package annotations;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

public class AnnotationsTest {
	public static void main(String[] args) {
		Generation3List g3l = new Generation3List(null);
		System.out.println(g3l.getFirstName());
		Field[] fields = g3l.getClass().getDeclaredFields();
		System.out.println(g3l.getClass().getDeclaredAnnotations().length);
		;
		
		for (Field field : fields) {
			if(field.getType().equals(String.class)){
				Annotation[] annotations = field.getDeclaredAnnotations();
				for (Annotation annotation : annotations) {
					if(annotation.annotationType().equals(Value.class)){
						// set a private field to be accessible
						boolean accessible = field.isAccessible();
						if(!accessible){
							field.setAccessible(true);
						}
						// retrieve the value from annotation
						Value valueAnnotation = (Value) annotation;
						String value = valueAnnotation.value();
						// set value on the field
						try {
							field.set( g3l, value);
						} catch (IllegalArgumentException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						} catch (IllegalAccessException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						// set accessibility back to private
						field.setAccessible(accessible);
					}
				}
			}
		}
		System.out.println(g3l.getFirstName());
}
	

}
