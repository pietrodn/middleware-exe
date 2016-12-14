package it.pietrodn.mw.barrier;

import java.util.LinkedList;
import java.util.List;

public class Barrier {

	private int nThreads;
	private int nArrived = 0;
	private List<Thread> threads;

	public Barrier(int n) {
		this.nThreads = n;
		this.threads = new LinkedList<>();
	}

	public synchronized void await() throws InterruptedException {
		nArrived++;
		this.threads.add(Thread.currentThread());
		notifyAll();
		System.out.println("Waiting..");
		while (nArrived < nThreads) {
			wait();
		}
	}

	public synchronized void interrupt() {
		this.threads.forEach(thr -> thr.interrupt());
	}

	public static void main(String[] args) {
		Barrier b;

		System.out.println("\n\nTesting the barrier without interrupt...");
		b = new Barrier(5);
		testBarrier(b, 5, 1000);
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}

		System.out.println("\n\nTesting the barrier with interrupt...");
		b = new Barrier(5);
		testBarrier(b, 5, 2000);
		final Barrier bf = b;
		new Thread() {
			@Override
			public void run() {
				try {
					Thread.sleep(500);
					System.out.println("Interrupting!");
					bf.interrupt();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}.start();

	}

	public static void testBarrier(Barrier b, int n, int delay) {
		for (int i = 0; i < n; i++) {
			final int j = i;
			new Thread() {
				@Override
				public void run() {
					System.out.printf("%d: start\n", j);
					try {
						b.await();
						Thread.sleep(delay);
						System.out.printf("%d: after barrier\n", j);
					} catch (InterruptedException e) {
						System.out.printf("%d: interrupted!\n", j);
					}
				}
			}.start();
		}
	}

}
