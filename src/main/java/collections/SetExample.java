package collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		
		Set<Integer> hst = new HashSet<Integer>();
		
			hst.add(1);
			hst.add(2);
			hst.add(1);
			System.out.println(hst);
		
			Set<Integer> tst = new TreeSet();
			tst.add(3);
			tst.add(1);
			tst.add(6);
			tst.add(9);
			System.out.println(tst);
			
	}

}
