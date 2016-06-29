package assignments;

public class Palindrome {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int x[] = { 1, 2, 3, 4, 5 };
		int y[] = { 0, 0, 0, 0, 0 };
		// reverse the array
		for (int i = 0; i < x.length; i++) {
			int counter = x.length - i - 1;
			y[i] = x[counter];
			counter--;

		}
		for (int i = 0; i < x.length; i++) {
			System.out.print(x[i]);

		}
		System.out.println();
		for (int i = 0; i < x.length; i++) {
			System.out.print(y[i]);

		}
		
		
		
            
       
	}

}
