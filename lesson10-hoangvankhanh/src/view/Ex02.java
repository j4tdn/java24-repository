package view;

import java.util.Arrays;

public class Ex02 {

	public static void main(String[] args) {

		int[][] array = {
			    {1, 2, 3, 4},
	            {5, 6, 8, 7},
	            {1, 9, 0, 9},
	            {2, 9, 6, 5},
	            {1, 2, 4, 5}
		};
		
		zero(array);
		
		System.out.println("Ma trận khi chuyển đổi: ");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
		
	}
	
    private static void zero(int[][] array) {
        int row0 = -1;
        int col0 = -1;
        int rows = array.length;
        int col = array[0].length;
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++) {
                if (array[i][j] == 0) {
                    row0 = i;
                    col0 = j;
                }
            }
        }
        
        if (row0 != -1 && col0 != -1) {
            for (int i = 0; i < col; i++) {
                array[row0][i] = 0;
            }
            for (int i = 0; i < rows; i++) {
                array[i][col0] = 0;
            }
        }
    }
}
