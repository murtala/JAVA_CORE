package equalsVs;

public class assgn1 
{

	public static void main(String[] args)
	{
		String s1=new String("hello");  //s1 and s2 are objects
		String s2=new String("hello");
		
		if(s1==s2)  //compare the address of these objects
			System.out.println("both s1 and s2 are same");
		else
			System.out.println("both s1 and s2 are not same");
		
		if(s1.equals(s2)) // compare the data in the objects
			System.out.println("s1 and s2 are same");
		else
			System.out.println("s2 and s2 are not same");
		
		String str="This4 is s8amp10le";  /// cannot be modified
		
		
		StringBuffer st=new StringBuffer("This is sample"); ///this can be modified... 
		System.out.println(st.insert(7, "java"));
		System.out.println(st.delete(5,7));		
		
		

	}

}
