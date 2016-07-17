package generics.wildcards.unbounded_wildcards;

import java.util.Arrays;
import java.util.List;

public class UndoundedDemo {

	public static void printListV1(List<Object> list) {
	    for (Object elem : list)
	        System.out.println(elem + " ");
	    System.out.println();
	}
	
	//same as method above but using unbounded <?>
	public static void printListV2(List<?> list) {
	    for (Object elem: list)
	        System.out.print(elem + " ");
	    System.out.println();
	}
	
	public static void main(String[] args) {
		List<Integer> li = Arrays.asList(1, 2, 3);
		List<String>  ls = Arrays.asList("one", "two", "three");
		printListV2(li);
		printListV2(ls);
	}
}
