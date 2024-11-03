package view;

import java.util.Scanner;

public class Ex04FindSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = { 1, 5, 8, 9, 2, 5, 9 };
		int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
		for (int i = 0; i < a.length; i++) {
			max = Math.max(max, a[i]);
			min = Math.min(min, a[i]);
		}

		System.out.print("Tổng các phần tử không trùng nhau trong mảng ngoại trừ phần tử lớn nhất và nhỏ nhất là: ");
		System.out.println(sum(a) - max - min);

	}

	private static int sum(int[] a) {
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}

		for (int i = 0; i < a.length; i++) {
			int cnt = countTimesDuplicate(a, a[i]);
			if (cnt >= 2) {
				--cnt;
				sum -= (a[i] * cnt);
			}
		}
		
		return sum;
	}

	private static int countTimesDuplicate(int[] a, int check) {
		int cnt = 0;
		for (int i = 0; i < a.length; i++) {
			if (check == a[i]) {
				cnt++;
			}
		}
		return cnt;
	}
}
