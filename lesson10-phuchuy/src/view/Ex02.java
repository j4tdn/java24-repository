package view;

public class Ex02 {
	public static void main(String[] args) {
		
		int[][] matrix = {{1,2,3,4},{5,6,7,8},{1,9,0,9},{2,9,6,5},{1,2,4,5}};
		System.out.println("ma trận gốc: ");
		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[row].length; col++) {
				System.out.print(matrix[row][col]);
			}
			System.out.println();
		}
		System.out.println("ma trận chuyển đổi: ");
		findZero(matrix);
		System.out.println("\n=============================\n");
		int[][] matrix2 = {{1,2,3,4},{5,0,7,8},{1,9,0,9},{2,0,6,5},{1,2,4,5}};
		System.out.println("ma trận gốc: ");
		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[row].length; col++) {
				System.out.print(matrix[row][col]);
			}
			System.out.println();
		}
		System.out.println("ma trận chuyển đổi: ");
		findZeros(matrix2);
		
	}
	private static void findZero(int[][] matrix) {
		int zeroRow = 0;
		int zeroCol = 0;
		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[row].length; col++) {
				if (matrix[row][col] == 0) {
					zeroCol = col;
					zeroRow = row;
				}
			}
		}
		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[row].length; col++) {
				if (row == zeroRow || col == zeroCol) {
					matrix[row][col] = 0;
				}
				System.out.print(matrix[row][col]);
			}
			System.out.println();
		}
		
		
	}
	private static void findZeros(int[][] matrix) {
		int[] zeroRows = new int[matrix.length];
		int[] zeroCols = new int[matrix[0].length];
		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[row].length; col++) {
				if (matrix[row][col] == 0) {
					zeroRows[row] = 1;
					zeroCols[col] = 1;
				}
			}
		}
		for (int row = 0 ; row < matrix.length; row ++) {
			for (int col = 0; col < matrix[row].length; col ++) {
				if (zeroRows[row] == 1 || zeroCols[col] == 1) {
					matrix[row][col] = 0;
				}
				System.out.print(matrix[row][col]);
			}
			System.out.println();
		}
	}
	

}
