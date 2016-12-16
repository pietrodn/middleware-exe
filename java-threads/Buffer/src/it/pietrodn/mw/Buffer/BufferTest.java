package it.pietrodn.mw.Buffer;

public class BufferTest {
	public static void main(String[] args) {
		final Buffer b = new Buffer();

		// Thread 1
		new Thread() {
			@Override
			public void run() {
				try {
					int x;
					Thread.sleep(100);
					b.write(7, 0);
					System.out.printf("1: write b[0] = 7\n");
					System.out.printf("1: waiting to get b[1]\n");
					x = b.get(1);
					System.out.printf("1: got b[1] = %d\n", x);
					Thread.sleep(100);
					System.out.printf("1: waiting to write b[2]\n");
					b.write(9, 2);
					System.out.printf("1: write b[2] = 9\n");
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}.start();

		// Thread 2
		new Thread() {
			@Override
			public void run() {
				int x;
				System.out.printf("2: waiting to read b[0]\n");
				x = b.read(0);
				System.out.printf("2: read b[0] = %d\n", x);
				b.write(37, 2);
				System.out.printf("2: write b[2] = 37\n");
			}
		}.start();

		// Thread 3
		new Thread() {
			@Override
			public void run() {
				try {
					int x;
					System.out.printf("3: waiting to get b[0]\n");
					x = b.get(0);
					System.out.printf("3: got b[0] = %d\n", x);
					Thread.sleep(100);
					b.write(5, 1);
					System.out.printf("3: write b[1] = 5\n");
					Thread.sleep(200);
					x = b.get(2);
					System.out.printf("3: got b[2] = %d\n", x);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}.start();
	}
}
