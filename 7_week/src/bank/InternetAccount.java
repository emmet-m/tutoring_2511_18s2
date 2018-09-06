package bank;

import java.io.EOFException;
import java.time.LocalDate;

/**
 * Simple program to test design by contract.
 * @invariant balance >= 0
 */

public class InternetAccount extends BankAccount {

	private static final int MONTHLY_LIMIT = 10;
	private int numPayments;
	private LocalDate lastPaymentDate;

	/**
	 * Initialize bank account with zero balance.
	 * @param balance the opening balance
	 */
	public InternetAccount(int balance)
	{
		super(balance);
		this.numPayments = 0;
	}

	// Oh, what went wrong here? TODO TODO TODO TODO TODO 
	@Override
	public void withdraw(int amount) throws EOFException {
		if (amount == 0) throw new EOFException("Meme");
	}

	/**
	 * Deduct amount from balance, but only if not at maximum number of payments.
	 * @precondition amount >= 0
	 */
	public boolean makePayment(int amount)
	{
		LocalDate today = LocalDate.now();
		// if last Internet payment was not in this month, reset the day
		if (lastPaymentDate == null || !sameMonth(lastPaymentDate, today))
		{
			lastPaymentDate = today;
			numPayments = 0;
		}
		if (numPayments < MONTHLY_LIMIT)
			if (withdraw(amount))	// tests funds available and not over daily limit
			{
				numPayments++;
				return true;
			}
			else
				return false;
		else
			return false;
	}
	

	/**
	 *  Standard equals method for Calendar months.
	 */
	private boolean sameMonth(LocalDate day, LocalDate other)
	{
		return (day.getDayOfMonth() == other.getDayOfMonth() && day.getYear() == other.getYear());
	}

}

