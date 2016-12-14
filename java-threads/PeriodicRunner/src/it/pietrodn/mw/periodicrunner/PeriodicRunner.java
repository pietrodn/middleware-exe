package it.pietrodn.mw.periodicrunner;

public class PeriodicRunner {

	private RunnerHelper rh;
	private Thread th;

	public PeriodicRunner(Runnable rb, int delay) {
		this.rh = new RunnerHelper(rb, delay);
		this.th = new Thread(rh);
	}

	public void start() {
		th.start();
	}

	public void stop() {
		rh.stop();
	}

	public static void main(String[] args) {
		Runnable r = new Runnable() {
			@Override
			public void run() {
				System.out.println("Hello World!");
			}
		};
		PeriodicRunner pr = new PeriodicRunner(r, 1000);
		pr.start();

		// Thread to stop PeriodicRunner after some seconds.
		new Thread() {
			@Override
			public void run() {
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				pr.stop();
			}
		}.start();

	}

}
