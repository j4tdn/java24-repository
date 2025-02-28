package utils;

import java.util.Random;

import bean.Item;

public class ArrayUtils {
	private static Random rd = new Random();

	private ArrayUtils() {
	}
	
	public static void generate(String prefix, Item[] items) {
		System.out.println(prefix + "{");
		for (Item item: items) {
			System.out.println("      " + item);
		}
		System.out.println("}\n\n");
	}

	public static void swap(int[] elements, int left, int right) {
		int temp = elements[left];
		elements[left] = elements[right];
		elements[right] = temp;
	}

	public static void swap(float[] elements, int left, int right) {
		float temp = elements[left];
		elements[left] = elements[right];
		elements[right] = temp;
	}
	
	public static void swap(String[] elements, int left, int right) {
		String temp = elements[left];
		elements[left] = elements[right];
		elements[right] = temp;
	}
	
	public static void swap(Item[] elements, int left, int right) {
		Item temp = elements[left];
		elements[left] = elements[right];
		elements[right] = temp;
	}

	public static int[] randomElements(int length, int startInc, int endExcl) {
		int[] elements = new int[length];
		for (int i = 0; i < length; i++) {
			elements[i] = rd.nextInt(startInc, endExcl);
		}
		return elements;
	}
}
