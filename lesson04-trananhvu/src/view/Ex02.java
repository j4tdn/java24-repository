package view;

import java.util.Random;
import java.util.Scanner;

public class Ex02 {
	private static Scanner ip = new Scanner(System.in);
	private static Random rd = new Random();

	private static int movingNumberDivBy7(int[] arr, int n) {
		int index = 0;
		for (int i = 0; i < n - 1; i++) {
			if (arr[i] % 7 == 0 && arr[i] % 5 != 0) {
				index++;
				continue;
			}
			for (int j = i + 1; j < n; j++) {
				if (arr[j] % 7 == 0 && arr[j] % 5 != 0) {
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
					index++;
					break;
				}
			}
		}
		return index;
	}

	private static int movingNumberDivBy5(int[] arr, int n, int indexBegin) {
		int index = n;
		for (int i = n - 1; i > indexBegin; i--) {
			if (arr[i] % 5 == 0 && arr[i] % 7 != 0) {
				index--;
				continue;
			}

			for (int j = i - 1; j > indexBegin - 1; j--) {
				if (arr[j] % 5 == 0 && arr[j] % 7 != 0) {
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
					index--;
					break;
				}
			}
		}
		return index;
	}

	public static void main(String[] args) {
		int n;
		int[] arr = new int[101];

		System.out.print("Nhap so nguyen n: ");
		n = ip.nextInt();

		for (int i = 0; i < n; i++) {
			arr[i] = rd.nextInt(5, 101);
		}

		System.out.print("Input: ");
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}

		int indexBegin = movingNumberDivBy7(arr, n);
		int indexEnd = movingNumberDivBy5(arr, n, indexBegin);

		System.out.print("\nOutput: ");

		for (int i = 0; i < n; i++) {
			if (i == 0 && indexBegin == 0)
				System.out.print("| ");
			System.out.print(arr[i]);
			if (i == indexBegin - 1 || i == indexEnd - 1)
				System.out.print(" | ");
			else if (i == n - 1)
				break;
			else
				System.out.print(", ");

		}
		ip.close();
	}
}
