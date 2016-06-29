package exercises.exercise6_11;

public class MyClass {
	public static void main(String[] args) {
		B b = new B("Test");
	}
}

class A {
	A() {
		this("1", "2");
	} // ????????????

	A(String s, String t) {
		this(s + t);
	}

	A(String s) {
		System.out.println(s);
	}
}

class B extends A {
	B(String s) {
		System.out.println(s);
	} // ????

	B(String s, String t) {
		this(t + s + "3");
	}

	B() {
		super("4");
	}
}
