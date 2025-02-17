package view;

import java.util.Arrays;

public class Ex02 {

	public static void main(String[] args) {

		int[][] matrix = new int[][] { 
				new int[] { 1, 2, 3, 4 }, 
				new int[] { 5, 0, 7, 8 }, 
				new int[] { 1, 9, 0, 9 },
				new int[] { 1, 0, 6, 5 }, 
				new int[] { 1, 2, 6, 5 } 
			};
		int totalElements = 0;
		for (int i = 0; i < matrix.length; i++) {
			totalElements += matrix[i].length;
		}
		
		System.out.println("INPUT");
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
		
		// dùng arr cặp idx i, j lưu lại idx = 0
		int[] indexI = new int[totalElements];
		int[] indexJ = new int[totalElements];
		int cnt = 0;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] == 0) {
					indexI[cnt] = i;
					indexJ[cnt] = j;
					cnt++;
				}
			}
		}
		Arrays.copyOfRange(indexI, 0, cnt);
		Arrays.copyOfRange(indexJ, 0, cnt);
		
		
		changeValueOfRowTo0(indexI, indexJ, matrix, cnt);
		changeValueOfColTo0(indexI, indexJ, matrix, cnt);
		System.out.println("\nOUTPUT");
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}

	}

	private static void changeValueOfRowTo0(int[] idxI, int[] idxJ, int[][] matrix, int cnt) {
		for (int x = 0; x < cnt; x++) {
			for (int i = 0; i < matrix[idxI[x]].length; i++) {
				matrix[idxI[x]][i] = 0;
			}
		}
	}

	private static void changeValueOfColTo0(int[] idxI, int[] idxJ, int[][] matrix, int cnt) {
		for (int x = 0; x < cnt; x++) {
			for (int i = 0; i < matrix.length; i++) {
				matrix[i][idxJ[x]] = 0;
			}
		}
	}

}
