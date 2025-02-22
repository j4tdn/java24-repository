package utill;

import java.util.Random;

public class ArrayUtils {
	private static Random rd = new Random();
	public ArrayUtils() {
	}
	private static void swap(int[] elements,int left, int right) {
		int temp = elements[left];
		elements[left] = elements[right];
		elements[right] = temp;
	}
//	public static int[] randomElements(int )
}
