package view;

import java.util.Scanner;

public class Ex03 {
	private static Scanner ip = new Scanner(System.in);

	public static void main(String[] args) {

		int[][] arr = new int[1001][1001];
		int n;
		System.out.print("Nhap so nguyen n: ");
		n = ip.nextInt();
		for (int i = 1; i <= n; i++) {
			for (int j = 0; j < i + 1; j++) {
				if (j == 0 || j == i)
					arr[i][j] = 1;
				else
					arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
				System.out.print(arr[i][j] + "   ");
			}
			System.out.println("\n");
		}

	}
}
