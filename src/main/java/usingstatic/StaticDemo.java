package usingstatic;

public class StaticDemo {
	
	//static blacks
	//static methods
	//static variables
	
	static {
		System.out.println("Static Blacks..........");
	}

	public static void DateUtility() {
		m3(); // m3 can be called here because m3 is static,and in static area dateutility
		System.out.println("Date Utility");
	}
	
	public static void m3(){
		System.out.println("static m3 method");
	}
	
	//instance method or normal method, we can call this method from another instance method without object created with the same class 
	public void m1(){
		System.out.println("m1 method");
	}
	
	public void m2(){
		m2();
		System.out.println("m2 method");
	}

	public static void main(String[] args) {
		DateUtility();
		m3();  // can be called here because m3 is static, main is also static
		
		StaticDemo sd =new StaticDemo(); //necessary to call static method from non static
		sd.m1();  //create a new instance in order to access the non static methods
		sd.m2();

	}
}
