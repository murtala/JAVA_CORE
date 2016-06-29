package collections.sortedset;

import java.util.Comparator;

public class MyComparator implements Comparator<Emp> {

	@Override
	public int compare(Emp emp1, Emp emp2) {
		
		if(emp1.getNo() > emp2.getNo()) {
			return 1;
		} else if(emp1.getNo() < emp2.getNo()) {
			return -1;
		} else {
			return 0;
		}
		
		
	}

}
