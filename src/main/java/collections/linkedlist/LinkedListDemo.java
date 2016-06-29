package collections.linkedlist;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
	
	public static void main(String[] args) {
		List<Emp> empList = new LinkedList<Emp>();
		
		
		Emp e1 = new Emp(10, "Srinu", "deve");
		Emp e5 = new Emp(10, "Srinu", "deve"); // e1 and e5 are the duplicate objects
		Emp e2 = new Emp(20, "viswam", "Lead");
		Emp e3 = new Emp(30, "Ramu", "mgr");
		Emp e4 = new Emp(40, "vasu", "CEO");
		
		empList.add(e1);
		empList.add(e2);
		empList.add(e3);
		empList.add(e4);
		empList.add(e5);
		
		for(int i = 0; i < empList.size(); i++) {
			System.out.println(empList.get(i));
		}
		
		
		
	}

}
