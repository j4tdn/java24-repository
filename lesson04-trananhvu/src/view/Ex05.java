package view;

import java.util.Scanner;

public class Ex05 {
	private static Scanner ip = new Scanner(System.in);

	private static int findDivisors(int n) {
		int count = 2;
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0)
				count++;
		}
		return count;
	}

	public static void main(String[] args) {
		int n;
		int[] arr = new int[1001];
		System.out.print("Nhap so nguyen n: ");
		n = ip.nextInt();
		System.out.print("Nhap mang so nguyen: ");
		for (int i = 0; i < n; i++) {
			arr[i] = ip.nextInt();
		}
		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				if (findDivisors(arr[j]) < findDivisors(arr[i])) {
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
		System.out.print("Ket qua sau khi sap xep: ");
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
		ip.close();
	}
}
