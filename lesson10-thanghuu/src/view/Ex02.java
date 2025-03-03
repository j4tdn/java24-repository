package view;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import bean.Coordinates;

public class Ex02 {
	private static final Scanner sc = new Scanner(System.in);
	private static final Random rd = new Random();
	
	public static void main(String[] args) {
		int rows,cols;
		System.out.println("Nhap so hang: ");
		rows = sc.nextInt();
		System.out.println("Nhap so cot: ");
		cols = sc.nextInt();
		
		int[][] matrix = mockData(rows, cols);
		Coordinates[] coordinates = findCoordinates(matrix, rows, cols);
		
		System.out.println("Ma tran ban dau: ");
		print(matrix);
		System.out.println("\n");
		
		for (int i = 0; i < coordinates.length; i++) {
			matrix = handleRow(matrix, coordinates[i].getX(), cols);
			matrix = handleCol(matrix, coordinates[i].getY(), rows);
		}
		
		System.out.println("Ma tran khi xu ly: ");
		print(matrix);
	}
	
	private static Coordinates[] findCoordinates(int[][] arr, int row, int col) {
		Coordinates[] coor = new Coordinates[arr.length];
		int count = 0;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if (arr[i][j] == 0) {
					coor[count++] = new Coordinates(i,j);
				}
			}
		}
		return Arrays.copyOf(coor, count);
	}
	
	private static int[][] handleRow(int[][] arr, int index, int col) {
		for (int i = 0; i < col; i++) {
			arr[index][i] = 0;
		}
		return arr;
	}
	
	private static int[][] handleCol(int[][] arr, int index, int row) {
		for (int i = 0; i < row; i++) {
			arr[i][index] = 0;
		}
		return arr;
	}
	
	private static void print(int[][] matrix) {
		 for (int i = 0; i < matrix.length; i++) {
				for (int j = 0; j < matrix[i].length; j++) {
					System.out.print(matrix[i][j] + " ");
				}
				System.out.println();
			}
	    }
	
	
	

	private static int[][] mockData(int row, int col) {
		int[][] arr = new int[row][col];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				arr[i][j] = rd.nextInt(10);
			}
		}
		return arr;
	}

}







