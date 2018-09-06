package bank;

import java.io.EOFException;
import java.time.LocalDate;

/**
 * Simple program to test design by contract.
 * @invariant balance >= 0
 */

public class BankAccount {

	private int balance;
	private static final int WITHDRAW_LIMIT = 800;
	private int todayWithdrawal;
	private LocalDate lastWithdrawal;

	/**
	 * Initialize bank account with zero balance.
	 * @param balance the opening balance
	 */
	public BankAccount(int balance)
	{
		this.balance = balance;
		this.todayWithdrawal = 0;
	}

	/**
	 * Add amount to balance.
	 * @precondition amount >= 0
	 */
	public void deposit(int amount)
	{
		balance += amount;
	}

	/**
	 * Deduct amount from balance, but only if sufficient funds and not over daily limit.
	 * @throws InsufficientBalanceException 
	 * @precondition amount >= 0
	 */
	public void withdraw(int amount) throws InsufficientBalanceException, EOFException
	{
		LocalDate today = LocalDate.now();

		// if last withdrawal was not on this day, reset the withdrawn amount
		if (lastWithdrawal == null || !sameDay(lastWithdrawal, today))
			todayWithdrawal = 0;
		// allow withdrawal only if sufficient funds and amount will not cause going over daily limit
		if (amount > balance || todayWithdrawal + amount > WITHDRAW_LIMIT) {
			throw new InsufficientBalanceException();
		}
		else
		{
			// finally, allow withdrawal and update balances
			balance -= amount;
			todayWithdrawal += amount;
			lastWithdrawal = today;
		}
	}

	/**
	 * Used for testing only!
	 * Necessary if amount <= balance is a precondition of withdraw, but not needed here.
	 */
	public int getBalance()
	{
		return balance;
	}
	
	/** 
	 * Reset last withdrawal day and also reset withdrawn amount to zero but only if day changes.
	 * Used for testing only!
	 */
	public void setDay(LocalDate c)
	{
		if (!c.equals(lastWithdrawal))
		{
			lastWithdrawal = c;
			todayWithdrawal = 0;
		}
	}

	/**
	 * Standard equals method for Calendar days.
	 */
	private boolean sameDay(LocalDate lastWithdrawal2, LocalDate today)
	{
		return lastWithdrawal2.equals(today);
	}
		
}
