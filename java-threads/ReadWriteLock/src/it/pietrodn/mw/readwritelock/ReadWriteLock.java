package it.pietrodn.mw.readwritelock;

public class ReadWriteLock {
	private boolean writeLocked = false;
	private int readLocks = 0;

	public synchronized void readLock() throws InterruptedException {
		while (writeLocked) {
			wait();
		}
		readLocks++;
	}

	/**
	 * Imperfect implementation: a thread holding a read lock cannot "upgrade"
	 * to a write lock, but has to release the read lock first.
	 * 
	 * @throws InterruptedException
	 */
	public synchronized void writeLock() throws InterruptedException {
		while (writeLocked || readLocks > 0) {
			wait();
		}
		writeLocked = true;
	}

	public synchronized void unlock() {
		if (writeLocked) {
			writeLocked = false;
			notifyAll();
		} else if (readLocks > 0) {
			readLocks--;
			notify(); // only 1 waiting process can acquire the write lock, so
						// notifyAll() is not needed.
		}
	}
}
