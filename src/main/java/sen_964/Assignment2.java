package sen_964;

class Main {

	public static void main(String args[]) {
		double[] myArray = { 3.9, 8.2, 3.1, 3.5, 5.3 };
		int[] myArrayInt = { 9, 2, 4, 8, 5 };
		Q1 q1 = new Q1();
		Q2 q2 = new Q2();

		System.out.println("**** QUESTION 1");
		
		System.out.println("Original array:");
		
		for (int i = 0; i < myArray.length; i++) {
			 System.out.format("%.2f,", myArray[i]);
		}
		 
		// bubble sort
		q1.sort(myArray);

		System.out.println("");
		System.out.println("Output array:");
		
		for (int i = 0; i < myArray.length; i++) {
			 System.out.format("%.2f,", myArray[i]);
		}
		
		System.out.println("");
		
		System.out.println("**** QUESTION 2-1");
		System.out.println("Original array:");
		for (int i = 0; i < myArray.length; i++) {
			 System.out.format("%.2f,", myArray[i]);
		}
		
		// bubble sort

		q2.bubbleSort(myArray);

		System.out.println("");
		System.out.println("Output array:");

		for (int i = 0; i < myArray.length; i++) {
			 System.out.format("%.2f,", myArray[i]);
		}
		System.out.println("");
		
		
		System.out.println("**** QUESTION 2-2");

		// Question 2

		System.out.println("Original array:");
		for (int i = 0; i < myArrayInt.length; i++) {
			 System.out.format("%d,", myArrayInt[i]);
		}

		// bubble sort
		q2.bubbleSort(myArrayInt);

		System.out.println("");
		System.out.println("Output array:");
		System.out.format("%d, %d, ", myArrayInt[0], myArrayInt[1]);
		for (int i = 0; i < myArrayInt.length; i++) {
			 System.out.format("%d,", myArrayInt[i]);
		}

	}

	public static void sort(double[] myArray) {

		boolean exch = true;
		for (int j = 0; j < myArray.length; j++)
			for (int k = 1; k < (myArray.length - j); k++)
				if (myArray[k] < myArray[k - 1]) {
					double temp = myArray[k]; // exchange
					myArray[k] = myArray[k - 1];
					myArray[k - 1] = temp;
				}

		/*// bubble sort
		System.out.println("Original array:");
		//System.out.format("%.2f, %.2f, ", myArray[0], myArray[1]);
		for (int i = 0; i < myArray.length; i++) {
			 System.out.format("%.2f,", myArray[i]);
		}
		// bubble sort
		// bubbleSort();

		System.out.println("");
		System.out.println("Output array:");
		//System.out.format("%.2f, %.2f, ", myArray[1], myArray[0]);
		for (int i = 0; i < myArray.length; i++) {
			 System.out.format("%.2f,", myArray[i]);
		}*/
	}
}

class Q1 {
	public static void sort(double[] myArray) {

		boolean exch = true;
		for (int j = 0; j < myArray.length; j++)
			for (int k = 1; k < (myArray.length - j); k++)
				if (myArray[k] < myArray[k - 1]) {
					double temp = myArray[k]; // exchange
					myArray[k] = myArray[k - 1];
					myArray[k - 1] = temp;
				}
	}
}

class Q2 {

	// bubble sort
	public static void bubbleSort(int[] myArray) {
		boolean exch = true;
		for (int j = 0; j < myArray.length; j++)
			for (int k = 1; k < (myArray.length - j); k++)
				if (myArray[k] < myArray[k - 1]) {
					int temp = myArray[k]; // exchange
					myArray[k] = myArray[k - 1];
					myArray[k - 1] = temp;
				}
	}

	public static void bubbleSort(double[] myArray) {

		boolean exch = true;
		for (int j = 0; j < myArray.length; j++)
			for (int k = 1; k < (myArray.length - j); k++)
				if (myArray[k] < myArray[k - 1]) {
					double temp = myArray[k]; // exchange
					myArray[k] = myArray[k - 1];
					myArray[k - 1] = temp;
				}

	}
}

// }