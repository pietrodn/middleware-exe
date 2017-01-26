package it.pietrodn.mw.mapper;

import java.util.LinkedList;
import java.util.Queue;

public class PartialMapper extends Thread {

	// ProcItem represent a couple (int, Processor) to process
	class ProcItem {
		private int val;
		private Processor p;

		public ProcItem(int val, Processor p) {
			this.val = val;
			this.p = p;
		}

		// Method to get the processed value
		public int getResult() {
			return p.process(val);
		}
	}

	Processor proc;

	// Queues for inputs and output
	Queue<ProcItem> inQueue;
	Queue<Integer> results;

	public PartialMapper() {
		inQueue = new LinkedList<ProcItem>();
		results = new LinkedList<Integer>();
	}

	public synchronized void addElement(int e, Processor p) {
		inQueue.add(new ProcItem(e, p));
		notifyAll();
	}

	@Override
	public void run() {
		while (true) {
			synchronized (this) {

				// Waits for elements in the buffer and processes them
				while (inQueue.isEmpty()) {
					try {
						wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				while (!inQueue.isEmpty()) {
					results.add(inQueue.poll().getResult());

					// Notify after each processed item to allow to
					// interleave reads
					notifyAll();
				}
			}
		}
	}

	public synchronized int getResult() {
		// Wait for a result and return it
		while (results.isEmpty()) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return results.poll();
	}
}