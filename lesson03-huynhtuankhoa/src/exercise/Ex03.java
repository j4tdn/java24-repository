package exercise;

import java.util.Arrays;
import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows: ");
		int row = sc.nextInt();
		System.out.println("Enter the number of columns: ");
		int column = sc.nextInt();
		int[][] arr = new int[row][column];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		findSaddlePoints(arr);
		sc.close();
	}

	public static void findSaddlePoints(int[][] matrix) {
		boolean hasSaddlePoint = false;
		for (int i = 0; i < matrix.length; i++) {
			int min = findMinInArr(matrix[i]);
			System.out.println(min);
			int index = 0;
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] == min) {
					index = j;
					System.out.println(index);
				}
			}
			int[] newArr = new int[matrix.length];
			for (int k = 0; k < newArr.length; k++) {
				newArr[k] = matrix[k][index];
			}
			System.out.println(Arrays.toString(newArr));
			System.out.println("max: " + findMaxInArr(newArr));
			if (min == findMaxInArr(newArr)) {
				hasSaddlePoint = true;
			}
		}
		if (hasSaddlePoint) {
			System.out.println("Exist saddle point");
		} else {
			System.out.println("DNE saddle point");
		}
	}

	public static int findMaxInArr(int[] arr) {
		int max = arr[0];
		for (int i : arr) {
			if (max < i) {
				max = i;
			}
		}
		return max;
	}

	public static int findMinInArr(int[] arr) {
		int min = arr[0];
		for (int i : arr) {
			if (min > i) {
				min = i;
			}
		}
		return min;
	}
}
