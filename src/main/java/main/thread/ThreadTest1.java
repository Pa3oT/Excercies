package main.thread;

import java.util.concurrent.atomic.AtomicBoolean;

public class ThreadTest1 {
    public static int i;
    public static AtomicBoolean trigger;

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
				for(int i = 1; i < 10; i ++) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("Thread1");
                }
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 0; i < 10; i ++) {
                    System.out.println("Thread2");
                }
            }
        });
        t1.start();
        t2.start();
        System.out.println(i);
    }
}