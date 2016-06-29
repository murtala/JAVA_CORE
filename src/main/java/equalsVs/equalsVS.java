package equalsVs;

public class equalsVS {

	public static void main(String[] args) {
		// == compares the memory location. .equals compares the values
		String s1 = "abc";
		String s2 = s1;
		String s0 = "abc";
		String s3 = new String("abc");
		String s4 = new String("abc");

		System.out.println("Statement 1 : "+ s3 == s4);
		System.out.println("Statement 2 : "+ s3.equals(s4));
		System.out.println("Statement 3 : "+ s1.equals(s2));
		
		System.out.println("s1 = \"abc\"");
		System.out.println("s2 = \"s1\"");
		System.out.println("s3 = new String(\"abc\")");
		System.out.println("s4 = new String(\"abc\")");

		System.out.println("s0.equals(s1) : " + s0.equals(s1));
		System.out.println("s0.equals(s2) : " + s0.equals(s2));
		System.out.println("s1.equals(s2) : " + s1.equals(s2));
		System.out.println("s1.equals(s3) : " + s1.equals(s3));
		System.out.println("s1.equals(s4) : " + s1.equals(s4));
		System.out.println("s2.equals(s3) : " + s2.equals(s3));
		System.out.println("s0 == s1 : " + (s0 == s1));
		System.out.println("s0 == s2 : " + (s0 == s2));
		System.out.println("s1 == s2 : " + (s1 == s2));
		System.out.println("s1 == s3  : " + (s1 == s3));
		System.out.println("s1 == s4 : " + (s1 == s4));
		System.out.println("s2 == s3 : " + (s2 == s3));
		System.out.println("s2 == s4 : " + (s2 == s4));
		
		/*String s1 = "Hello";
		String s2 = "Hello";
		String s3 = new String(s1);
		
		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
		System.out.println(s1.equals(s3)   );*/
		
		
		
		
		
		
	}
	// s1 and s2 are equals, but not ==

}
