package it.pietrodn.mw.delay;

public class Delay {

	private static Thread thr;
	private static ThreadExec threadExec;

	static {
		// Initialized the thread for running executables
		threadExec = new ThreadExec();
		thr = new Thread(threadExec);
		thr.start();
	}

	public static void main(String[] args) {
		Runnable r = new Runnable() {
			@Override
			public void run() {
				System.out.println("Hello World!");
			}
		};
		Delay.delay(r, 1);
		Delay.delay(r, 2);
		Delay.delay(r, 4);
		Delay.stop();
	}

	public static void delay(Runnable job, int delay) {
		threadExec.addRunnable(job, delay);
	}

	public static void stop() {
		threadExec.stopWhenEmpty();
	}

}
