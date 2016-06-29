package collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;

public class ListExample {

	public static void main(String[] args) {
		int x[]={1,3,2,4,5}; 
		Set set = new HashSet<>();
		
		//The add and addAll operations always append the new element(s) to the end of the list.
		//Thus, the following idiom concatenates one list to another.
		
		Set list1 = null;
		Collection list2 = null;
		list1.addAll(list2);
		
		// And here's an example (JDK 8 and later) that aggregates some names into a List:
/*
		 Collection people;
		List<String> list = people.stream()
		 .map(Person::getName)
		 .collect(Collectors.toList());*/

		
		//shuffle
		
		List<String> list = new ArrayList<String>();
        for (String a : args)
            list.add(a);
        Collections.shuffle(list, new Random());
        System.out.println(list);
        
        
        for (ListIterator<String> it = list.listIterator(list.size()); it.hasPrevious(); ) {
        	String t = it.previous();
           // ...
        }
        
		

	}

	
	//Here's a little method to swap two indexed values in a List.
	public static <E> void swap(List<E> a, int i, int j) {
	    E tmp = a.get(i);
	    a.set(i, a.get(j));
	    a.set(j, tmp);
	}
	
	
	// Here's another polymorphic algorithm that uses the preceding swap method.

	 public static void shuffle(List<?> list, Random rnd) {
	     for (int i = list.size(); i > 1; i--)
	         swap(list, i - 1, rnd.nextInt(i));
	 }

	 
	
}
