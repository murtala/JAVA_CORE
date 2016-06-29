package samples;

public class FactorialExample {
	public static void main(String[] args) {	
		
		int n = 7;
		 int result = Factorial(n);
		
		System.out.println("factorial of : " + n + " is " + result);
	}

	private static int Factorial(int n) {
		if (n == 0)
			return 1;
		else
		return n * Factorial(n-1);
	}
}
