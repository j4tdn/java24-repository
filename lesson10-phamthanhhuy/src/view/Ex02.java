package view;

import java.util.Arrays;
import java.util.Iterator;

import utils.UtilsEx02;

public class Ex02 {

	public static void main(String[] args) {

		int[][] matrix = { { 1, 0, 3, 4 }, { 5, 6, 8, 7 }, { 1, 9, 0, 9 }, { 2, 9, 6, 5 }, { 1, 0, 4, 5 } };
		int[][] matrix2 = { { 1, 0, 3, 4 }, { 5, 6, 8, 7 }, { 1, 9, 0, 9 }, { 2, 9, 6, 5 }, { 1, 0, 4, 5 } };

		System.out.println("In ma trận:");

		for (int row = 0; row < matrix.length; row++) {
			for (int cell = 0; cell < matrix[row].length; cell++) {
				System.out.print(matrix[row][cell] + " ");
			}
			System.out.println();
		}
		System.out.println("\n=============================\n");

		int[][] zeroPos = UtilsEx02.zeroCheck(matrix);

		System.out.println("Vị trí số 0 ([hàng][cột]): ");
		for (int row = 0; row < zeroPos.length; row++) {
			for (int cell = 0; cell < zeroPos[row].length; cell++) {
				System.out.print(zeroPos[row][cell] + " ");
			}
			System.out.println();
		}

		System.out.println("\n=============================\n");

		System.out.println("Thay đổi hàng: ");
		UtilsEx02.insertRow(matrix);

		for (int row = 0; row < matrix.length; row++) {
			for (int cell = 0; cell < matrix[row].length; cell++) {
				System.out.print(matrix[row][cell] + " ");
			}
			System.out.println();
		}

		System.out.println("\n=============================\n");

		System.out.println("Thay đổi cột: ");
		UtilsEx02.insertColumn(matrix2);

		for (int row = 0; row < matrix2.length; row++) {
			for (int cell = 0; cell < matrix2[row].length; cell++) {
				System.out.print(matrix2[row][cell] + " ");
			}
			System.out.println();
		}

		System.out.println("\n=============================\n");

		System.out.println("Thay đổi cột và hàng: ");
		int[][] finalArr = UtilsEx02.insertRowColunm(matrix, matrix2);
		
		for (int row = 0; row < finalArr.length; row++) {
			for (int cell = 0; cell < finalArr[row].length; cell++) {
				System.out.print(finalArr[row][cell] + " ");
			}
			System.out.println();
		}
	}

}
