package it.pietrodn.mw.mapper;

import java.util.LinkedList;

public class Mapper {
	
	private Thread[] threads;
	private PartialMapper[] pms;
	private int nthreads;
	
	public Mapper(int nthreads) {
		threads = new Thread[nthreads];
		pms = new PartialMapper[nthreads];
		this.nthreads = nthreads;
		
		// Setup and start the threads
		for(int i=0; i<nthreads; i++) {
			pms[i] = new PartialMapper();
			threads[i] = new Thread(pms[i]);
			threads[i].start();
		}
	}
	
	public void map(int[] data, Processor p) {
		int i, j;
		
		// Set the processor
		for(j=0; j < nthreads; j++) {
			pms[j].setProc(p);
		}
		
		// Feed the data
		for(i=0; i < data.length; i++) {
			j = i % nthreads;
			pms[j].addElement(data[i]);
		}
		
		// Retrieve the results
		for(i=0; i < data.length; i++) {
			j = i % nthreads;
			data[i] = pms[j].getResult();
		}
	}
	
	public static void main(String[] args) {
		Mapper mapper = new Mapper(4);
		Processor proc = new ProcessorImpl();
		
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		mapper.map(arr, proc);
		
		for(int i=0; i<arr.length; i++) {
			System.out.printf("%d\t", arr[i]);
		}
		
		System.out.println("");
		
		mapper.map(arr, proc);
		
		for(int i=0; i<arr.length; i++) {
			System.out.printf("%d\t", arr[i]);
		}
		
		System.exit(0);

	}
	
	class PartialMapper implements Runnable {
		
		Processor proc;
		
		LinkedList<Integer> elems;
		LinkedList<Integer> results;
		
		public PartialMapper() {
			elems = new LinkedList<Integer>();
			results = new LinkedList<Integer>();
		}
		
		public synchronized void setProc(Processor proc) {
			// Set the processor. This resets elems and results.
			this.proc = proc;
			elems = new LinkedList<Integer>();
			results = new LinkedList<Integer>();
		}
		
		public synchronized void addElement(int e) {
			elems.add(e);
			notify();
		}
		
		@Override
		public void run() {
			while(true) {
				synchronized(this) {
					
					// Waits for elements in the buffer and processes them
					while(elems.isEmpty()) {
						try {
							wait();
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					while(!elems.isEmpty()) {
						results.add(proc.process(elems.pop()));
					}
					notifyAll();
				}
			}
		}
		
		public synchronized int getResult() {
			// Wait for a result and return it
			while(results.isEmpty()) {
				try {
					wait();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			return results.pop();
		}
	}

}
