package video_array;

import java.util.Arrays;

public class Ex02Filter {

	public static void main(String[] args) {
		int[] numbers = { 23, 25, 16, 28, 66, 19, 3, 7 };
		int[] oddNumbers = findOddNumbers(numbers);
		System.out.println(Arrays.toString(oddNumbers));
	}

	private static int[] findOddNumbers(int[] elements) {
		//idx: 0 1 2 3 4
		//val: 0 0 0 0 0
		int[] oddElements = new int[elements.length];
		int cnt = 0;
		for (int element : elements) {
			if (element % 2 != 0) {
				oddElements[cnt++] = element;
			}
		}
		
		int[] res = new int[cnt];
		for (int i = 0; i < cnt; i++) {
			res[i] = oddElements[i];
		}
		return res;
	}
}
