package calculator.com;

import java.util.Scanner;

public class Calculator {


	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter 1st Digit");
		int num1 = sc.nextInt();
		System.out.println(" Enter 2nd Digit");
		int num2 = sc.nextInt();
		System.out.println("Choose an operation +, - , /");

		String choice = null;

		//while (choice.equalsIgnoreCase("exit")) {
			choice = sc.next();

			switch (choice) {
			case "+":
				add(num1, num2);
				break;
			case "-":
				substract(num1, num2);
				break;
			case "/":
				divide(num1, num2);
				break;
			case "*":
				add(num1, num2);
				break;
			default:
				System.out.println("Wrong sign ");
				break;
			}
			//System.out.println("Enter");
		}
	//}

	public static int add(int num1, int num2) {
		int sum = num1 + num2;
		System.out.println(num1 + "+" + num2 + " = " + sum);

		return sum;
	}

	public static int substract(int num1, int num2) {
		int res = num1 - num2;
		System.out.println(num1 + "-" + num2 + " = " + res);
		return res;
	}

	public static int divide(int num1, int num2) {
		int res2 = num1 / num2;
		System.out.println(num1 + "/" + num2 + " = " + res2);
		return res2;
	}
	
	public static int multiply(int num1, int num2) {
		int res2 = num1 * num2;
		System.out.println(num1 + "x" + num2 + " = " + res2);
		return res2;
	}

}
