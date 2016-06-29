package interfaces.bank_example;
public class BankClient {

	public static void main(String[] args) {
		BankAppPhase1 a = new BankAppPhase4();
		BankAppPhase2 b = new BankAppPhase4();
		BankAppPhase3 c = new BankAppPhase4();
		BankAppPhase4 d = new BankAppPhase4();
		
		
		
		a.deposit();
		a.withdraw();
		a.personalLoan();
		a.homeLoan();
		
		b.deposit();
		b.withdraw();
		b.personalLoan();
		b.homeLoan();
		
		c.deposit();
		c.withdraw();
		c.personalLoan();
		c.homeLoan();
		
		d.deposit();
		d.withdraw();
		d.personalLoan();
		d.homeLoan();
		

	}
}
