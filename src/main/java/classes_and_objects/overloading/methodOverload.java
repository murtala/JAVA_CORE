package classes_and_objects.overloading;

public class methodOverload {

	// Demonstrate method overloading.

	void test() {
		System.out.println("No parameters");
	}

	// Overload test for one integer parameter.
	void test(int a) {
		System.out.println("a: " + a);
	}

	// Overload test for two integer parameters.
	void test(int a, int b) {
		System.out.println("a and b: " + a + " " + b);
	}

	// overload test for a double parameter
	double test(double a) {
		System.out.println("double a: " + a);
		return a * a;
	}

	double test(double a, double b) {
		System.out.println("double a: " + a);
		return a * a;
	}
	
	/* wrong same parameter , dirrefent return types
	int test(double a) {
		System.out.println("double a: " + a);
		return a * a;
	}  */
}

class Overload {
	public static void main(String args[]) {
		methodOverload ob = new methodOverload();
		double result;
		// call all versions of test()
		ob.test();
		ob.test(10);
		ob.test(10, 20);
		result = ob.test(123.2);
		System.out.println("Result of ob.test(123.2): " + result);
	}
}