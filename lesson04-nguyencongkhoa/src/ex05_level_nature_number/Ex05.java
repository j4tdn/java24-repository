package ex05_level_nature_number;

import java.util.Arrays;

import util.Utilities;

public class Ex05 {

	private static int countAmountOfDivisor(int number) {
		// chính nó là nó rồi thì initial luôn
		int cnt = 1;
		for (int i = 1; i <= number / 2; i++) {
			if (number % i == 0) {
				cnt++;
			}
		}
		return cnt;
	}

	private static int[] bubbleSort(int[] arr, int n) {
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - 1 - i; j++) {
				if (countAmountOfDivisor(arr[j]) > countAmountOfDivisor(arr[j + 1])) {
					int tmp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = tmp;
				}
			}
		}
		return arr;
	}

	public static void main(String[] args) {
		int amountOfElement = Utilities.randomInt(3, 21);
		int[] arr = new int[amountOfElement];

		System.out.print("Mảng số nguyên: ");
		for (int i = 0; i < amountOfElement; i++) {
			arr[i] = Utilities.randomInt(1, 101);
			System.out.print(arr[i] + " ");
		}
		
		int[] arrSorted = bubbleSort(arr, amountOfElement);
		System.out.print("\nKết quả sau khi đã sắp xếp: ");
		for (int i : arrSorted) {
			System.out.print(i + " ");
		}
	}

}
