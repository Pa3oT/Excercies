package main.thread.lesson1;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Operation1 {

    public static void main(String[] args) throws Exception {
        final Account account = new Account(1000);
        final Account account1 = new Account(2000);

        Executor executor =  Executors.newSingleThreadScheduledExecutor();

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    transfer1(account, account1, 500);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }).start();
        transfer1(account1, account, 300);
    }

    public static void transfer1(Account account, Account account1, int amount) throws Exception {
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        for(int i = 0; i < 10; i++) {
            executorService.submit(new Transfer(account, account1, i + 400));
        }

        executorService.shutdown();
        executorService.awaitTermination(10, TimeUnit.SECONDS);
    }
}
