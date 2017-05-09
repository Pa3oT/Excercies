package main.thread.lesson1;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Operations {
    public static void main(String[] args) throws Exception {
        final Account account = new Account(1000);
        final Account account1 = new Account(2000);

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    transfer(account, account1, 500);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }).start();
        transfer(account1, account, 300);
    }

    public static void transfer(Account account, Account account1, int amount) throws Exception {
        Lock lock = new ReentrantLock();
        lock.lock();

        if (account.getLock().tryLock(1, TimeUnit.SECONDS)) {
            try {
                if (account1.getLock().tryLock(1, TimeUnit.SECONDS)) {
                    try {
                        if (account.getBalance() < amount)
                            throw new Exception();
                        Thread.sleep(1000);
                        account.withdraw(amount);
                        account1.deposit(amount);
                        System.out.println("Transfer successful");
                    } finally {

                    }
                } else {
                    account1.incFailedTransferCount();
                }
            } finally {
                lock.unlock();
            }
        } else {
            account.incFailedTransferCount();
        }
    }
}
