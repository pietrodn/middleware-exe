package it.pietrodn.mw.Buffer;

public class Buffer {
	private final int N = 10;
	private int[] data;
	private boolean[] occupied; // whather the cell is empty or full
	private int[] readers; // how many readers waiting for the item
	
	public Buffer() {
		data = new int[N];
		readers = new int[N];
		occupied = new boolean[N];
	}
	
	public synchronized int read(int pos) {
		readers[pos]++;
		while(!occupied[pos]) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		readers[pos]--;
		notifyAll();
		return data[pos];
	}
	
	public synchronized void write(int value, int pos) {
		while(occupied[pos]) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		data[pos] = value;
		occupied[pos] = true;
		notifyAll();
	}
	
	public synchronized int get(int pos) {
		// wait for all readers to complete before "getting"
		while(!occupied[pos] || readers[pos] > 0) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		occupied[pos] = false;
		notifyAll();
		return data[pos];
	}
	
}
