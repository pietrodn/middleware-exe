package it.pietrodn.mw.mutex;

public class Mutex {

	/*
	 * No need to memorize the thread which locked. In the original pthread
	 * library, if a thread try to unlock a mutex held by another thread,
	 * behavior is undefined.
	 */

	private boolean locked = false;

	public synchronized void lock() {
		while (locked) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		locked = true;
	}

	public synchronized void unlock() {
		locked = false;
		notify();
	}

	public synchronized boolean tryLock() {
		if (locked) {
			return false;
		}
		locked = true;
		return true;
	}

}
