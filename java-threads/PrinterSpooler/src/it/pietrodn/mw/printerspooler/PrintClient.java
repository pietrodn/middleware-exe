package it.pietrodn.mw.printerspooler;

import java.util.Random;

public class PrintClient implements Runnable {
	private final int max_iter;
	private final int id;
	private Spool spool;
	private Random rand;
	
	public PrintClient(int id, Spool spool, int max_iter) {
		this.id = id;
		this.max_iter = max_iter;
		this.spool = spool;
		this.rand = new Random();
	}

	@Override
	public void run() {
		for(int i=0; i<max_iter; i++) {
			try {
				Integer j = rand.nextInt(100);
				System.out.printf("Client %d: please print %d.\n", id, j);
				spool.addJob(j);
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
