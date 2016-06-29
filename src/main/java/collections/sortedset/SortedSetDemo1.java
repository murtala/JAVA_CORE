package collections.sortedset;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;



public class SortedSetDemo1 {
	
	public static void main(String[] args) {
		
		SortedSet<Emp> sSet = new TreeSet<Emp>(new MyComparator());
		
		Emp e5 = new Emp(30, "Ramu", "mgr");
		Emp e6 = new Emp(30, "Ramu", "mgr");
		
		Emp e1 = new Emp(10, "Srinu", "deve");
		Emp e2 = new Emp(10, "Srinu", "deve"); // e1 and e5 are the duplicate objects
		
		Emp e3 = new Emp(20, "viswam", "Lead");
		Emp e4 = new Emp(20, "viswam", "Lead");
		
		
		
		
		//e1, e2,e3, e4 --> good
		
		sSet.add(e1);
		sSet.add(e2);
		sSet.add(e3);
		sSet.add(e4);
		sSet.add(e5);
		sSet.add(e6);
		
		
		
		
		
		Iterator<Emp> itr = sSet.iterator();
		
		while (itr.hasNext()) {
			Emp emp = itr.next();
			System.out.println(emp);
		}
		
	}

}
