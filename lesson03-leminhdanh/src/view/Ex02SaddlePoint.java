package view;

import java.util.Scanner;

import utils.UtilsRandom;

public class Ex02SaddlePoint {
	public static void main(String[] args) {

		Scanner c = new Scanner(System.in);

		System.out.print("nhap so hang: ");
		int n = Integer.parseInt(c.nextLine());

		System.out.print("nhap so cot: ");
		int m = Integer.parseInt(c.nextLine());

		int[][] array = UtilsRandom.RandomArray(n, m);

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print(array[i][j] + "\t");
			}
			System.out.println();
		}
		Integer check = FindSaddlePoint(array, n, m);
		if (check == null) {
			System.out.println("khong ton tai phan tu yen ngua");
		}
	}

	public static Integer FindSaddlePoint(int[][] array, int r, int c) {
		Integer dem = null;
		int location = 0;
		for (int i = 0; i < r; i++) {
			int point = 100;
			for (int j = 0; j < c; j++) {
				if (point > array[i][j]) {
					point = array[i][j];
					location = j;
				}
			}
			if (maxInColum(array, i, location, r)) {
				System.out.printf("array[%s][%s] = %s", i, location, array[i][location]);
				dem++;
			}
		}
		return dem;
	}

	public static boolean maxInColum(int[][] array, int row, int col, int n) {
		for (int i = 0; i < n; i++) {
			if (array[row][col] < array[i][col]) {
				return false;
			}
		}
		return true;
	}
}
