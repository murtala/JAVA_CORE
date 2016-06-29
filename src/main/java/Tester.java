import java.util.ArrayList;
import java.util.Iterator;

public class Tester  {
	// static String theString = "Initialized";

	

	String myString = "tester";
	public static void main(String[] args) {

		
		
		String s1 = "tester";
		String s2 = "tester";
		String s3 = new String("tester");
		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
		System .out.println(s1.equals(s3));
	
	//	StringBuffer myString = new StringBuffer("Testl23");
	//	System .out.println(myString.reverse());
		
		int a = 312;
		int b = 4;
	//	int c = ++a + b--;
		int c =  a>>b;
		//int c = (a <b ? a : b);
	//	System. out. println( a);
	//	System .out.println(b);
	//	System. out. println(c);
		
	/*	if ((a == 1) | (++b > 1)) {
			c += b;
			System. out. println(c);
		
		}*/
}}
