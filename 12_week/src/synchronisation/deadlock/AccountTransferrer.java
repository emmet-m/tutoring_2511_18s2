package synchronisation.deadlock;

/**
 * Thread which performs account transfers.
 */
public class AccountTransferrer implements Runnable {
    private Account from;
    private Account to;

    public AccountTransferrer(Account from, Account to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            from.transfer(to, 1);
        }
    }
}
