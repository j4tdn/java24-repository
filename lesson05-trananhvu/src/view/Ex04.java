
package view;

import java.util.Arrays;

public class Ex04 {
	private static void sortArr(int arr[]) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
	}

	private static boolean checkExist(int n, int[] arr, int index) {
		for (int i = 0; i < index; i++) {
			if (n == arr[i])
				return true;
		}
		return false;
	}

	private static int[] handleArray(int arr[]) {
		int[] arrC = new int[arr.length];
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (!checkExist(arr[i], arr, i)) {
				arrC[count] = arr[i];
				count++;
			}
		}
		return Arrays.copyOfRange(arrC, 0, count);
	}

	private static int sum(int[] arrC) {
		int sum = 0;
		for (int i = 1; i < arrC.length - 1; i++) {
			sum += arrC[i];
		}

		return sum;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 5, 8, 9, 2, 5, 9 };
		sortArr(arr);
		int[] arrC;
		arrC = handleArray(arr);
		System.out.println(Arrays.toString(arrC));
		System.out.println("Tong cac phan tu ko trung nhau: ");
		System.out.println(sum(arrC));
	}
}
