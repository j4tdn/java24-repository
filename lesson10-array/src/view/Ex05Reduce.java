package view;

import functional.IntOperator;

public class Ex05Reduce {
	/*
	 * Cho một mảng số nguyên gồm 5 phần tử Viết chương trình + Tìm tổng các phần tử
	 * trong mảng + Tìm tích các phần tử trong mảng + Tìm giá trị lớn nhất + Tìm giá
	 * trị nhỏ nhất
	 * 
	 * Yc 1: Tạo mỗi hàm thực hiện 1 chức năng Yc 2: Tạo một hàm để thực hiện tất cả
	 * chức năng
	 */
	public static void main(String[] args) {
		int[] numbers = { 2, 3, 4, 5, 6 };

		System.out.println(reduce(numbers, 0, (a, b) -> a + b));
		System.out.println(reduce(numbers, 1, (a, b) -> a * b));
		System.out.println(reduce(numbers, Integer.MIN_VALUE, (a, b) -> a = a < b ? b : a));
		System.out.println(reduce(numbers, Integer.MAX_VALUE, (a, b) -> a = a > b ? b : a));
	}

	private static int reduce(int[] numbers, int initial, IntOperator operator) {
		int result = initial;
		for (int number : numbers) {
			result = operator.operator(result, number);
		}
		return result;
	}

	// =========================================//

	private static int add(int... numbers) {
		int result = 0;
		for (int number : numbers) {
			result += number;
		}
		return result;
	}

	private static int mul(int... numbers) {
		int result = 1;
		for (int number : numbers) {
			result *= number;
		}
		return result;
	}

	private static int max(int... numbers) {
		int result = Integer.MIN_VALUE;
		for (int number : numbers) {
			if (result < number) {
				result = number;
			}
		}
		return result;
	}

	private static int min(int... numbers) {
		int result = Integer.MAX_VALUE;
		for (int number : numbers) {
			if (result > number) {
				result = number;
			}
		}
		return result;
	}
}
