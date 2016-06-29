package samples;

public class string_ex1 
{

	public static void main(String[] args) 
	{
		//count the number of times the given string is repeated in the String
		String str="This is sample";
		/*int p=0,cnt=0;
		for( ;str.indexOf("s",p)!=-1; )
		{
			cnt++;          
			p=str.indexOf("s",p)+1;
		}
		System.out.println("is repeated for :"+cnt);*/
		
		//read only digits in the given string
		str="kjkdfj656k98kj340j32df";
		char ch;
		for(int i=0;i<str.length();i++)
		{
		 ch=str.charAt(i);
		 if(Character.isDigit(ch))
			 System.out.println(ch);
		}
		

	}

}
