package view;

import functional.IntOperator;

public class Ex05Reduce {

	public static void main(String[] args) {
		
		int[] numbers = {10, 20, 15, 23};
		
		System.out.println("Tim tong --> "+ reduce(numbers, 0, (a, b) -> a + b));
		System.out.println("Tim tich --> "+ reduce(numbers, 1, (a, b) -> a * b));
		System.out.println("Tim gia tri lon nhat --> "+ reduce(numbers, Integer.MIN_VALUE, (a, b) -> Math.max(a, b)));
		System.out.println("Tim gia tri nho nhat --> "+ reduce(numbers, Integer.MAX_VALUE, (a, b) -> Math.min(a, b)));
	}
	
	private static int reduce(int[] elements, int initial, IntOperator operator) {
		int result = initial;
		for (int element: elements) {
			result = operator.operate(result, element);
		}
		return result;
	}
	
}
