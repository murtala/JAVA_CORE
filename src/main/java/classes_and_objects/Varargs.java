package classes_and_objects;

import java.awt.Point;
import java.awt.Polygon;

public class Varargs {

	
	public static void main(String[] args) {
		foo(5);
    	foo(5,"One String");
    	foo(7,"One String","Two Strings");
    	foo(3,"One String","Two Strings","Three Strings");
	}
	
	//allows to input any number of arguments
		//using elipsis (3 dots)
		public static void foo(int i, String... strings) {
			System.out.println("Num:" + i );
			  String[] someStrings = strings;
			  for (String string : someStrings) {
				System.out.println("S: "+string);
			}
		}
		
	
}
