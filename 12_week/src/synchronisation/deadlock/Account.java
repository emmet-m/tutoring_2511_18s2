package synchronisation.deadlock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Represents a basic account with a balance.
 */
public class Account {
    double balance = 0.0;
    private Lock accountLock = new ReentrantLock();

    private void withdraw(double amount) {
        balance -= amount;
    }

    private void deposit(double amount) {
        balance += amount;
    }

    /**
     * Locks this account.
     */
    private void lock() {
        accountLock.lock();
    }

    /**
     * Unlocks this account.
     */
    private void unlock() {
        accountLock.unlock();
    }

    /**
     * Transfers an amount from the current account to a given account.
     * @param to Account to transfer to.
     * @param amount Amount to  transfer.
     */
    void transfer(Account to, double amount) {
        // To ensure the balance of the accounts do not change as we are transferring,
        // we lock both accounts before we do any withdrawals or deposits.
        // We then unlock both accounts after we are done.

        this.lock();
        to.lock();

        this.withdraw(amount);
        to.deposit(amount);

        to.unlock();
        this.unlock();
    }
}
