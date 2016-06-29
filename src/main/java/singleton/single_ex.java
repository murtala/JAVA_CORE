package singleton;

public class single_ex 
{
	static single_ex obj=new single_ex();
	private single_ex()
	{ 
		
	}
	public static single_ex getInstance( ) 
	{
	  return obj;
	}
	protected void exmethod( ) 
	{
	  System.out.println("sample method singleton"); 
	}

	public static void main(String[] args)
	{
		single_ex objex = single_ex.getInstance( );
	    objex.exmethod();
	    
	   

	}

}
