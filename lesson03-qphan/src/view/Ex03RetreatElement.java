package view;

import java.util.Arrays;

public class Ex03RetreatElement {
	
	public static void main(String[] args) {
		
		// 1D
		// int[] numbers = {2, 6, 5, 8};
		// System.out.println("numbers[1] => " + numbers[1]);
		
		// 2D
		// mỗi phần tử nó là 1 mảng 1 chiều
		int[][] matrix = { 
			{47, 35, 36, 78}, 
			{23, 12, 31, 12},
			{46, 18, 29, 66}
		};
		
		printMatrix(matrix);
		
		// Tìm phần tử yên ngựa
		System.out.println("Phần tử yên ngựa --> " + findRetreatElement(matrix));
		
		// Yêu cầu các phần tử không trùng nhau
		
	}
	
	// boxing
	// unboxing
	
	private static Integer findRetreatElement(int[][] matrix) {
		for (int rowI = 0; rowI < matrix.length; rowI++) {
			for (int colI = 0; colI < matrix[rowI].length; colI++) {
				int element = matrix[rowI][colI];
				if (isMinRow(element, rowI, matrix) && isMaxCol(element, colI, matrix)) {
					return element;
				}
			}
		}
		return null;
	}
	
	// 31, 2, matrix
	private static boolean isMaxCol(int checkingElement, int colI, int[][] matrix) {
		for (int rowI = 0; rowI < matrix.length; rowI++) {
			int element = matrix[rowI][colI];
			if (element > checkingElement) {
				return false;
			}
		}
		return true;
	}
	
	
	private static boolean isMinRow(int checkingElement, int rowI, int[][] matrix) {
		// lấy hàng hiện tại của checkingElement
		int[] crowElements = matrix[rowI];
		
		// kiểm tra xem hắn có phải là nhỏ nhất trong hàng ko
		for (int element: crowElements) {
			if (element < checkingElement) {
				return false;
			}
		}
		return true;
	}
	
	
	private static void printMatrix(int[][] matrix) {
		for (int rowI = 0; rowI < matrix.length; rowI++) {
			for (int colI = 0; colI < matrix[rowI].length; colI++) {
				System.out.print(matrix[rowI][colI] + " ");
			}
			System.out.println();
		}
	}
	
}
