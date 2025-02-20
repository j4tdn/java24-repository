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
 
 Yêu cầu 1 : Tạo mỗi hàm thực hiện một chức năng 
 Yêu cầu 2 : Tạo một hàm để thực hiện tất cả các chức năng
 */
	public static void main(String[] args) {
		int[] numbers = {1, 2, 3, 4, 5 };
		
		System.out.println("\n---------------------------");
		System.out.println("Tìm tổng : "+reduce(numbers, 0, (a,b) -> a+b));
		System.out.println("Tìm tích : "+reduce(numbers, 1, (a,b) -> a*b));
		System.out.println("Tìm max : "+reduce(numbers, Integer.MIN_VALUE, (a,b) -> Math.max(a, b)));
		System.out.println("Tìm min : "+reduce(numbers, Integer.MAX_VALUE, (a,b) -> Math.min(a, b)));
	}
	
	
	private static int reduce(int[] elements, int inital, IntOperator operator) {
		int result = inital;
		for( int element : elements) {
			result = operator.operate(result, element);
		}
		return result;
		
	}
	
	//------------------------------------------------
	
	private static int sumArr(int[] elements) {
		int s = 0;
		for(int i = 0; i < elements.length; i++) {
			s += elements[i];
		}
		return s;
	}
	
	public static int mulArr(int[] elements) {
		int mul = 1;
		for(int i = 0; i < elements.length; i++) {
			mul *= elements[i];
		}
		return mul;
	}
	
	public static int maxArr(int[] elements) {
		int max = Integer.MIN_VALUE;
		for(int element : elements) {
			max = max < element ? element : max;
		}
		return max;
	}
	
	public static int minArr(int[] elements) {
		int min = Integer.MAX_VALUE;
		for(int element : elements) {
			min = min < element ? element : min;
		}
		return min;
	}
}
