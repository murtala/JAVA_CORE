package jdbc.st;

public class StaticDemo {
	
	public StaticDemo () {
		System.out.println("Default Constructor...");
	}
	
	
	static {
		System.out.println("static blacks...");
	}
	
	public static void m1() {
		System.out.println("static method m1");
	}
	
	
	public  void m2() {
		System.out.println("static method m1");
	}
	
	
	public static void main(String[] args) {
		
		StaticDemo.m1();  // static method
		
		StaticDemo sd = new StaticDemo();
		
		sd.m2();  
		
		
	}
	
	
	
	

}
