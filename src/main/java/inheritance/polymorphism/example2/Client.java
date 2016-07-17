package inheritance.polymorphism.example2;

public class Client {
	
	public static void main(String[] args) {
		
		// Final key word can be applied to variables, methods, classes
		
		// If you apply the final key word with respect to variables, you can not reassign the the value to that variable
		
		final int x = 10; //x = 20; 
		
		// If you apply the the final key word with respect to methods, that methods can be overridden in the child class
		
		// If you apply the final key word with respect classes, you can not extend that final classes. means it will not
		//participate in the inheritance
		
		// static polymorphism, early binding, compile time polymorphism 
		// Overloading is called as compile time poly, early binding or static polymorphism
		Parent ad = new Parent();
		ad.sum(10, 20);
		ad.sum(10,20,30 );
		ad.sum("abc", "xyz");
		
		
		
		Parent p = new Parent();
		int mul = p.multiply(10, 20);
		
		System.out.println(" mul = " + mul);
		
		
		Child c = new Child();
		mul = c.multiply(10, 20);  
		
		System.out.println("mul = " + mul);
		
		
		//A prerent class reference variable can hold the child class object. 
		//by using this reference variable, you can not call the child class specific methods.
		
		// Dynamic polymorphism, Late Binding or Runtimepolymorphism
		//Method overridding is called as Dynamic polymorphism, Late Binding or Runtimepolymorphism
		Parent c1 = new Child(); 		
		mul = c1.multiply(10, 20);		
		
		System.out.println("mul = " + mul);
		
		
		
		
		
		/*Child c = new Child();
		int x = c.sum(10, 20);
		
		System.out.println(x);
		*/
		
		
		
		
	}

}
