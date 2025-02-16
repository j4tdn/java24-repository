package view;

import java.util.Arrays;

import functional.IntTest;

public class Ex04Testing {
	
	public static void main(String[] args) {
		int[] numbers = { 18, 22, 10, 45, 38, 27, 19, 88, 7, 23, 20, 80 };

//		Yeu cau 2
		IntTest evenTest = new IntTest() {
			
			@Override
			public boolean test(int number) {
				// TODO Auto-generated method stub
				return number % 2 == 0;
			}
		};
		
		System.out.println("Phan tu chan --> "+ Arrays.toString(findElements(numbers, evenTest)));
		
		System.out.println("Phan tu la so nguyen to --> "+ Arrays.toString(findElements(numbers, number -> isPrime(number))));
		System.out.println("Phan tu la boi cua 5 --> "+ Arrays.toString(findElements(numbers, number -> number % 5 == 0)));
	}
	
//	Công thức chung
//	tham số truyền vào: source(i)
//	kdl trả về: boolean
	
//	IntTest
//	boolean test(int number);
	
	// Các hàm khác nhau biểu thức truyền vào
//	Tìm Công thức chung của các biểu thức đó
//	+ Tham số truyền vào?
//	+ kdl trả về là gì?
//	Tạo ra 1 class/interface có hàm trừu tượng với tên hàm bất
//	kỳ (phù hợp với bài toán), hàm trừu tượng đó sẽ có tham số
//	truyền vào và kdl trả về như đã xác định
	private static int[] findElements(int[] source, IntTest intTest) {
		int[] target = new int[source.length];
		int count = 0;
		for (int i = 0; i < source.length; i++) {
			if (intTest.test(source[i])) {
				target[count++] = source[i];
			}
		}
		return Arrays.copyOfRange(target, 0, count);
	}
	
//	==============================================
	
	private static int[] findDivisibleElements(int[] source) {
		int[] target = new int[source.length];
		int count = 0;
		for (int i = 0; i < source.length; i++) {
			if (source[i] % 5 == 0) {
				target[count++] = source[i];
			}
		}
		return Arrays.copyOfRange(target, 0, count);
	}

	private static int[] findEvenElements(int[] source) {
		int[] target = new int[source.length];
		int count = 0;
		for (int i = 0; i < source.length; i++) {
			if (source[i] % 2 == 0) {
				target[count++] = source[i];
			}
		}
		return Arrays.copyOfRange(target, 0, count);
	}

	private static int[] findPrimeElements(int[] source) {
		int[] target = new int[source.length];
		int count = 0;
		for (int i = 0; i < source.length; i++) {
			if (isPrime(source[i])) {
				target[count++] = source[i];
			}
		}
		return Arrays.copyOfRange(target, 0, count);
	}

	private static boolean isPrime(int number) {
		if (number == 0 || number == 1) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(number); i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}
}
