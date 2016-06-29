package string;

public class StringDemo {

	public static void main(String[] args) {

		String s1 = new String("Java Training"); // String is defined as a final
													// claa. you cannot extend
													// the final class. this
													// final class can not be
													// the super class. final
													// class is called immutable
													// class
		String s2 = new String("Java Training");
		
		new String ("DotNetTraining");
		
		System.out.println(s1);
		System.out.println(s2);
		
		//String constant pool
		String s3 = "String 3"; //String litteral
		String s4 = "String 3"; //String litteral
		 s4 = "String 4";
		 
		 String s5 = "String 3";
		 String s6 = "string 4";
		System.out.println(s3);
		System.out.println(s4);
		
		s6 = s6.concat(" string 5");
		
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
		System.out.println(s6); // string4
		
		String s7 = s2.intern();
		
		String a1 = new String ("test1");
		String a2 = new String("test1");
		
		System.out.println(a1.equals(a2)); //true
		
		String a3 = "test1";
		String a4 = "test1";
		
		System.out.println(a1.equals(a3)); //true
		System.out.println(a3.equals(a4)); // true
		
		//string cannot be changed, overwrite , cuz final

	}

}
