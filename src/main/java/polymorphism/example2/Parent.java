package polymorphism.example2;

public  class Parent {
	
	
	public int sum(int a, int b) {
		return a + b;
	}
	
	public int sum(int a, int b, int c) {
		return a + b + c;
	}
	
	public String sum(String a, String  b) {
		return a.concat(b);
	}
	
	
	public  int multiply(int a, int b) {
		return a * b;
	}
	
	public int multiply(int a, int b, int c) {
		return a * b * c;
	}
	
	


 
}
