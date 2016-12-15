package it.pietrodn.mw.readwritelock;

public class ReadWriteLockTest {

	public static void main(String[] args) {
		final ReadWriteLock rwl = new ReadWriteLock();

		// Thread 1
		new Thread() {
			@Override
			public void run() {
				try {
					rwl.readLock();
					System.out.println("1: acquired read lock.");
					Thread.sleep(150);
					rwl.unlock();
					System.out.println("1: released read lock.");
					Thread.sleep(150);
					System.out.println("1: waiting for read lock.");
					rwl.readLock();
					System.out.println("1: acquired read lock.");
					rwl.unlock();
					System.out.println("1: released read lock.");
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}.start();

		// Thread 2
		new Thread() {
			@Override
			public void run() {
				try {
					rwl.readLock();
					System.out.println("2: acquired read lock.");
					Thread.sleep(100);
					rwl.unlock();
					System.out.println("2: released read lock.");
					Thread.sleep(150);
					System.out.println("2: waiting for read lock.");
					rwl.readLock();
					System.out.println("2: acquired read lock.");
					rwl.unlock();
					System.out.println("2: released read lock.");
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}.start();

		// Thread 3
		new Thread() {
			@Override
			public void run() {
				try {
					System.out.println("3: waiting for write lock.");
					rwl.writeLock();
					System.out.println("3: acquired write lock.");
					Thread.sleep(500);
					rwl.unlock();
					System.out.println("3: released write lock.");
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}.start();

	}

}
