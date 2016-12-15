package it.pietrodn.mw.softsyncarray;

public class SyncArrayTest {

	public static void main(String[] args) {
		final SoftSyncArray ssa = new SoftSyncArray(5);

		// Thread 1
		new Thread() {
			@Override
			public void run() {
				try {
					Thread.sleep(500);
					System.out.printf("A [%d]: Putting 1 (lease %d)\n", relTime(), 1);
					ssa.put("1", 0, 1);
					Thread.sleep(2000);
					System.out.printf("A [%d]: Putting 2 (lease %d)\n", relTime(), 5);
					ssa.put("2", 0, 5);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}.start();

		// Thread 2
		new Thread() {
			@Override
			public void run() {
				try {
					System.out.printf("B [%d]: waiting for element\n", relTime());
					Object x = ssa.get(0);
					System.out.printf("B [%d]: got element %s\n", relTime(), x);
					Thread.sleep(2000);
					System.out.printf("B [%d]: waiting for element\n", relTime());
					x = ssa.get(0);
					System.out.printf("B [%d]: got element %s\n", relTime(), x);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}.start();
	}

	public static long relTime() {
		// Short representation of Unix time for debugging
		return System.currentTimeMillis() % 10000000;
	}

}
