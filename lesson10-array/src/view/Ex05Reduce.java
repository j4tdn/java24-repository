package view;

import functional.IntOperator;

public class Ex05Reduce {
 /*
  Cho 1 mảng số nguyên gồm 5 phần tử
  Viết chương trình
  	+ Tìm tổng các phần tử trong mảng
  	+ Tìm tich các phần tử trong mảng
  	+ Tìm giá trị lớn nhất 
  	+ Tìm giá trị nhỏ nhất
  	
  	Yêu cầu 1: Tạo mỗi hàm thực hiện 1 chức năng
  	Yêu cầu 2: Tạo một hàm để thực hiện tất cả các chức năng
  */
	
	public static void main(String[] args) {
		
		int[] numbers = { 18, 22, 10, 45, 38, 27, 19, 88, 7, 23, 20, 80 };
		System.out.println("Tổng các phần tử --> " + findSum(numbers));
		System.out.println("Tích các phần tử --> " + findMul(numbers));
		System.out.println("Phần tử lớn nhất --> " + findGreatest(numbers));
		System.out.println("Phần tử nhỏ nhất --> " + findSmallest(numbers));

		System.out.println("\n==========================\n");

		System.out.println("Tổng các phần tử --> " + reduce(numbers, 0, (a, b) -> a + b));
		System.out.println("Tích các phần tử --> " + reduce(numbers, 1, (a, b) -> a * b));
		System.out.println("Phần tử lớn nhất --> " + reduce(numbers, Integer.MAX_VALUE, (a, b) -> Math.max(a, b)));
		System.out.println("Phần tử nhỏ nhất --> " + reduce(numbers, Integer.MIN_VALUE, (a, b) -> Math.min(a, b)));
	}
	
	private static int reduce (int[] elements , int initial, IntOperator operator) {
		int result = initial;
		
		for(int element:elements) {
			result = operator.operate(result, element);
		}
		return result;
	}
	
	private static int findSum(int[] source) {
		int target = 0;
		
		for(int i = 0; i < source.length; i ++) {
			target = target + source[i];
		}
		return target;
	}
	
	private static long findMul(int[] source) {
		long target = 1;

		for (int i = 0; i < source.length; i++) {
			target = target * source[i];
		}
		return target;
	}
	
	private static int findGreatest(int[] source) {
		int target = source[0];

		for (int i = 0; i < source.length; i++) {
			if(target < source[i]) {
				target = source[i];
			}
		}
		return target;
	}
	
	private static int findSmallest(int[] source) {
		int target = source[0];

		for (int i = 0; i < source.length; i++) {
			if(target > source[i]) {
				target = source[i];
			}
		}
		return target;
	}
	
	
}
