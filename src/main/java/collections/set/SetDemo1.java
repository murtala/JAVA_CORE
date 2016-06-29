package collections.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo1 {
	
	public static void main(String[] args) {
		
		Set<Emp> set = new HashSet<Emp>();
		
		
		Emp e1 = new Emp(10, "Srinu", "deve");
		Emp e2 = new Emp(10, "Srinu", "deve"); // e1 and e2 are the duplicate objects
		
		Emp e3 = new Emp(20, "viswam", "Lead");
		Emp e4 = new Emp(20, "viswam", "Lead");
		
		Emp e5 = new Emp(30, "Ramu", "mgr");
		Emp e6 = new Emp(30, "Ramu", "mgr");
		
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
		System.out.println(e3.hashCode());
		System.out.println(e4.hashCode());
		System.out.println(e5.hashCode());
		System.out.println(e6.hashCode());
		
		//e1, e2,e3, e4 --> good
		
		set.add(e1);
		set.add(e2);
		set.add(e3);
		set.add(e4);
		set.add(e5);
		set.add(e6);
		
		
		/*set.add(e1);
		set.add(e2);
		set.add(e3);
		set.add(e4);
		set.add(e5);
		set.add(e6);
		*/
		
		
		
		
		Iterator<Emp> itr = set.iterator();
		
		while (itr.hasNext()) {
			Emp emp = itr.next();
			System.out.println(emp);
		}
		
	}

}
