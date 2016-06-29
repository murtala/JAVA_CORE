package accessModifiers2;

import accessModifiers1.AccessModifer;

public class OutsidePackage {

	public static void main(String[] args) {
		AccessModifer am = new AccessModifer();
		System.out.println(am.st1); // a is public, so its aceesible outside
	//	System.out.println(am.st2); // b is private, not accessible
	//	System.out.println(am.st3); // c is protected, not accessible
	//	System.out.println(am.st4); // d is default, not accessible
	}
}