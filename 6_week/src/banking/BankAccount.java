package banking;

import java.time.LocalDateTime;

/**
 * Class invariant:
 *  balance >= 0
 *  amountWithdrawnToday <= 800
 */
public class BankAccount {
	
	// Invariant: 
	private float balance;
	private LocalDateTime today;
	private float amountWithdrawnToday;
	
	
	//
	//
	// TODO: How to generate javadoc
	//
	//

	/**
	 * A sample javadoc comment!
	 * 
	 * This constructor does blah blaaaah!
	 * @param startingBalance
	 */
	public BankAccount(float startingBalance) {
		this.balance = startingBalance;
		this.today = LocalDateTime.now();
		this.amountWithdrawnToday = 0;
	}
	
	/**
	 * @pre  amount > 0
	 * @post true/false if the withdrawal was successful; Class invariant is maintained
	 * @param amount
	 * @return
	 */
	public boolean withdraw(int amount) {
		
		if (this.today.getDayOfMonth() != LocalDateTime.now().getDayOfMonth()) {
			this.today = LocalDateTime.now();
		}

		if (!(this.today.getDayOfMonth() == LocalDateTime.now().getDayOfMonth()
				&& this.amountWithdrawnToday + amount <= 800)) {
			return false;
		}
		
		if (this.balance - amount >= 0) {
			this.balance -= amount;
			return true;
		}
		

		return false;
	}
	
	public void deposit(int amount) {
		// TODO
	}
}
