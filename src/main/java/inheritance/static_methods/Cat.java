package inheritance.static_methods;

public class Cat extends Animal {
	  public static void testClassMethod() {
	        System.out.println("The static method in Cat");
	    }
	    public void testInstanceMethod() {
	        System.out.println("The instance method in Cat");
	    }

	    
/*	    The Cat class overrides the instance method in Animal and hides the static method in Animal. The main method in this class creates an instance of Cat and invokes testClassMethod() on the class and testInstanceMethod() on the instance.
*/	    public static void main(String[] args) {
	        Cat myCat = new Cat();
	        Animal myAnimal = myCat;
	        Animal.testClassMethod();
	        myAnimal.testInstanceMethod();
	    }
}
