package utils;

import java.util.Random;

public class ArrayUtils {
	private static Random rd = new Random();
	private ArrayUtils() {}

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
	public static int[] randomElements(int length, int startInc, int endExcl) {
		int[] elements = new int[length];
		for (int i =0; i < length; i++) {
			elements[i] = rd.nextInt(startInc, endExcl);
		}
		return elements;
	}
}
