package main.thread.buffer;

public class Consumer implements Runnable {
	private final SingleElementBuffer buffer;

	public Consumer(SingleElementBuffer buffer) {
		this.buffer = buffer;
	}

	@Override
	public void run() {
		while (true) {
			try {
				Integer elem = buffer.get();
				System.out.println(elem + " consumed");
			} catch (Exception e) {
				System.out.println(Thread.currentThread().getName() + " stopped");
				return;
			}
		}
	}
}
