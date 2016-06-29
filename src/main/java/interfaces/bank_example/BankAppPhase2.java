package interfaces.bank_example;
public  abstract class BankAppPhase2 implements BankAppPhase1 {

	//@Override
	//public abstract void withdraw(); 

	@Override
	public void deposit() {
		System.out.println("Deposit method 70% implementation");
	}

	@Override
	public void personalLoan() {
		System.out.println("personalLoan method 70% implementation");

	}

	//@Override
	//public abstract void homeLoan();
	

}
