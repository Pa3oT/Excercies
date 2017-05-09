package main.thread.lesson1;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Transfer implements Callable<Boolean> {

    private Account account;
    private Account account1;
    private int amount;

    public Transfer(Account account, Account account1, int amount) {

        this.account = account;
        this.account1 = account1;
        this.amount = amount;
    }

    @Override
    public Boolean call() throws Exception {
        Lock lock = new ReentrantLock();
        lock.lock();

        if (account.getLock().tryLock(1, TimeUnit.SECONDS)) {
            try {
                if (account1.getLock().tryLock(1, TimeUnit.SECONDS)) {
                    try {
                        if (account.getBalance() < amount)
                            throw new Exception();
                        Thread.sleep(10000);
                        account.withdraw(amount);
                        account1.deposit(amount);
                        Thread.sleep(10000);
                        System.out.println("Transfer successful");
                    } finally {
                    }
                } else {
                    account1.incFailedTransferCount();
                }
                return true;
            } finally {
                lock.unlock();
            }
        } else {
            account.incFailedTransferCount();
        }
        return false;
    }
}
