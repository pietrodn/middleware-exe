package it.pietrodn.mw.prioritymutex;

import java.util.PriorityQueue;

public class PriorityMutex {
	private boolean locked = false;
	private PriorityQueue<Integer> pq;

	public PriorityMutex() {
		// Max-heap
		this.pq = new PriorityQueue<>((x, y) -> y - x);
	}

	public synchronized void lock(int priority) throws InterruptedException {
		// Update priority of waiting threads
		pq.add(priority);
		// System.out.printf("Max priority: %d\n", pq.peek());
		while (locked || priority < pq.peek()) {
			wait();
		}
		locked = true;
		pq.remove();
	}

	public synchronized void unlock() {
		locked = false;
		notifyAll();
	}

	public synchronized boolean isLocked() {
		if (locked) {
			return true;
		} else {
			locked = true;
			return false;
		}
	}
}
