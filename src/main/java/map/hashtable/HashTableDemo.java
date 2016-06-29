package map.hashtable;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

public class HashTableDemo {
	

	
	public static void main(String[] args) {
		
		Emp emp1 = new Emp(10, "Srinu", "Developer");
		Emp emp2 = new Emp(20, "Deepesh", "Manager");
		Emp emp3 = new Emp(30, "Anu", "BA");
		Emp emp4 = new Emp(40, "Ramu", "Lead");
		
		
		Hashtable<Integer, Emp> hashtable = new Hashtable<Integer, Emp>();
		
		hashtable.put(emp1.getEmpno(), emp1);
		hashtable.put(emp2.getEmpno(), emp2);
		hashtable.put(emp3.getEmpno(), emp3);
		hashtable.put(emp4.getEmpno(), emp4);
		
		
		Set<Integer> empSet = hashtable.keySet();
		
		Iterator<Integer> itr = empSet.iterator();
		
		while (itr.hasNext()) {
			Integer key = itr.next();
			Emp empObj = hashtable.get(key);
			
			
			System.out.println("key = " + key + ": Emp Object is " + empObj);
			
		}
		
		
		
	}



}
