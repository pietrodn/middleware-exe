package it.pietrodn.mw.matrixmultiplier;

public class RowMultiplier implements Runnable {

	private int row[], m2[][], result[];

	public RowMultiplier(int row[], int m2[][]) {
		if (row.length != m2.length) {
			throw new IllegalArgumentException("Incompatible matrix!");
		}
		this.row = row.clone();
		this.m2 = m2.clone();
	}

	@Override
	public void run() {
		int i, j;
		int ncols = m2[0].length;
		result = new int[ncols];
		for (j = 0; j < ncols; j++) {
			result[j] = 0;
			for (i = 0; i < m2.length; i++) {
				result[j] += row[i] * m2[i][j];
			}
		}
	}

	public int[] getResult() {
		return result.clone();
	}

}
