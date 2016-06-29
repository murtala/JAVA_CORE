package collections.vect;

import java.util.Iterator;
import java.util.Vector;

public class VectorDemo {
	
	public static void main(String[] args) {
		Vector<Emp> vect = new Vector<Emp>();

		Emp e1 = new Emp(10, "Srinu", "deve");
		Emp e5 = new Emp(10, "Srinu", "deve"); // e1 and e5 are the duplicate objects
		Emp e2 = new Emp(20, "viswam", "Lead");
		Emp e3 = new Emp(30, "Ramu", "mgr");
		Emp e4 = new Emp(40, "vasu", "CEO");
		
		
		vect.add(e1);
		vect.add(e2);
		vect.add(e3);
		vect.add(e4);
		
		//First approach
		for (int i = 0 ; i < vect.size(); i++) {
			Emp emp = (Emp)vect.get(i);
			System.out.println(emp);
		}
		
		//First approach
		Iterator<Emp> itr = vect.iterator();
		
		while (itr.hasNext()) {
			Emp emp = itr.next();
			System.out.println(emp);
		}
		
		
	}

}
