package inheritanceParent;

public class Phone {
	public int number = 22;
	public String model="Apple";

	public void dial(int a) {
		System.out.println("Dialing "+ a + " ..." );
	}

	public void receive() {
		System.out.println("Receving");
	}

	private void alarm() {
		System.out.println("Ringing");
	}
}
