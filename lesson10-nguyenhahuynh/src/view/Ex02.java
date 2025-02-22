package view;

import java.util.Arrays;

public class Ex02 {

	public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 0, 0},
            {7, 8, 9}
        };

        System.out.println("Ma trận ban đầu:");
        printMatrix(matrix);

        transformMatrix(matrix);

        System.out.println("Ma trận sau khi chuyển đổi:");
        printMatrix(matrix);
	}
	
	private static void transformMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int zeroCount = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == 0) {
                    zeroCount++;
                }
            }
        }

        int[][] zeroPos = new int[zeroCount][2];
        int index = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == 0) {
                    zeroPos[index][0] = i;
                    zeroPos[index][1] = j;
                    index++;
                }
            }
        }

        for (int i = 0; i < zeroCount; i++) {
            int row = zeroPos[i][0];
            int col = zeroPos[i][1];

            for (int j = 0; j < cols; j++) {
                matrix[row][j] = 0;
            }

            for (int j = 0; j < rows; j++) {
                matrix[j][col] = 0;
            }
        }
    }
	
    private static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
