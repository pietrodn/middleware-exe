package it.pietrodn.mw.doublebuffer;

public class DoubleBuffer {
	private int[] alpha;
	private int[] beta;
	private int ai = 0, bi = 0;

	public DoubleBuffer(int size) {
		alpha = new int[size];
		beta = new int[size];
	}

	public void addAlpha(int data) throws InterruptedException {
		synchronized (alpha) {
			while (ai == alpha.length) {
				alpha.wait();
			}
			alpha[ai++] = data;
		}
	}

	public void addBeta(int data) throws InterruptedException {
		synchronized (beta) {
			while (bi == beta.length) {
				beta.wait();
			}
			beta[bi++] = data;
		}
	}

	public void clear() {
		synchronized (alpha) {
			synchronized (beta) {
				ai = bi = 0;
				for (int i = 0; i < alpha.length; i++) {
					alpha[i] = beta[i] = 0;
				}
				alpha.notifyAll();
				beta.notifyAll();
			}
		}
	}

	public void compute() throws InterruptedException {
		// Cloning to minimize the length of the critical section
		int[] a, b;
		int _ai, _bi;
		synchronized (alpha) {
			synchronized (beta) {
				a = alpha.clone();
				b = beta.clone();
				_ai = ai;
				_bi = bi;
			}
		}
		// Outside the critical section, we may execute a "complex and time
		// consuming" task with the arrays a, b.
		Thread.sleep(100);
		System.out.printf("\nAlpha: ");
		for (int i = 0; i < _ai; i++) {
			System.out.printf("%d\t", a[i]);
		}
		System.out.printf("\nBeta: ");
		for (int i = 0; i < _bi; i++) {
			System.out.printf("%d\t", b[i]);
		}
		System.out.println("\n");
	}
}
