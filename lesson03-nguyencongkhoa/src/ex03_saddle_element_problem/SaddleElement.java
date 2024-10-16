package ex03_saddle_element_problem;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

import Utilities.Utils;

public class SaddleElement {
	// exist elemnts saddle when the column same value && constaint -->
	public static void main(String[] args) {
		int m = Utils.inputPositiveInteger("Nhập độ dài hàng của ma trận: ");
		int n = Utils.inputPositiveInteger("Nhập độ dài cột của ma trận: ");
		int[][] matrix = new int[m][n];
		boolean isSaddleElement = true;
		
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				matrix[i][j] = Utils.randomInteger(1, 100);
			}
		}

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(matrix[i][j] + " ");
				;
			}
			System.out.println();
		}

		for (int i = 0; i < m; i++) {
			int minValRow = matrix[i][0];
			int index = i;

			for (int j = 1; j < n; j++) {
				if (minValRow > matrix[i][j]) {
					minValRow = matrix[i][j];
					index = j;
				}
			}

			for (int j = 0; j < m; j++) {
				if (minValRow < matrix[j][index]) {
					isSaddleElement = false;
					break;
				}
			}

			if (isSaddleElement) {
				System.out.println("\nCó tồn tại phần tử yên ngựa tại vị trí A[" + i + "][" + index + "]");
			} 
		}
	}

//	public static void main(String[] args) {
//		int m = 3;
//		int n = 3;
//		int[][] matrix = { { 47, 38, 36 }, 
//						   { 37, 38, 36 }, 
//				           { 46,  7, 29 } };
//
//		for (int i = 0; i < m; i++) {
//			for (int j = 0; j < n; j++) {
//				System.out.print(matrix[i][j] + " ");
//			}
//			System.out.println();
//		}
//		
//		for (int i = 0; i < m; i++) {
//			int minValRow = matrix[i][0];
//			int index = i;
//			boolean isSaddleElement = true;
//			
//			for (int j = 1; j < n; j++) {
//				if (minValRow > matrix[i][j]) {
//					minValRow = matrix[i][j];
//					index = j;
//				}
//			}
//			
//			for (int j = 0; j < m; j++) {
//				if (minValRow < matrix[j][index]) {
//					isSaddleElement = false;
//					break;
//				}
//			}
//			
//			if (isSaddleElement) {
//				System.out.println("Có tồn tại phần tử yên ngựa tại vị trí A[" + i + "][" + index + "]");
//			}
//		}
//	}

}
