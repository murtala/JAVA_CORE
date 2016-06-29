package polymorphism;

public class parent {

	//method signature
	public int sum(int x, int y){
		return  x+y;
	}
	
	public int sum(int x, int y, int z){
		return  x+y+z;
	}
	
	public String sum ( String str1, String str2){
		return str1 +str2;
	}
	
	
	public void display(){
		 System.out.println("Parent class Information");
	 }

	/**
	 * @param args
	 */
	public static void main(String[] args) {


parent p = new parent();
//method overloading
//static polymorphism, compile time polymorphism , early binding
//method overloading will happen with the same class
//
p.sum(10, 20);
p.sum(10, 20, 30);
p.sum("Parent", "Class");

	}

}
