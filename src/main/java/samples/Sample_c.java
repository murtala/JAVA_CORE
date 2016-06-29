package samples;

public class Sample_c 
{
    int x,y;
    
    public Sample_c()  // constructor
    {
    	x=5;
    	y=6;
    }
    public void f1()
    {
    	System.out.println(x*y);
    }
    public int f2()
    {
    	return x+y;
    }
	public static void main(String[] args) 
	{
		Sample_c obj=new Sample_c();
		obj.f1();
		int n=obj.f2();
		
		
		

	}

}
