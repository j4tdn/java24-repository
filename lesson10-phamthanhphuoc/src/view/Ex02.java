package view;
import java.util.*;

public class Ex02 {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 0, 7, 8},
                {1, 9, 0, 9},
                {1, 0, 6, 5},
                {1, 2, 6, 5}
        };

        System.out.println("INPUT");
        printMatrix(matrix);

        markAndSetZero(matrix);

        System.out.println("\nOUTPUT");
        printMatrix(matrix);
    }

    private static void markAndSetZero(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        boolean[] rowZero = new boolean[rows];
        boolean[] colZero = new boolean[cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == 0) {
                    rowZero[i] = true;
                    colZero[j] = true;
                }
            }
        }
        for (int i = 0; i < rows; i++) {
            if (rowZero[i]) {
                Arrays.fill(matrix[i], 0);
            }
        }

        for (int j = 0; j < cols; j++) {
            if (colZero[j]) {
                for (int i = 0; i < rows; i++) {
                    matrix[i][j] = 0;
                }
            }
        }
    }

    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }
}
