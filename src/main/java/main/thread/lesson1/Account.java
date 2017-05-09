package main.thread.lesson1;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Account {
    private int balance;
    private Lock lock;
    private AtomicInteger failCounter = new AtomicInteger();

    public Account(int balance) {
        this.balance = balance;
        this.lock = new ReentrantLock();
    }

    public void incFailedTransferCount() {
        failCounter.incrementAndGet();
    }

    public void withdraw(int amount) {
        balance -= amount;
    }

    public void deposit(int amount) {
        balance += amount;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public Lock getLock() {
        return lock;
    }

    public void setLock(Lock lock) {
        this.lock = lock;
    }

    public int getFailCounter() {
        return failCounter.get();
    }
}
