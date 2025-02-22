package view;

import java.util.Arrays;

public class Ex02 {
	public static void main(String[] args) {
		int[][] matrix = {
			    {1, 2, 3, 4},
			    {5, 0, 8, 7},
			    {1, 9, 0, 9},
			    {2, 0, 6, 5},
			    {1, 3, 4, 5}
			};
		System.out.println("Ma trận ban đầu: ");
		for(int[] i:matrix) {
			System.out.println(Arrays.toString(i));
		}
		setZeroRowCol(matrix);
		System.out.println("\nMa trận sau khi chuyển tất cả các phần tử trong hàng và cột của phần tử 0 về 0: ");
		for(int[] i:matrix) {
			System.out.println(Arrays.toString(i));
		}
	}
	
	private static void setZeroRowCol(int[][] matrix) {
		int[][] indexZero = new int[matrix.length*matrix[0].length][2];
		int count = 0;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] == 0) {
					indexZero[count][0] = i;
					indexZero[count][1] = j;
					count++;
				}
			}
		}
		
		indexZero = Arrays.copyOfRange(indexZero, 0, count);
		
		
		for (int i = 0; i < indexZero.length; i++) {
			for(int j = 0; j < matrix[indexZero[i][0]].length; j++) {
				matrix[indexZero[i][0]][j] = 0;
			}
			for(int j = 0; j< matrix.length; j++) {
				matrix[j][indexZero[i][1]] = 0;
			}
		}
	}
}
