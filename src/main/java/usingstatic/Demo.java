package usingstatic;

public class Demo {
	
	public static void main(String[] args) {
		
		StaticDemo.DateUtility();// static methods can be called by using the class name.methodname. no need to create the object. if you call by using the object also, it will internnally assosiated with the class only 
		StaticDemo.m3();
		StaticDemo sd = new StaticDemo();
		sd.DateUtility();
		sd.m3();
		//StaticDemo.m1(); we can not call the instance method  by using the class name.methodname . we have to call the instance method using the object name.method only
				
	}

}
