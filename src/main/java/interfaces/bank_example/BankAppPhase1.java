package interfaces.bank_example;
public interface BankAppPhase1 {

	public abstract void withdraw(); // if a method does not have implementation
										// then that method is called abstract
										// method
	// by default all thhe method in thhe abstract abstract class are abstract

	public abstract void deposit();

	public abstract void personalLoan();

	public abstract void homeLoan();
}
