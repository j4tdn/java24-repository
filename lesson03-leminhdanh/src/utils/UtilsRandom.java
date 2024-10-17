package utils;

import java.util.Random;

public class UtilsRandom {
	private static Random rd = new Random();

	public static int[][] RandomArray(int n, int m) {
		int[][] array = new int[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				array[i][j] = rd.nextInt(1, 100);
			}
		}
		return array;
	}
}
