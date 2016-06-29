package assignments;

import java.util.Scanner;

public class DuplicateNumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		
		
		int[] number = new int[10];
		int[] outnum = new int[10];
		int l = 0;
		int k;
		int count=0;
		int newNum[]= {3,3,5,4,2,3,1,65,788};

		Scanner scan = new Scanner(System.in);
		for(int i = 0; i < newNum[i]; i++) {
		  k = 0;
		  while (k < l) {
			 if(newNum[i] == outnum[k]) { // check if already there
				l--;
				count++;
				break;	  // no need to check the other
			 }
			 k++;
		  }
		  outnum[k] = newNum[i]; //Either overwrites or adds a new number in the end of the array.
		  l++;
		}
		for (int j= 0; j < l; j++)
			  System.out.println(outnum[j] +" - "+ count  );

	}

}
