package polymorphism;

public class Child extends parent {

	public int sum(int x, int y) {
		return x + y + 5;
	}

	 public int sum(int x, int y, int z){
		 return x+y+z+4; }
	  
	// public String sum ( String str1, String str2){ return str1 +str2; }
	 
	 public void display(){
		 System.out.println("Child class Information");
	 }

	public static void main(String[] args) {

		System.out.println("Parent Class reference varaiable and parent class object");
		parent p1 = new parent();

		System.out.println(p1.sum(10, 20)); // 20
		System.out.println(p1.sum(10, 20, 30)); // 60
		System.out.println(p1.sum("Java1 ", "Trainning1")); // java training
		
		System.out.println("Parent Class reference varaiable and Child class object");

		parent p = new Child(); // a parent class reference variable can hold
								// the child class reference
								// By using the parent class reference variable
								// you cannot call the child class specific
								// methods
		// dynamic polymorphism , late binding, run time polymorphism
		System.out.println();
		System.out.println(p.sum(10, 20)); // 35  because overridden up there
		System.out.println(p.sum(10, 20, 30)); // 64
		System.out.println(p.sum("Java2 ", "Training2"));

		p.display(); //child class specific method, we cannot call the child class specific method by using the parent class reference var 

		System.out.println("child Class reference varaiable and child class object");


		Child c = new Child();// a chilc d class reference variable can hold the
								// child class object
		System.out.println(c.sum(10, 20)); // 35  because overridden up there
		System.out.println(c.sum(10, 20, 30)); // 64
		System.out.println(c.sum("Java3 ", "Training3")); 
		c.display(); //child class specific method
	}
}
