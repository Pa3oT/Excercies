package main.thread.synchronazedBlock;

import static java.lang.System.currentTimeMillis;

public class SynchBlock {
	public static void main(String[] args) {
		Thread thread1 = new Thread(new Runnable() {
			@Override
			public void run() {
				hello(1);
			}
		});
		Thread thread2 = new Thread(new Runnable() {
			@Override
			public void run() {
				hello(2);
			}
		});
		thread1.start();
		thread2.start();
	}

	private synchronized static void hello(int id) {
		System.out.println(id + "  : * - wait - sleep, " + currentTimeMillis());
		try {
			SynchBlock.class.wait(3000);
		} catch (InterruptedException ignore) {/*NOP*/}
		System.out.println(id + "  : wait - * - sleep, " + currentTimeMillis());
		try {
			Thread.sleep(3000);
		} catch (InterruptedException ignore) {/*NOP*/}
		System.out.println(id + "  : wait - sleep  - *, " + currentTimeMillis());
		/*
	2 - i'm block before
	1 - i'm block before
	*/
	}

	private static void hello1(int id) {
		System.out.println(id + " - i'm block before");
		synchronized (SynchBlock.class) {
			System.out.println(id + " i'm block after");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException ignore) {/*NOP*/}
		}
	}
}
