package lecture_3;

// use Interface to find a biggest one
import java.util.Random;

import lecture_3.Person.Comparab;

public class Lec3_8 {

	public static void main(String[] x) {
		//int a[][] = new int[3][];
		int a[] = {1,2,053, 4};
		int b[][]= {{1,2,4}, {2,2,1},{0,43,2}};
		//a[1] = new int[]{1,2,3};
		//a[2]= new int[]{4,5};
		//System.out.println(a[1][1]);
	//	int c[]={1,2,3,4};
		System.out.println(a[2] == b[2][1]);
		
		//Person[] persAr = new Person[4];
		/*persAr[0] = new Person("John", 19800220, 76);
		persAr[1] = new Person("Susan", 19821123, 66.5f);
		persAr[2] = new Person("James", 19780215, 76);
		persAr[3] = new Person("Gilbert", 19830503, 66.5f);
*/
	//	int m = findBiggest(persAr);
	//	System.out.printf("biggest %d\n", m);
	}

	// This method is written so that it can find the biggest
	// in an array of Comparab
	static int findBiggest(Comparab[] c) {
		int loc = 0;
		for (int k = 0; k < c.length; k++)
			if (c[loc].smaller(c[k])) // particular syntax is unimportant
				loc = k;
		return loc;
	}

}

class Person {

	public Person(String string, int i, int j) {
		
	}

	public Person(String string, int i, float f) {
		
	}
	
	
	class Comparab {

		public boolean smaller(Comparab comparab) {
			
			return false;
		}
		
	}
}
