package utils;

import java.lang.annotation.Target;
import java.util.Arrays;

public class UtilsEx02 {

	public static int[][] zeroCheck(int[][] source) {
		int[][] zeroPos = new int[source.length][2];
		int count = 0;
		for (int row = 0; row < source.length; row++) {
			for (int cell = 0; cell < source[row].length; cell++) {
				if (source[row][cell] == 0) {
					zeroPos[count][0] = row;
					zeroPos[count][1] = cell;
					count++;
				}
			}
		}
		return Arrays.copyOfRange(zeroPos, 0, count);
	}

	public static void insertRow(int[][] source) {
		int[][] zeroPos = zeroCheck(source);

		for (int rowZ = 0; rowZ < zeroPos.length; rowZ++) {
			for (int rowS = 0; rowS < source.length; rowS++) {
				if (rowS == zeroPos[rowZ][0]) {
					for (int i = 0; i < source[rowS].length; i++) {
						source[rowS][i] = 0;
					}
				}
			}
		}
	}

	public static void insertColumn(int[][] source) {
		int[][] zeroPos = zeroCheck(source);

		for (int colZ = 0; colZ < zeroPos.length; colZ++) {
			for (int colS = 0; colS < source[0].length; colS++) {
				if (colS == zeroPos[colZ][1]) {
					for (int i = 0; i < source.length; i++) {
						source[i][colS] = 0;
					}
				}
			}
		}
	}

	public static int[][] insertRowColunm(int[][] s1, int[][] s2) {
		int[][] target = s1;
		for (int row = 0; row < target.length; row++) {
			for (int cell = 0; cell < target[row].length; cell++) {
				if (s1[row][cell] == 0 || s2[row][cell] == 0) {
					target[row][cell] = 0;
				}
			}
			System.out.println();
		}
		return target;
	}
}
