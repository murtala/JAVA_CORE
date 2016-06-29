package collections;

import java.util.HashMap;
import java.util.Iterator;

public class MapExample {	
	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1, "User 1");
		hm.put(4, "User 2");
		hm.put(2, "User 4");
		hm.put(3, "User 0");
		
	//	Iterator it = (Iterator) hm.entrySet();
		
		Iterator it = (Iterator) hm.entrySet().iterator();
		
		System.out.println(hm.keySet()  );
		System.out.println(hm.values());
		System.out.println(hm);
		
	/*	while(it.hasNext()){
			Object o =it.next();
				}
	*/	
		
		
		//it.hasNext();
		//it.next();
	}

}
