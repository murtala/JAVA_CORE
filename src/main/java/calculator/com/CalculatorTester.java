package calculator.com;

public class CalculatorTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Calculator c = new Calculator();
		int num1 = Calculator.add(5, 6);
		if (num1 == 11) {
			System.out.println("Add method true");
		}

		int num2 = c.substract(5, 2);

		if (num2 == 3) {
			System.out.println("substract method true");
		}

		int num3 = Calculator.multiply(8, 3);

		if (num3 == 24) {
			System.out.println("multiply method true");
		}

		int num4 = c.divide(4, 2);

		if (num4 == 2) {
			System.out.println("divide method true");
		}

	}

}
