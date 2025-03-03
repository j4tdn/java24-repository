package utils;

import java.util.Arrays;

import bean.Item;

public class ArrayUtils {
	private ArrayUtils() {
		// TODO Auto-generated constructor stub
	}

	public static void generate(String prefix, Item[] items) {
		System.out.println(prefix + "{");
		for (Item item : items) {
			System.out.println("   " + item);
		}
		System.out.println("}\n\n");
	}

	public static void swap(Item[] items, int before, int after) {
		Item temp = items[before];
		items[before] = items[after];
		items[after] = temp;
	}
	
	public static void swap(String[] items, int before, int after) {
		String temp = items[before];
		items[before] = items[after];
		items[after] = temp;
	}

	public static Item[] remove(Item[] arr, int position) {
		for (int i = position; i < arr.length; i++) {
			arr[i] = arr[i + 1];
		}
		return Arrays.copyOf(arr, arr.length - 1);
	}

	public static int[] remove(int[] arr, int position) {
		for (int i = position; i < arr.length - 1; i++) {
			arr[i] = arr[i + 1];
		}
		return Arrays.copyOf(arr, arr.length - 1);
	}

	public static int[] clearId(int[] sourse) {
		for (int i = 0; i < sourse.length - 1; i++) {
			for (int j = sourse.length - 1; j > i; j--) {
				if (sourse[i] == sourse[j]) {
					sourse = remove(sourse, j);
				}
			}
		}
		return sourse;
	}
	
	public static Item getHighestPrice(Item[] sourse) {
		int max = Integer.MIN_VALUE;
		Item res = null;
		for (int i = 0; i < sourse.length; i++) {
			if (sourse[i].getSalesPrice() > max) {
				max = sourse[i].getSalesPrice();
				res = sourse[i];
			}
		}
		return res;
	}
	
	public static int sumOfAnAscii(byte[] bytes) {
		int sum = 0;
		for (byte b: bytes) {
			sum += b;
		}
		return sum;
	}
}
