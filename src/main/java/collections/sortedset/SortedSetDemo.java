package collections.sortedset;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetDemo {
	
	public static void main(String[] args) {
		
		// SortedSet will not allow the duplicate
		// Sorted set will give the order (asc, desc)
		
		SortedSet<Integer> sSet = new TreeSet<Integer>();
		sSet.add(10); // When you are trying to add the duplicate element into the set, it will ignore the duplicate element
		sSet.add(30);
		sSet.add(20); // When you are trying to add the duplicate element into the set, it will ignore the duplicate element
		
		sSet.add(10);  // Boxing, Wripper classes, generics
		sSet.add(20);
		
		//Error
		// 10,20,30  --  
		
		Iterator <Integer> itr = sSet.iterator();
		
		while(itr.hasNext()) {
			Integer no = itr.next();
			System.out.println(no);
		}
		
	}

}
