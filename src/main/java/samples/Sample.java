package samples;

public class Sample 
{
	int x,y;   //fields in the class
	
	public void f1()   //method
	{
		System.out.println(x*y);
	}

	public static void main(String[] args) 
	{
		Sample obj=new Sample();  //create object
		obj.x=5;  //access the fields and method
		obj.y=10;
		obj.f1();

	}

}
