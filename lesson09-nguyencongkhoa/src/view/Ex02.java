package view;

import java.util.Scanner;

public class Ex02 {

	private static int[] numbers;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter amount of String: ");
		int n = sc.nextInt();
		sc.nextLine();
		numbers = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.print("Enter string: ");
			String str = sc.nextLine();
			if (str.isEmpty()) {
				System.out.println("0");
				return;
			}
			getLargestNumbers(str, i);
		}
		sort(numbers, n);
		System.out.print("Kết quả: ");
		for (int num : numbers) {
			System.out.print(num + " ");
		}
	}

	private static void getLargestNumbers(String ss, int i) {
		String[] arrNumbers = ss.split("\\D+");
		int max = Integer.MIN_VALUE;
		for (String arr : arrNumbers) {
			max = Math.max(max, Integer.parseInt(arr));
		}
		numbers[i] = max;
	}

	private static void sort(int[] a, int n) {
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n; j++) {
				if (a[j] > a[j+1]) {
					int tmp = a[j];
					a[j] = a[j+1];
					a[j+1] = tmp;
				}
			}
		}
	}

}
