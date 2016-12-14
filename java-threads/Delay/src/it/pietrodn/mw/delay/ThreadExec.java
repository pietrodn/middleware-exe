package it.pietrodn.mw.delay;

import java.util.LinkedList;
import java.util.Queue;

class ThreadExec implements Runnable {

	private Queue<Runnable> q;
	private Queue<Integer> delays;
	private boolean shouldStop = false;

	public ThreadExec() {
		this.q = new LinkedList<Runnable>();
		this.delays = new LinkedList<Integer>();
	}

	public synchronized void addRunnable(Runnable runnable, int delay) {
		q.add(runnable);
		delays.add(delay);
		notify();
	}

	@Override
	public void run() {
		while (true) {
			synchronized (this) {
				try {
					while (q.isEmpty()) {
						wait();
					}
					Thread.sleep(delays.poll() * 1000);
					q.poll().run();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				if (q.isEmpty() && shouldStop) {
					// Termination condition
					break;
				}
			}
		}

	}

	public synchronized void stopWhenEmpty() {
		this.shouldStop = true;
	}

}