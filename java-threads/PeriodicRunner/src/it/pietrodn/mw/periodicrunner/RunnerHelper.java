package it.pietrodn.mw.periodicrunner;

public class RunnerHelper implements Runnable {

	private Runnable rb;
	private int delay; // in milliseconds
	private boolean shouldStop = false;

	public RunnerHelper(Runnable rb, int delay) {
		this.rb = rb;
		this.delay = delay;
	}

	@Override
	public void run() {
		while (true) {
			synchronized (this) {
				if (shouldStop) {
					break;
				}
				new Thread(rb).start();
				try {
					wait(delay);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	}

	public synchronized void stop() {
		this.shouldStop = true;
	}

}
