package classes_and_objects.classes.accessModifiers1;

public class AccessModifer {

	public String st1 = "public";
	private String st2 = "private";
	protected String st3 = "protected";
	String st4 = "default";
static int a=2;
	public static void main(String[] args) {
		AccessModifer am = new AccessModifer();
		am.testAccessMoodifier();
		
		System.out.println(am.st1);
		System.out.println(am.st2);
		System.out.println(a);
	}

	public void testAccessMoodifier() {

		System.out.println(st1);
		System.out.println(st2);
		System.out.println(st3);
		System.out.println(st4);
		System.out.println(a);

	}

}
