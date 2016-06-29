package arrays;

public class arrays {

	public static void main(String[] args) {
//initialize array
		int[] array;
		int[] array1 = new int[9];
		int[] array2 = { 1, 2, 3, 4, 5 };

		String[] teams = { "Pac kmen", "Vikis", "Winners" };

		int[] startArray = { 11, 21, 31, 41, 51 };
		int[] finishArray = { 61, 71, 81, 91, 101, 111, 121, 131 };
		
		//copy array
		System.arraycopy(startArray, 0, finishArray, 0, startArray.length);

	}
}