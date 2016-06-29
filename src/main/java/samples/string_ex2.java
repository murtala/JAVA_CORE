package samples;

public class string_ex2 
{

	public static void main(String[] args) 
	{
		/*display s
		 *        se
		 *        sel
		 *        sele
		 *        selen....etc
		 **/
		/*String str="selenium";
		for(int i=0;i<=str.length();i++)
		{
			System.out.println(str.substring(0,i));
		}*/
		
		String str="selenium automation testing";
		String a[]=str.split(" ");
		System.out.println(a[2]+" "+a[1]+" "+a[0]);

	}

}
