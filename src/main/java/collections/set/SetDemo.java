package collections.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo {
	
	public static void main(String[] args) {
		
		// Set will not allow the duplicate
		// You will not get the order. (There is no order with the set
		
		Set<Integer> set = new HashSet<Integer>();
		set.add(10);  // Boxing, Wripper classes, generics
		set.add(20);
		set.add(10); // When you are trying to add the duplicate element into the set, it will ignore the duplicate element
		set.add(30);
		set.add(20); // When you are trying to add the duplicate element into the set, it will ignore the duplicate element
		
		//Error
		// 10,20,30  --  
		
		Iterator<Integer> itr = set.iterator();
		
		while(itr.hasNext()) {
			Integer no = itr.next();
			System.out.println(no);
		}
		
	}

}
