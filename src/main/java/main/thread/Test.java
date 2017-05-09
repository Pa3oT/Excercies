package main.thread;

public class Test {
    public static void main(String[] args) {
        ThreadDemo1 T1 = new ThreadDemo1();
        ThreadDemo2 T2 = new ThreadDemo2();
        ThreadDemo3 T3 = new ThreadDemo3();
        T1.start();
        T2.start();
        T3.start();
        try {
            T1.join();
            T2.join();
            T3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static class ThreadDemo1 extends Thread {
        public void run() {
            //System.out.println("T1 J = " +  Util.convertJ());
            System.out.println("T1 I = " + Util.convertI());
        }
    }

    private static class ThreadDemo2 extends Thread {
        public void run() {
            //System.out.println("T2 I = " + Util.convertI());
            System.out.println("T2 J = " + Util.convertJ());
        }
    }

    private static class ThreadDemo3 extends Thread {
        public void run() {
            //System.out.println("T2 I = " + Util.convertI());
            Util util = new Util();
            System.out.println("T3 K = " + util.convertK());
        }
    }
}

class Util {
    public static int i = 1;
    public static int j = 1;
    public static int k = 1;

    public static int convertI() {
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return i = i + 1;
    }

    public synchronized static int convertJ() {
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return j = j + 1;
    }

    public synchronized static int convertK() {
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return k = k + 1;
    }
}


