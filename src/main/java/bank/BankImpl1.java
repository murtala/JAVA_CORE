package bank;

public abstract class BankImpl1 extends BankImpl {

	@Override
	public void withDrar() {
		System.out.println("withDraw");
	}

	@Override
	public void carLoan() {
		System.out.println("carLoan");
	}
	
	public abstract void homeLoan();

}
