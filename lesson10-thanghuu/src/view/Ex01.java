package view;

import java.util.Arrays;
import java.util.Random;

public class Ex01 {

	public static Random rd = new Random();

	public static void main(String[] args) {

//		int[] arrays = generateArray();
		int[] arrays = { 1, 2, 3, 4, 3, 1 };
		System.out.println(Arrays.toString(arrays));

		System.out.println("Mang khong trung: " + Arrays.toString(duplicateElement(arrays)));

		compareValueElement(arrays);

		sortElement(arrays, arrays.length);
		System.out.println("Mang khi duoc sap xep: ");
		System.out.println(Arrays.toString(arrays));
		System.out.println("\nGiá trị lớn thứ 3 trong mảng là: " + find3rdHighestNumber(arrays));

	}

	private static void sortElement(int[] arr, int n) {
		int temp;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (arr[j] < arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}
	
	private static int find3rdHighestNumber(int[] a) {
		int cnt = 1, thirdMax = a[0];
		for (int i = 1; i < a.length; i++) {
			if (thirdMax > a[i]) {
				thirdMax = a[i];
				cnt++;
				if (cnt == 3) {
					break;
				}

			} else {
				continue;
			}
		}
		if (cnt < 3) {
			System.out.println("\nKhông có giá trị lớn thứ 3!!");
			System.exit(0);
		}
		
		return thirdMax;
	}

	private static void compareValueElement(int[] arrays) {
		double before = 0, after = 0;

		for (int i = 0; i < arrays.length / 2; i++) {
			before += arrays[i];
		}

		for (int i = (arrays.length + 1) / 2; i < arrays.length; i++) {
			after += arrays[i];
		}

		if (before > after) {
			System.out.println(
					arrays.length / 2 + " phan tu dau tien lon hon " + (arrays.length + 1) / 2 + " phan tu cuoi cung");
		} else {
			System.out.println(
					arrays.length / 2 + " phan tu dau tien be hon " + (arrays.length + 1) / 2 + " phan tu cuoi cung");
		}

	}

	private static int[] duplicateElement(int[] arrays) {
		int[] target = new int[arrays.length];
		int index = 0;
		for (int value : arrays) {
			if (isDuplicate(value, arrays)) {
				continue;
			} else {
				target[index++] = value;
			}

		}
		return Arrays.copyOfRange(target, 0, index);
	}

	private static boolean isDuplicate(int value, int[] arrays) {
		int count = 0;
		for (int num : arrays) {
			if (num == value) {
				count++;
			}
			if (count == 2) {
				return true;
			}
		}
		return false;
	}

	private static int[] generateArray() {
		int n = rd.nextInt(10 - 1 + 1) + 1;
		int[] array = new int[n];

		for (int i = 0; i < array.length; i++) {
			array[i] = rd.nextInt(50 - 10 + 1) + 10;
		}

		return array;
	}
}
