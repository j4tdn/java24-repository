package view;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Ex01 {

	// Nhập vào n, tạo ra 2 tam giác đối đỉnh từ 1 -> 2n -1 đối đỉnh tại n
	// chiều cao tam giác = n


	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập n: ");
        int n = sc.nextInt();
        int rows = 2 * n - 1;

        for (int i = 1; i <= rows; i++) {
            int currentRow = i <= n ? i : 2 * n - i;

            // In phần bên trái
            for (int j = 1; j <= currentRow; j++) {
                System.out.print(j + " ");
            }

            // In khoảng trắng ở giữa
            int spaces = (n - currentRow) * 2;
            for (int s = 0; s < spaces; s++) {
                System.out.print("  ");
            }

            // In phần bên phải
            for (int j = 2 * n - currentRow + 1; j <= 2 * n; j++) {
                System.out.print(j + " ");
            }

            System.out.println();
        }
    }
}
