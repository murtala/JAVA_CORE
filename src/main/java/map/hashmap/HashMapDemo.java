package map.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapDemo {
	
	public static void main(String[] args) {
		
		Emp emp1 = new Emp(10, "Srinu", "Developer");
		Emp emp2 = new Emp(20, "Deepesh", "Manager");
		Emp emp3 = new Emp(30, "Anu", "BA");
		Emp emp4 = new Emp(40, "Ramu", "Lead");
		
		
		HashMap<Integer, Emp> empMap = new HashMap<Integer, Emp>();
		
		empMap.put(emp1.getEmpno(), emp1);
		empMap.put(emp2.getEmpno(), emp2);
		empMap.put(emp3.getEmpno(), emp3);
		empMap.put(emp4.getEmpno(), emp4);
		
		
		Set<Integer> empSet = empMap.keySet();
		
		Iterator<Integer> itr = empSet.iterator();
		
		while (itr.hasNext()) {
			Integer key = itr.next();
			if (key >= 30 && key <= 40) {
				Emp empObj = empMap.get(key);
				
				
				System.out.println("key = " + key + ": Emp Object is " + empObj);
				
				
			}
			
		}
		
		
		
	}

}
