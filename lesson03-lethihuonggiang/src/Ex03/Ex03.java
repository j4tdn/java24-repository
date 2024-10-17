package Ex03;

import java.util.Random;
import java.util.Scanner;

public class Ex03{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        
        System.out.println("Nhập kích thước ma trận (m x n): ");
        int m = sc.nextInt();
        int n = sc.nextInt();
        
        int arr[][] = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = rd.nextInt(1, 100);
            }
        }
        
        System.out.println("Ma trận " + m + "x" + n + ":");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
        
        boolean foundSaddlePoint = false;
        for (int i = 0; i < m; i++) {
            int min = arr[i][0];
            int colIndex = 0;
            
            for (int j = 1; j < n; j++) {
                if (arr[i][j] < min) {
                    min = arr[i][j];
                    colIndex = j;
                }
            }
            
            boolean saddlePoint = true;
            for (int j = 0; j < m; j++) {
                if (arr[j][colIndex] > min) {
                    saddlePoint = false;
                    break;
                }
            }
            
            if (saddlePoint) {
                System.out.println("Phần tử yên ngựa: " + min + " tại vị trí (" + i + ", " + colIndex + ")");
                foundSaddlePoint = true;
            }
        }
        
        if (!foundSaddlePoint) {
            System.out.println("Không tìm thấy phần tử yên ngựa.");
        }
        
        sc.close();
    }
}
