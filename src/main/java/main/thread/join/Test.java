package main.thread.join;

public class Test {

    public static void main(String[] args) throws InterruptedException{
        System.out.println("1 start");
        Thread thread = new Thread() {
            @Override
            public void run() {
                System.out.println("2 start");
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("2 end");
            }
        };
        thread.start();
        System.out.println("Middle");
        thread.join();
        System.out.println("1 end");
    }

}
