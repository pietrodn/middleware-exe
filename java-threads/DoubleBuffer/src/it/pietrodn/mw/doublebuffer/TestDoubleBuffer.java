package it.pietrodn.mw.doublebuffer;

public class TestDoubleBuffer {

	public static void main(String[] args) {
		final DoubleBuffer db = new DoubleBuffer(2);

		// Thread for adding Alpha
		new Thread() {
			@Override
			public void run() {
				try {
					db.addAlpha(2);
					db.addAlpha(3);
					System.out.println("1: Added alpha (2, 3)");
					System.out.println("1: Waiting to add alpha (4)...");
					db.addAlpha(4);
					System.out.println("1: Added alpha (4)");
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}.start();

		// Thread for adding beta
		new Thread() {
			@Override
			public void run() {
				try {
					db.addBeta(50);
					db.addBeta(51);
					System.out.println("2: Added beta (50, 51)");
					System.out.println("2: Waiting to add beta (52)...");
					db.addBeta(52);
					System.out.println("2: Added beta (52)");
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}.start();

		// Thread to compute
		new Thread() {
			@Override
			public void run() {
				try {
					Thread.sleep(500);
					System.out.println("3: computing");
					db.compute();
					Thread.sleep(2000);
					System.out.println("3: computing");
					db.compute();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}.start();

		// Thread to clear
		new Thread() {
			@Override
			public void run() {
				try {
					Thread.sleep(2000);
					System.out.println("4: clearing");
					db.clear();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}.start();
	}

}
