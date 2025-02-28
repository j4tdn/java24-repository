package utils;

import java.util.Random;

import bean.Item;

public class ArrayUtils {

	private static Random rd = new Random();

	private ArrayUtils() {
	}
	
	public static void reverse(int[] elements) {
		for (int i = 0; i < elements.length/2; i++) {
			int tmp = elements[i];
			elements[i] = elements[elements.length - i - 1];
			elements[elements.length - i - 1] = tmp;
		}
	}
	
	public static void generate(String prefix, Item[] items) {
		System.out.println(prefix + "{");
		for (Item item: items) {
			System.out.println("    " + item);
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
	
	public static void swap(Item[] items, int left, int right) {
		Item temp = items[left];
		items[left] = items[right];
		items[right] = temp;
	}

	public static int[] randomElements(int length, int startInc, int endExcl) {
		int[] elements = new int[length];
		for (int i = 0; i < length; i++) {
			elements[i] = rd.nextInt(startInc, endExcl);
		}
		return elements;
	}
}