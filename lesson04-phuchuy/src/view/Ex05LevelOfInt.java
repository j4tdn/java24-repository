package view;

import java.util.Arrays;

public class Ex05LevelOfInt {
	private static int levelOfInt(int n) {

		int count = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				count++;
			}
		}
		return count;
	}

	private static int[] sortedArray(int[] numbers) {
		for (int i = 0; i < numbers.length - 1; i++) {
			for (int j = 0; j < numbers.length - i - 1; j++) {
				if (levelOfInt(numbers[j]) > levelOfInt(numbers[j + 1])) {
					int temp = numbers[j + 1];
					numbers[j + 1] = numbers[j];
					numbers[j] = temp;
				}
			}
		}
		return numbers;
	}

	public static void main(String[] args) {
		int[] numbers = new int[] { 8, 5, 9, 20 };
		System.out.println("Array -> " + Arrays.toString(sortedArray(numbers)));
	}

}
