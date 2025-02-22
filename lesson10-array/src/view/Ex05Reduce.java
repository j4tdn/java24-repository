package view;

import functional.IntOperator;

public class Ex05Reduce {

	/*
	 Cho một mảng số nguyên gồm 5 phần tử
	 Viết chương trình
	 + Tìm tổng các phần tử trong mảng
	 + Tìm tích các phần tử trong mảng
	 + Tìm giá trị lớn nhất
	 + Tìm giá trị nhỏ nhất
	 
	 Yêu cầu 1: Tạo mỗi hàm thực hiện một chức năng
	 Yêu cầu 2: Tạo mỗi hàm để thực hiện tất cả các chức năng
	 
	 */
	
	public static void main(String[] args) {
	
		int[] numbers = {8, 2, 20, 14, 8, 6, 5};
		System.out.println("Tìm tổng: " + sum(numbers));
		System.out.println("Tìm tích: " + mul(numbers));
		System.out.println("Tìm giá trị lớn nhất: " + max(numbers));
		System.out.println("Tìm giá trị nhỏ nhất: " + min(numbers));
		
		System.out.println("\n========================\n");
		
		System.out.println("Tìm tổng: " + reduce(numbers, 0, (a, b) -> a + b));
		System.out.println("Tìm tích: " + reduce(numbers, 1, (a, b) -> a * b));
		System.out.println("Tìm giá trị lớn nhất: " + reduce(numbers, Integer.MIN_VALUE, (a, b) -> Math.max(a, b)));
		System.out.println("Tìm giá trị nhỏ nhất: " + reduce(numbers, Integer.MAX_VALUE, (a, b) -> Math.min(a, b)));
	}

	public static int reduce(int[] elements, int initial, IntOperator operator) {
		int result = initial;
		for (int element: elements) {
			result = operator.operator(result, element);
		}
		return result;
	}
	
	// ======================= //
	
	public static int sum(int[] elements) {
		int sum = 0;
		for (int element: elements) {
			sum = sum + element;
		}
		return sum;
	}
	
	public static int mul(int[] elements) {
		int mul = 1;
		for (int element: elements) {
			mul = mul * element;
		}
		return mul;
	}
	
	public static int max(int[] elements) {
		int max = Integer.MIN_VALUE;
		for (int element: elements) {
			max = max < element ? element : max;
		}
		return max;
	}
	
	public static int min(int[] elements) {
		int min = Integer.MAX_VALUE;
		for (int element: elements) {
			min = min > element ? element : min;
		}
		return min;
	}
}
