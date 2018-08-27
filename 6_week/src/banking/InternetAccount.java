package banking;

public class InternetAccount extends BankAccount {

	int numPaymentsThisMonth;
	
	public InternetAccount(float startingBalance) {
		super(startingBalance);
		numPaymentsThisMonth = 0;
	}
	
	public void makeInternetPayment() {
		// TODO
	}
}
