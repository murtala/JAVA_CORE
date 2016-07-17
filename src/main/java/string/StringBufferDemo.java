package string;

public class StringBufferDemo {
	
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Heloo. ");
		sb.append("This is ");
		sb.append(" Java Training");
		
		StringBuffer sb1 = new StringBuffer("Heloo. ");
		sb1.append("This is ");
		sb1.append(" Java Training");
		
		
		
String str2="This4 is s8amp10le";  /// cannot be modified
		
		
		StringBuffer st=new StringBuffer("This is sample"); ///this can be modified... 
		System.out.println(st.insert(7, "java"));
		System.out.println(st.delete(5,7));	
		
		
		System.out.println(sb);
		System.out.println(sb1);
		String str = sb.toString();
		String str1 = sb1.toString();
		System.out.println(sb.equals(sb1)); // false
		System.out.println(sb.toString().equals(sb1.toString())); //false
		System.out.println(str.equals(str1)); // true
		
		


	}

}
