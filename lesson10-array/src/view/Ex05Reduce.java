package view;

import functional.IntOperator;

public class Ex05Reduce {
	
	/*
	 cho một mảng số nguyên gồm 5 phần tử
	 Viết chương trình
	 	+ tìm tổng các phần tử trong mảng
	 	+ tìm tích các phần tử trong mảng
	 	+ tìm giá trị lớn nhất
	 	+ tìm giá trị nhỏ nhất
	 	
	 	Yêu cầu 1: tạo mỗi hàm thực hiện một chức năng
	 	Yêu cầu 2: Tạo một hàm để thực hiện tất cả các chức năng
	 */
	public static void main(String[] args) {
	
		int[] numbers = {8,2,20,14,8,6,5};
		System.out.println("Tìm tổng : " + sum(numbers));
		System.out.println("Tìm tích : " + mul(numbers));
		System.out.println("Tìm giá trị lớn nhất : " + max(numbers));
		System.out.println("Tìm giá trị nhỏ nhất : " + min(numbers));
		System.out.println("======================================\n");
		
		System.out.println("Tìm tổng : " + reduce(numbers, 0, (a,b) -> a + b));
		System.out.println("Tìm tích : " + reduce(numbers, 1, (a,b) -> a * b));
		System.out.println("Tìm giá trị lớn nhất : " + reduce(numbers, Integer.MIN_VALUE, (a,b) -> Math.max(a, b)));
		System.out.println("Tìm giá trị nhỏ nhất : " + reduce(numbers, Integer.MAX_VALUE, (a,b) -> Math.min(a, b)));
		
	}
	
	// operate ==> result = a || element = b
	// result = result + element
	// result = result * element
	// result = result < element ? element : result;
	// result = result > element ? element : result;
	private static int reduce(int[] elements, int intial, IntOperator operator) {
		int result = intial;
		for(int element: elements) {
			result = operator.operate(result, element);
		}
		return result;
	}
	
	//==========================================================================
	
	private static int sum(int[] elements) {
		int sum = 0;
		for(int element: elements) {
			sum = sum + element;
		}
		return sum;
	}
	private static int mul(int[] elements) {
		int mul = 1;
		for(int element: elements) {
			mul = mul * element;
		}
		return mul;
	}
	private static int max(int[] elements) {
		int max = Integer.MIN_VALUE;
		for(int element: elements) {
			max = max < element ? element : max;
		}
		return max;
	}
	private static int min(int[] elements) {
		int min = Integer.MAX_VALUE;
		for(int element: elements) {
			min = min > element ? element : min;
		}
		return min;
	}

}
