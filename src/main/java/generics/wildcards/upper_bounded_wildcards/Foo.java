package generics.wildcards.upper_bounded_wildcards;

import java.util.Arrays;
import java.util.List;

public class Foo {

/*	To declare an upper-bounded wildcard, use the wildcard character ('?')
 * , followed by the extends keyword, followed by its upper bound. Note that, in this context, extends is used in a general sense to mean either "extends" (as in classes) or "implements" (as in interfaces).
*/	
	public static void process(List<? extends Foo> list) {
	    for (Foo elem : list) {
	        // In the foreach clause, the elem variable iterates over each element in the list. Any method defined in the Foo class can now be used on elem.
	    }
	}
	
	//The sumOfList method returns the sum of the numbers in a list
	
	public static double sumOfList(List<? extends Number> list) {
	    double s = 0.0;
	    for (Number n : list)
	        s += n.doubleValue();
	    return s;
	}
	
	public static void main(String[] args) {
		List<Integer> li = Arrays.asList(1, 2, 3);
		System.out.println("sum = " + sumOfList(li));
		
		List<Double> ld = Arrays.asList(1.2, 2.3, 3.5);
		System.out.println("sum = " + sumOfList(ld));
	}
	
}
