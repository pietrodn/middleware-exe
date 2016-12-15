package it.pietrodn.mw.prioritymutex;

import java.util.Random;

/**
 * Class to lock and unlock the Priority with random waits. It uses the id as
 * priority.
 */
public class TestPriorityMutex extends Thread {

	private int id;
	private PriorityMutex m;
	private int maxSleep;

	public TestPriorityMutex(int id, PriorityMutex m, int maxSleep) {
		super();
		this.id = id;
		this.m = m;
		this.maxSleep = maxSleep;
	}

	@Override
	public void run() {
		sleepRandom(maxSleep);
		System.out.printf("%d: waiting on lock\n", id);
		try {
			m.lock(id);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.printf("%d: LOCKED\n", id);
		sleepRandom(maxSleep);
		m.unlock();
		System.out.printf("%d: UNLOCKED\n", id);
	}

	/**
	 * Sleeps for millis milliseconds
	 * 
	 * @param millis
	 *            milliseconds to sleep to
	 */
	private void sleep(int millis) {
		try {
			Thread.sleep(millis);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Sleeps for a random amount of milliseconds between 0 and maxMillis
	 * 
	 * @param maxMillis
	 *            the maximum time to sleep
	 */
	private void sleepRandom(int maxMillis) {
		int time = new Random().nextInt(maxMillis);
		// System.out.printf("%d: sleeping for %d ms\n", id, time);
		sleep(time);
	}

	public static void main(String[] args) {
		final PriorityMutex m = new PriorityMutex();

		for (int i = 0; i < 5; i++) {
			new TestPriorityMutex(i, m, 500).start();
		}

	}
}
