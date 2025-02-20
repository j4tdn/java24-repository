package view;

import functional.IntOperator;

public class Ex05Reduce {

	/*
	 * Cho mảng số nguyên gồm 5 ptu
	 * Viết ctrinh
	 * 	+ Tìm tổng các ptu trong mảng
	 * 	+ Tìm tích các ptu trong mảng
	 * 	+ Tìm giá trị lớn nhất
	 * 	+ Tìm giá trị nhỏ nhất
	 * 
	 * Yc1: mỗi hàm 1 chức năng
	 * Yc2: 1 hàm tất cả chức năng
	 */
	public static void main(String[] args) {
		int[] numbers= {1,2,3,4,5};
		System.out.println(sum(numbers));
		System.out.println(multiple(numbers));
		System.out.println(maxValue(numbers));
		System.out.println(minValue(numbers));
		
		
		System.out.println("Tìm tổng: "+ reduce(numbers, 0, (a, b) -> (a+b)));
		System.out.println("Tìm tích: "+ reduce(numbers, 1, (a,b) -> (a*b)));
		System.out.println("Tìm gtri lớn nhất: "+reduce(numbers, Integer.MIN_VALUE, (a,b) -> Math.max(a, b)));
		System.out.println("Tìm gtrị nhỏ nhất: "+reduce(numbers, Integer.MAX_VALUE, (a,b) -> Math.min(a, b)));
		
		
		
		
		
	}
	private static int reduce(int[] numbers,int initial, IntOperator test) {
		int result = initial;
		for (int number: numbers) {
			result = test.operator(number, result);
		}
		return result;
		
	}
	private static int sum(int[] numbers) {
		int sum = 0;
		for (int number:numbers) {
			sum += number;
		}
		return sum;
	}
	private static int multiple(int[] numbers) {
		int mul = 1;
		for (int number:numbers) {
			mul *= number;
		}
		return mul;
	}
	private static int maxValue(int[] numbers) {
		int max = Integer.MIN_VALUE;
		for (int number:numbers) {
			if (number > max) {
				max = number;
			}
		}
		return max;
	}
	private static int minValue(int[] numbers) {
		int min = Integer.MAX_VALUE;
		for (int number:numbers) {
			if (number < min) {
				min = number;
			}
		}
		return min;
	}
}
