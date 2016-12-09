package it.pietrodn.mw.printerspooler;

public class Printer implements Runnable {
	private final int max_iter;
	private Spool spool;
	
	public Printer(Spool spool, int max_iter) {
		this.max_iter = max_iter;
		this.spool = spool;
	}

	@Override
	public void run() {
		for(int i=0; i<max_iter; i++) {
			try {
				Integer j = spool.getJob();
				System.out.printf("Printer: printing %d.\n", j);
				
				// Printing, as you know, requires some time.
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	
}
