package it.pietrodn.mw.mapper;

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
}
