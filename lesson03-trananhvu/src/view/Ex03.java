package view;

public class Ex03 {
	private static boolean isMinRow(int[][] arr, int element, int indexrow, int cols) {
		for (int i = 0; i < cols; i++) {
			if (element > arr[indexrow][i])
				return false;
		}
		return true;
	}

	private static boolean isMaxCol(int[][] arr, int element, int indexCol, int rows) {
		for (int i = 0; i < rows; i++) {
			if (element < arr[i][indexCol])
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		int rows = 3, cols = 3;
		int[][] arr = { { 47, 47, 36 }, { 23, 43, 31 }, { 46, 7, 29 } };
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				if (isMinRow(arr, arr[i][j], i, cols) && isMaxCol(arr, arr[i][j], j, rows)) {
					System.out.println("Phan tu yen ngua trong mang: " + arr[i][j] + " ");
				}

			}
		}
	}
}
