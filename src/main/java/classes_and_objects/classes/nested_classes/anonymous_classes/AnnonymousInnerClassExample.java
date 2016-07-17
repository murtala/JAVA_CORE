package classes_and_objects.classes.nested_classes.anonymous_classes;

public class AnnonymousInnerClassExample {
	
	public static void main(String[] args) {
		Person p = new Person() {
			
			@Override
			String name(String names) {
				return names;
			}
			
			@Override
			void eat() {
				System.out.println("Eating");
			}
			
			@Override
			int age() {
				
				return 0;
			}
		};
		p.eat();
		System.out.println(p.age());
		System.out.println(p.name("HAHA"));
		;
	}

}
