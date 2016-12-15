package it.pietrodn.mw.softsyncarray;

public class SoftSyncArray {
	private Object[] values;
	private long[] timestamps;
	private long[] leases;
	private GarbageCollector gc;

	public SoftSyncArray(int size) {
		this.values = new Object[size];
		this.timestamps = new long[size];
		this.leases = new long[size];

		for (int i = 0; i < size; i++) {
			timestamps[i] = 0;
			leases[i] = 1000;
		}

		this.gc = new GarbageCollector();
		gc.start();
	}

	public synchronized void put(Object value, int pos, int lease) {
		values[pos] = value;
		leases[pos] = lease * 1000;
		timestamps[pos] = unixTime();
		notifyAll();
	}

	public synchronized Object get(int pos) throws InterruptedException {
		while (values[pos] == null || timestamps[pos] + leases[pos] < unixTime()) {
			// if the value is unavailable or expired, wait
			wait();
		}
		return values[pos];
	}

	public static long unixTime() {
		return System.currentTimeMillis();
	}

	class GarbageCollector extends Thread {
		@Override
		public void run() {
			while (true) {
				for (int i = 0; i < values.length; i++) {
					synchronized (SoftSyncArray.this) {
						if (timestamps[i] != 0 && timestamps[i] + leases[i] < SoftSyncArray.unixTime()) {
							values[i] = null;
							timestamps[i] = 0;
							System.out.printf("GC [%d]: cleaning position %d\n", SoftSyncArray.unixTime() % 10000000,
									i);
						}
					}
				}
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

}
