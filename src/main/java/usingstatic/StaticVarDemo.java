


package usingstatic;

public class StaticVarDemo {
	
	static int counter = 10;
	int counter1 = 10;
	
	public static void main(String[] args) {
		StaticVarDemo a = new StaticVarDemo();
		StaticVarDemo a1 = new StaticVarDemo();
		StaticVarDemo a2 = new StaticVarDemo();
		
		counter= 20;
		a.counter1 =20;
		
		System.out.println(a.counter);//20
		System.out.println(a1.counter);//20
		System.out.println(a2.counter);//20
		
		System.out.println("Instnace variables.........");
		
		System.out.println(a.counter1);//20
		System.out.println(a1.counter1);//10
		System.out.println(a2.counter1);//10

		
		
	}

}
