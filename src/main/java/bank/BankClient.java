
public class BankClient {
	
	public static void main(String[] args) {
		
		
		BankImpl2  b1 = new BankImpl2();
		
		b1.depisit();
		b1.homeLoan();
		
		Bank b2 = new BankImpl2();// A interface reference variable can hold the child class object.
		// By using this reference variable you can not call the child class specific methods
		
		b2.depisit();
		//b2.homeLoan();
		
		
		
		
	}

}
