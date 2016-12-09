package it.pietrodn.mw.carparkcontrol;

public class CarThread implements Runnable {
	
	private int id;
	private Parking park;
	private int max_iter;
	private final int sleep_millis = 500;
	
	public CarThread(int id, Parking p, int max_iter) {
		this.id = id;
		this.park = p;
		this.max_iter = max_iter;
	}
	
	@Override
	public void run() {
		for(int i=0; i<max_iter; i++) {
			try {
				park.arrive();
				System.out.printf("%d: arriving!\n", this.id);
				Thread.sleep(sleep_millis);
				park.leave();
				System.out.printf("%d: leaving!\n", this.id);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
