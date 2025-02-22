package utils;

import java.util.Random;

public class ArrayUtils {

	private static Random rd = new Random();

	public ArrayUtils() {
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
}
