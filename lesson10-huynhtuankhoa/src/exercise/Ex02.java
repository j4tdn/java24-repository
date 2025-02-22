package exercise;

import java.util.Arrays;
import java.util.Random;

public class Ex02 {
	public static void main(String[] args) {
		/*
		 * int[][] arrD2 = new int[5][5]; for (int i = 0; i < arrD2.length; i++) { for
		 * (int j = 0; j < arrD2[i].length; j++) { arrD2[i][j] = new Random().nextInt(0,
		 * 9); } }
		 */
		int[][] arrD2 = {
				{1, 2, 3, 4, 5},
				{6, 7, 2, 9, 1},
				{9, 3, 0, 0, 2},
				{6, 7, 4, 1, 10},
				{5, 1, 8, 9, 0},
		};
		System.out.println(Arrays.deepToString(arrD2));
		int[][] clone = new int[arrD2.length][];
		for (int i = 0; i < arrD2.length; i++) {
			clone[i] = Arrays.copyOf(arrD2[i], arrD2[i].length);
		}
		for (int i = 0; i < arrD2.length; i++) {
			for (int j = 0; j < arrD2[i].length; j++) {
				if (arrD2[i][j] == 0) {
					for (int k = 0; k < clone[i].length; k++) {
						clone[i][k] = 0;
					}
					for (int t = 0; t < clone.length; t++) {
						clone[t][j] = 0;
					}
				}
			}
		}
		System.out.println(Arrays.deepToString(clone));
		

	}
}
