package view;

import java.util.Arrays;

import functional.IntTest;

public class Ex04Testing {

	
		
		/*
		 * Cho 1 mảng số nguyên gồm N phần tử
		 * 	Viết ctrình:
		 *  + Tìm các phần tử chẵn tgrong mảng
		 *  + Tìm các phần tử là số nguyên tố trong mảng
		 *  + Tìm các phẩn tử là bội của 5 trong mảng
		 *  
		 *  Yc1: mỗi ý viết 1 hàm
		 *  Yc2: viết duy nhất 1 hàm xử lí 3 ý
		 *  
		 */
	
	public static void main(String[] args) {
		int[] numbers = {18, 22, 10, 45, 38, 27, 19, 88, 7, 23, 20, 80};
		// Yeu cau 1 
		System.out.println("Phần tử chẵn: "+Arrays.toString(findEvenElements(numbers)));
		System.out.println("Phần tử là số nguyên tố: "+ Arrays.toString(findPrimeElements(numbers)));
		System.out.println("Phần tử chia hết cho 5: "+Arrays.toString(findDivisibleElements(numbers)));
	
		System.out.println("\n=============================\n");
		// Yeu cau 2
		
		System.out.println("Phần tử chẵn: "
				+Arrays.toString(findElements(numbers, number -> number % 2 ==0)));
		System.out.println("Phần tử là số nguyên tố: "
				+ Arrays.toString(findElements(numbers, number -> isPrime(number))));
		System.out.println("Phần tử chia hết cho 5: "
				+Arrays.toString(findElements(numbers, number -> number % 5 ==0)));
	
	
	}
		
		// source[i] % 5 == 0
		// source[i] % 2 == 0
		// isPrime(source[i])
		// ===> Đều là boolean
		
		// Các hàm khác nhau biểu thức truyền vào
		// Tìm công thức chung (strategy) của các biểu thức đó
		// + tham số truyền vào ? 
		// + kdl trả về là gì ? 
		// Tạo ra 1 class/interface có hàm trừu tượng với tên hàm bất kì (phù hợp vs bài)
		// hàm trừu tượng đó sẽ có tham số truyền vào và kdl trả về như đã xác định
		
		// Công thức chung: 
		// tham số vào: source[i]
		// kdl trả về: boolean
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
	private static int[] findEvenElements(int[] numbers) {
		int[] result = new int[numbers.length];
		int count = 0;
		
		for (int i =0; i< numbers.length; i++) {
			if (numbers[i] % 2 ==0) {
				result[count++]= numbers[i];
				
			}
		}
		return Arrays.copyOfRange(result, 0, count);
	}
	private static int[] findDivisibleElements(int[] numbers) {
		int[] result = new int[numbers.length];
		int count = 0;
		
		for (int i =0; i< numbers.length; i++) {
			if (numbers[i] % 5 ==0) {
				result[count++]= numbers[i];
				
			}
		}
		return Arrays.copyOfRange(result, 0, count);
	}
	private static int[] findPrimeElements(int[] numbers) {
		int[] result = new int[numbers.length];
		int count = 0;
		
		for (int i =0; i< numbers.length; i++) {
			if (isPrime(numbers[i])) {
				result[count++]= numbers[i];
				
			}
		}
		return Arrays.copyOfRange(result, 0, count);
	}
	
	
	private static boolean isPrime(int number) {
		if (number ==1 || number == 0) {
			return false;
		}
		for (int i =2; i <= Math.sqrt(number); i++) {
			if (number % i==0 ) {
				return false;
			}
		}
		return true;
	}
}
