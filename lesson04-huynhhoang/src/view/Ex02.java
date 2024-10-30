package view;

import java.util.Arrays;

public class Ex02 {
	public static void main(String[] args) {
		int[] arr = { 12, 21, 25, 19, 32, 35, 49, 10, 33, 14, 18 };
		int count = arr.length;
		int[] result = new int[count];
		int index = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 7 == 0 && arr[i] % 5 != 0) {
				result[index++] = arr[i];
			}
		}

		for (int i = 0; i < arr.length; i++) {
			if ((arr[i] % 5 != 0 && arr[i] % 7 != 0) ||(arr[i] % 5 == 0 && arr[i] % 7 == 0) ) {
				result[index++] = arr[i];
			}
		}

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 5 == 0 && arr[i] % 7 != 0) {
				result[index++] = arr[i];
			}
		}

		print(result);
	}

	private static void print(int[] result) {
		boolean first = true;
		for (int i : result) {
			if (i % 7 == 0 && i % 5 != 0) {
				if (!first) System.out.print(",");
				System.out.print(i );
				first = false;
			}
		}
		System.out.print("|");
		first = true;
		for (int i : result) {
			if ((i % 7 != 0 && i % 5 != 0) || (i % 7 == 0 && i % 5 == 0)) {
				if (!first) System.out.print(",");
				System.out.print(i );
				first = false;
			}
		}

		System.out.print("|");
		first = true;		
		for (int i : result) {
			if (i % 7 != 0 && i % 5 == 0) {
				if (!first) System.out.print(",");
				System.out.print(i );
				first = false;
			}
		}

	}

}
