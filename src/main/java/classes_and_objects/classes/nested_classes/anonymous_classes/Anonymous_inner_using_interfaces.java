package classes_and_objects.classes.nested_classes.anonymous_classes;

public class Anonymous_inner_using_interfaces {
	public static void main(String[] args) {
		Eatable e = new Eatable() {
			
			@Override
			public void eat() {
				System.out.println("EATING");	
			}
		};
		e.eat();
	}

}
