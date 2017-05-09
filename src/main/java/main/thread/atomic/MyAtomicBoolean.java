package main.thread.atomic;

import java.util.concurrent.atomic.AtomicBoolean;

public class MyAtomicBoolean {
    static class ThreadSync {
        public static AtomicBoolean helloprintdone = new AtomicBoolean(false);

        public synchronized static void printHello() {
            if (helloprintdone.get() == true) {
                try {
                    ThreadSync.class.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            if (helloprintdone.get() == false) {
                System.out.print("Hello ");
                helloprintdone.set(true);
                ThreadSync.class.notifyAll();
            }
        }

        public synchronized static void printWorld() {
            if (helloprintdone.get() == false) {
                try {
                    ThreadSync.class.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            if (helloprintdone.get() == true) {
                System.out.print("World! ");
                helloprintdone.set(false);
                ThreadSync.class.notifyAll();
            }
        }
    }

    public static void main(String[] args) {
        new Thread() {
            public void run() {
                int i = 0;
                while ( i < 5){
                    MyAtomicBoolean.ThreadSync.printHello();
                    i++;
                }
            }
        }.start();
        new Thread() {
            public void run() {
                int i = 0;
                while (i < 5) {
                    MyAtomicBoolean.ThreadSync.printWorld();
                    i++;
                }
            }
        }.start();
    }
}
