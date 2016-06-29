package accessModifiers1;

public class InPackage {

	public static void main(String[] args) {
		AccessModifer am = new AccessModifer();
		System.out.println(am.st1);// a is public
		//System.out.println(am.st2);//b is private, not accessible
		System.out.println(am.st3);//c is protected
		System.out.println(am.st4);// default 
	}

}
