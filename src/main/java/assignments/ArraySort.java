package assignments;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

/**
 * @author Namata Murtala
 * 
 */
public class ArraySort {

	static int[] intArray = { 7, 1, 2, 0, 9,4, 8, 5, 3, 4, 2 };
	static int temp = 0; // hold temporary varialble

	public static void main(String[] args) {
		/*
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter 1st Digit");
		int num1 = sc.nextInt();
		System.out.println(" Enter 2nd Digit");
		int num2 = sc.nextInt();
		System.out.println("Choose an operation +, - , /");
		String choice = sc.next();
		String key="";
		switch (key) {
		case value:
			
			break;

		default:
			break;
		}*/
		
		System.out.println("-------------Sort-------------------");
		//SortIntArray();
		System.out.println("\n------------Print Odd Numberss-------------");
		//PrintOddNumbers();
		System.out.println("\n------------Move even # to beginning-------");
		//MoveToBeginning();
		System.out.println("\n------------Print duplicates----------------");
		PrintDuplicates();
		System.out.println("\n-------------Check Fibonnaci-------------------");
		CheckFibo();
		System.out.println("\n-------------Check Palindrome----------");
		CheckPalin();
		System.out.println("\n---------Check String unique words----------");
		UniStrWrds();
		System.out.println("\n-------------Reverse String-------------------");
		RevString();
		System.out.println("\n----------String Words reverse---------");
		RevWords();
		System.out.println("\n-------------Write to a file in reverse--------");
		revStrFile();
		System.out.println("\n-------JDBC select and Update-------");
		JDBCselUpdt();

	}

	private static void JDBCselUpdt() {

		// connect to data base
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (Exception e) {
		}

		Connection connection = null;

		try {
			connection = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/test", "root", "admin");

		} catch (Exception e) {

		}

		// execute the statements
		try {
			Statement stmt = connection.createStatement();
			stmt.executeQuery("select * from Students");
			stmt.execute("UPDATE Students  SET STUDENT_NAME = 'Namata' ");
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	private static void revStrFile() {

		BufferedReader br = null;

		try {

			// String line;

			br = new BufferedReader(new FileReader(
					"F:\\Users\\Mobile\\Downloads\\inputFile.txt"));
			String line = br.readLine();

			System.out.println(line);

			BufferedWriter out = new BufferedWriter(new FileWriter(
					"F:\\Users\\Mobile\\Downloads\\ouputFile.txt"));
			out.write("Writing to test ....");
			out.close();

		} catch (IOException e) {
		} finally {
			try {
				if (br != null)
					br.close();
			} catch (IOException ex) {
			}
		}

	}

	private static void RevWords() {

		String phrase = "My Name is Namata .";
		String rev = "";
		
		for (int i = phrase.length() - 1; i >= 0; i--) {
			rev = rev + phrase.charAt(i);
		}

		System.out.println("Reversed words ->: " + rev);
	}
//
	private static void RevString() {
		try {
			String phrase = "My Name is Namata .";
			String[] words = phrase.split(" "); // splits the string using spaces
			for (int i = 0; i < words.length; i++) {
				StringBuffer sb = new StringBuffer(words[i]);
				
				sb.reverse().toString();
				System.out.print(" " + sb);

			}

		} catch (Exception e) {

		}

	}

	private static void UniStrWrds() {
		try {
			String phrase = "My Name is Namata .";
			String[] words = phrase.split(" ");
			for (int i = 0; i < words.length; i++) {
				if (words[i].equalsIgnoreCase(words[i + 1])) {
				} else {
					System.out.print(words[i] + " ");
				}
			}
			System.out.println("Are unique");

		} catch (Exception e) {

		}

	}

	private static void CheckPalin() {
		int[] y = new int[15];

		// reverse the array
		for (int i = 0; i < intArray.length; i++) {
			int counter = intArray.length - i - 1;
			y[i] = intArray[counter];
			counter--;

		}

		System.out.println();
		for (int i = 0; i < intArray.length; i++) {
			System.out.print(y[i]);

		}
		// compare the 2 arrays
		System.out.println();

		for (int i = 0; i < intArray.length; i++) {
			if (y[i] != intArray[i]) {
				System.out.println(" Not Palindrome");

			}
		}

	}

	private static void CheckFibo() {
		System.out.println();
		System.out.println("Check Fibonnaci");
		boolean dup = false;

		try {
			for (int i = 0; i < intArray.length; i++) {
				if ((intArray[i] + intArray[i + 1] == intArray[i + 2])) {
					System.out.println("Fibonacci serie");
				} else
					System.out.println(" Not a Fibonacci serie ");
			}
		} catch (Exception e) {
			// System.out.println("Array reached maxim");
		}
	}

	private static void PrintDuplicates() {
		System.out.println("Duplicate numbers");
		int count = 0;

		// find duplicates
		for (int i = 0; i < intArray.length; i++) {
			boolean dup = false;
//count >=2 and i<j
			for (int j = 0; j < i; j++) {
				if (intArray[i] == intArray[j]) {
					//dup = true;
					count++;
					
				}
				System.out.println(intArray[i] + " occurences " + count
						);
				/*if (dup) {
					count++;
					System.out.print(intArray[i] + " Occur(s) \n " + count
							+ " Time(s)");

				}*/

			}

		}
	}

	private static void MoveToBeginning() {
		for (int i = 0; i < intArray.length; i++) {

			for (int j = i + 1; j < intArray.length; j++) {
				if (intArray[i] % 2 != 0) {
					// swap the contents
					temp = intArray[i];
					intArray[i] = intArray[j];
					intArray[j] = temp;
				}
			}
		}

		// move even numbers to begining of array
		System.out.println();
		System.out.println("Move even numbers at beginning");
		for (int i = 0; i < intArray.length; i++) {
			System.out.print(intArray[i] + " ");
		}

	}

	private static void PrintOddNumbers() {
		// print odd numbers
		System.out.println();
		System.out.println("Odd Numbers form array");
		for (int i = 0; i < intArray.length; i++) {
			if (intArray[i] % 2 != 0) {
				System.out.print(intArray[i] + " ");
			}
		}
	}

	private static void SortIntArray() {
		System.out.println("Original Array");
		// print content of the array
		for (int i = 0; i < intArray.length; i++) {
			System.out.print(" " + intArray[i]);
		}
		System.out.println();
		System.out.println("Sorted Array");
		/* Sort the array */
		for (int i = 0; i < intArray.length; i++) {

			for (int j = i + 1; j < intArray.length; j++) {
				if (intArray[i] < intArray[j]) {
					// swap the contents
					temp = intArray[i];
					intArray[i] = intArray[j];
					intArray[j] = temp;
				}
			}
		}
		// print content of the sorted array
		for (int i = 0; i < intArray.length; i++) {
			System.out.print(" " + intArray[i]);

		}
	}
}
