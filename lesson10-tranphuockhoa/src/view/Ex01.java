package view;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();

		System.out.println("Nhap n(n<10): ");
		int n = sc.nextInt();
		int[] numbers = new int[n];

		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = rd.nextInt(10, 51);
		}

		System.out.println("Mang ban dau: " + Arrays.toString(numbers));
		System.out.println("Loai bo trung nhau: " + Arrays.toString(removeDup(numbers)));
		compareHalf(numbers);
		System.out.println("So lon thu 3: " + (threeLargetNumber(numbers)));

	}

	public static int[] removeDup(int[] numbers) {

		for (int i = 0; i < numbers.length - 1; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				if (numbers[i] == numbers[j]) {
					numbers = remove(numbers, j);
					numbers = remove(numbers, i);
				}
			}
		}
		return numbers;
	}

	private static int[] remove(int[] numbers, int pos) {

		for (int i = pos; i < numbers.length - 1; i++) {
			numbers[i] = numbers[i + 1];
		}

		return Arrays.copyOf(numbers, numbers.length - 1);
	}

	public static void compareHalf(int[] numbers) {
		double firstHalf = 0, secondHalf = 0;

		if (numbers.length % 2 != 0) {
			System.out.println("Khong hop le");
			return;
		}

		for (int i = 0; i < numbers.length / 2; i++) {
			firstHalf += numbers[i];
		}

		for (int i = (numbers.length + 1) / 2; i < numbers.length; i++) {
			secondHalf += numbers[i];
		}

		if (firstHalf > secondHalf) {
			System.out.println("Nua phan tu dau lon hon nua phan tu sau");
		} else if (firstHalf == secondHalf) {
			System.out.println("Nua phan tu dau bang nua phan tu sau");
		} else {
			System.out.println("Nua phan tu dau be hon nua phan tu sau");
		}
	}

	// vì đã bỏ các số trùng nhau
	private static int threeLargetNumber(int[] numbers) {
		Arrays.sort(numbers);
		return numbers[2];
	}
}
