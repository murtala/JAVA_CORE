package samples;

public class str_rev 
{

	public static void main(String[] args) 
	{
		///reverse of the given string
		String str="Testing sample";
        
		for(int i=str.length()-1;i>=0;i--)
		{
		 	System.out.print(str.charAt(i));
		}
		
		//using sting buffer
		StringBuffer myString = new StringBuffer("Testl23");
		System .out.println(myString.reverse());

	}

}
