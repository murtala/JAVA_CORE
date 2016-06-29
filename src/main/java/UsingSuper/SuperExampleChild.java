package UsingSuper;


public class SuperExampleChild extends SuperExampleParent {

	SuperExampleChild() {// constructor
		}

	public static void main(String[] args) {
		SuperExampleChild sec = new SuperExampleChild();
		sec.multiply();
	}

	public void multiply() {
		super.add();
	}

}
