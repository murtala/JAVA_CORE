package samples;

public class Sample_v 
{

	int x;  //instance variable
	static int y; //static variable
	
	public void f1()
	{
		int z; //local variable...accessible only in f1 method
		Integer n;  // n works like variable and also like object
		
		z=5;
		System.out.println(x+y+z);
	}
	public static void main(String[] args) 
	{
		Sample_v obj=new Sample_v();
		obj.x=10;
		y=6;
		obj.f1();

	}

}
