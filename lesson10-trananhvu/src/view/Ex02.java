package view;

import bean.Coordinates;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ex02 {

    private static final Scanner sc = new Scanner(System.in);
    private static final Random rand = new Random();

    private static int[][] mockData(int n, int m) {
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = rand.nextInt(10);
            }
        }
        return arr;
    }

    private static Coordinates[] saveCoordinates(int[][] arr, int n, int m) {
        Coordinates[] coords = new Coordinates[arr.length];
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == 0) {
                    coords[count++] = new Coordinates(i, j);
                }
            }
        }

        return Arrays.copyOf(coords, count);
    }

    private static int[][] handleRow(int[][] arr, int indexRow, int col) {
        for (int i = 0; i < col; i++) {
            arr[indexRow][i] = 0;
        }
        return arr;
    }

    private static int[][] handleCol(int[][] arr, int indexCol, int row) {
        for (int i = 0; i < row; i++) {
            arr[i][indexCol] = 0;
        }
        return arr;
    }

    private static void print(int[][] arr, int n, int m) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n, m;
        System.out.print("Nhap so hang: ");
        n = sc.nextInt();
        System.out.print("Nhap so cot: ");
        m = sc.nextInt();

        int[][] arr = mockData(n, m);
        Coordinates[] coordinates = saveCoordinates(arr, n, m);

        System.out.println("\nMa tran truoc khi xu li: ");
        print(arr, n, m);

        System.out.println("\n");

        for (int i = 0; i < coordinates.length; i++) {
            arr = handleRow(arr, coordinates[i].getX(), m);
            arr = handleCol(arr, coordinates[i].getY(), n);
        }

        System.out.println("Ma tran sau khi xu li: ");
        print(arr, n, m);
    }
}
