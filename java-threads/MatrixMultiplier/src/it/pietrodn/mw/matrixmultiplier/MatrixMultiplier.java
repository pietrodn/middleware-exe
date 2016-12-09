package it.pietrodn.mw.matrixmultiplier;

public class MatrixMultiplier {

	public static void main(String[] args) throws InterruptedException {
		int a[][] = { { 1, 2, 3 }, { 4, 5, 6 } };
		int b[][] = { { 1, 2 }, { 3, 4 }, { 5, 6 } };
		int result[][] = multiply(a, b);

		int i, j;
		for (i = 0; i < result.length; i++) {
			for (j = 0; j < result[i].length; j++) {
				System.out.print(result[i][j] + " ");
			}
			System.out.println("");
		}

	}

	public static int[][] multiply(int a[][], int b[][]) throws InterruptedException {
		int result[][] = new int[a.length][b[0].length];

		Thread threads[] = new Thread[a.length];
		RowMultiplier rms[] = new RowMultiplier[a.length];

		int i;
		for (i = 0; i < a.length; i++) {
			rms[i] = new RowMultiplier(a[i], b);
			threads[i] = new Thread(rms[i]);
			threads[i].start();
		}

		for (i = 0; i < a.length; i++) {
			threads[i].join();
			result[i] = rms[i].getResult();
		}
		return result;
	}

}
