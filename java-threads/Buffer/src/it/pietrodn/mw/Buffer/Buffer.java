package it.pietrodn.mw.Buffer;

public class Buffer {
	private final int N = 10;
	private int[] data;
	private boolean[] occupied; // whather the cell is empty or full
	private int[] readers; // how many readers waiting for the item
	private Object[] locks; // objects to lock the single elements

	public Buffer() {
		data = new int[N];
		readers = new int[N];
		occupied = new boolean[N];
		locks = new Object[N];
		for (int i = 0; i < locks.length; i++) {
			locks[i] = new Object();
		}
	}

	public int read(int pos) {
		synchronized (locks[pos]) {
			readers[pos]++;
			while (!occupied[pos]) {
				try {
					locks[pos].wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			readers[pos]--;
			locks[pos].notifyAll();
			return data[pos];
		}
	}

	public void write(int value, int pos) {
		synchronized (locks[pos]) {
			while (occupied[pos]) {
				try {
					locks[pos].wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			data[pos] = value;
			occupied[pos] = true;
			locks[pos].notifyAll();
		}
	}

	public int get(int pos) {
		synchronized (locks[pos]) {
			// wait for all readers to complete before "getting"
			while (!occupied[pos] || readers[pos] > 0) {
				try {
					locks[pos].wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			occupied[pos] = false;
			locks[pos].notifyAll();
			return data[pos];
		}
	}

}
