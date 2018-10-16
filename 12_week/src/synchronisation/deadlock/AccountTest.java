package synchronisation.deadlock;

import org.junit.jupiter.api.Test;

class AccountTest {
    @Test
    void testTransfer() throws InterruptedException {
        Account first = new Account();
        Account second = new Account();

        // Create threads.
        AccountTransferrer firstToSecond = new AccountTransferrer(first, second);
        AccountTransferrer secondToFirst = new AccountTransferrer(second, first);

        Thread t1 = new Thread(firstToSecond);
        Thread t2 = new Thread(secondToFirst);

        t1.start();
        t2.start();

        t1.join();
        t2.join();
    }
}