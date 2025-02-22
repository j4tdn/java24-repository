package view;

import java.util.Arrays;

import functional.IntTest;

public class Ex04Testing {

	/*
	 * Cho một mảng số nguyên gồm N phần tử Viết chương trình + Tìm các phần tử chẵn
	 * trong mảng + Tìm các phần tử là số nguyên tố trong mảng + Tìm các phần tử là
	 * bội của 5 trong mảng
	 *
	 * Yêu cầu 1: Mỗi yêu cầu viết 1 hàm để xử lý Yêu cầu 2: Viết duy nhất 1 hàm để
	 * xử lý cho 3 yêu cầu
	 */

	public static void main(String[] args) {

		int[] numbers = { 18, 22, 10, 45, 38, 27, 19, 88, 7, 23, 20, 80 };

		System.out.println("Phần tử chẵn " + Arrays.toString(findEvenElemetns(numbers)));
		System.out.println("Phần tử nguyên tố " + Arrays.toString(findPrimeElemetns(numbers)));
		System.out.println("Phần tử bội của 5 " + Arrays.toString(findDivisibleElemetns(numbers)));
		
		System.out.println("\n======================\n");
		System.out.println("Phần tử chẵn: "
				+Arrays.toString(findElements(numbers, number -> number % 2 ==0)));
		System.out.println("Phần tử là số nguyên tố: "
				+ Arrays.toString(findElements(numbers, number -> isPrime(number))));
		System.out.println("Phần tử chia hết cho 5: "
				+Arrays.toString(findElements(numbers, number -> number % 5 ==0)));
	}
	// source[i] % 2 == 0
	// source[i] % 5 == 0
	// isPrime(source[i]
	
	// Công thức chung
	// tham số truyền vào: source[i]
	// kdl trả về: boolean
	
	// Các hàm khác nhau biểu thức truyền vào
	// Tìm công thwucs chung của các biểu thức đó
	// + tham số truyền vào là gì
	// + kdl trả về là gì
	// Tạo ra 1 class/interface có hàm trừu tượng với tên hàm bất kỳ (phù hợp với bài toán)
	// Hàm trừu tượng đó sẽ có tham số truyền vào và kdl đã xác định
	
	private static int[] findElements(int[] numbers, IntTest intTest) {
		int[] result = new int[numbers.length];
		int count = 0;
		
		for (int i =0; i< numbers.length; i++) {
			if (intTest.test(numbers[i])) {
				result[count++]= numbers[i];
				
			}
		}
		return Arrays.copyOfRange(result, 0, count);
	}
	
	private static int[] findDivisibleElemetns(int[] source) {
		int[] target = new int[source.length];
		int count = 0;
		for (int i = 0; i < source.length; i++) {
			if (source[i] % 5 == 0) {
				target[count] = source[i];
				count++;
			}
		}
		
		return Arrays.copyOfRange(target, 0, count);
	}


	private static int[] findPrimeElemetns(int[] source) {
		int[] target = new int[source.length];
		int count = 0;
		for (int i = 0; i < source.length; i++) {
			if (isPrime(source[i])) {
				target[count] = source[i];
				count++;
			}
		}
		
		return Arrays.copyOfRange(target, 0, count);
	}
	
	private static int[] findEvenElemetns(int[] source) {
		int[] target = new int[source.length];
		int count = 0;
		for (int i = 0; i < source.length; i++) {
			if (source[i] % 2 == 0) {
				target[count] = source[i];
				count++;
			}
		}
		
		return Arrays.copyOfRange(target, 0, count);
	}
	
	private static boolean isPrime(int number) {
	
		for (int i = 2; i < number; i ++) {
			if(number % i ==0) {
				return false;
			}
		}
		return true;
	}
 }
