package it.pietrodn.mw.mapper;

import java.util.LinkedList;
import java.util.Queue;

public class Mapper {

	private PartialMapper[] pms;
	private int nthreads;

	public Mapper(int nthreads) {

		this.nthreads = nthreads;
		pms = new PartialMapper[nthreads];

		// Setup and start the threads
		for (int i = 0; i < nthreads; i++) {
			pms[i] = new PartialMapper();
			pms[i].start();
		}
	}

	public void map(int[] data, Processor p) {
		int i, j;

		System.out.printf("Running with %d threads.\n", nthreads);

		// Feed the data
		for (i = 0; i < data.length; i++) {
			j = i % nthreads;
			pms[j].addElement(data[i], p);
		}

		// Retrieve the results
		for (i = 0; i < data.length; i++) {
			j = i % nthreads;
			data[i] = pms[j].getResult();
		}
	}

	public static void main(String[] args) {
		Mapper mapper = new Mapper(11);
		Processor proc = new ProcessorImpl();

		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		mapper.map(arr, proc);

		for (int i = 0; i < arr.length; i++) {
			System.out.printf("%d\t", arr[i]);
		}

		System.out.println("");

		mapper.map(arr, proc);

		for (int i = 0; i < arr.length; i++) {
			System.out.printf("%d\t", arr[i]);
		}

		// Kill all the threads that are left running
		System.exit(0);

	}

	class PartialMapper extends Thread {

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

}
