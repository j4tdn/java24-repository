package view.stream;

import java.util.Arrays;

public class Ex09StreamPrimitive {

	public static void main(String[] args) {

		int[] numbers = { 1, 2, 3, 4, 5, 6 };
		
		System.out.println("sum --> " + Arrays.stream(numbers).sum());
		System.out.println("average --> " + Arrays.stream(numbers).average().orElse(-1));

	}

}