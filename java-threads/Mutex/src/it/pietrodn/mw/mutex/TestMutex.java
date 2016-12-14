package it.pietrodn.mw.mutex;

import java.util.Random;

/**
 * Class to lock and unlock the mutex with random waits
 */
public class TestMutex extends Thread {

	private int id;
	private Mutex m;
	private int maxSleep;

	public TestMutex(int id, Mutex m, int maxSleep) {
		super();
		this.id = id;
		this.m = m;
		this.maxSleep = maxSleep;
	}

	@Override
	public void run() {
		sleepRandom(maxSleep);
		m.lock();
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
		System.out.printf("%d: sleeping for %d ms\n", id, time);
		sleep(time);
	}

	public static void main(String[] args) {
		final Mutex m = new Mutex();

		for (int i = 0; i < 5; i++) {
			new TestMutex(i, m, 500).start();
		}

	}
}
