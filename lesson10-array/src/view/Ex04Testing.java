package view;

import java.util.Arrays;

import functional.IntTest;

public class Ex04Testing {
	/*
	 	Cho một mảng số nguyên gồm N phần tử
	 	Viết chưing trình :
	 		+ Tìm các phần tử chẵn trong mảng
	 		+ Tim các phần tử là số nguyên tố trong mảng
	 		+ Tìm các phần tử là bội của 5 trong mảng
	 		
	 	Yêu cầu 1: mỗi yêu cầu viết 1 hàm để sử lý
	 	Yêu cầu 2: Viết duy nhất 1 hàm để sử lý 3 yêu cầu
	 	
	 */
	public static void main(String[] args) {
		int[] numbers = {18,22,10,45,38,27,19,88,7,23,20,80};
		
		// yêu cầu 1
		
		System.out.println("Phần tử là số chẵn: " + Arrays.toString(findEvenElements(numbers)));
		System.out.println("Phần tử là số nguyên tố: " + Arrays.toString(findEPrimeElements(numbers)));
		System.out.println("Phần tử là bội của 5: " + Arrays.toString(findDivisibleElements(numbers)));
		
		System.out.println("\n===============================\n");
		// yêu cầu 2
		System.out.println("Phần tử là số chẵn: " + Arrays.toString(findElements(numbers,number-> number % 2 == 0)));
		
		IntTest primeTest = number ->isPrime(number);
		System.out.println("Phần tử là số nguyên tố: " + Arrays.toString(findElements(numbers,primeTest)));
		System.out.println("Phần tử là bội của 5: " + Arrays.toString(findElements(numbers,number-> number % 5 == 0)));
	}
	//source[i]%2 == 0
	//source[i]%5 == 0
	//isPrime(source[i])
	
	// Bài toán
	// tham số truyền vào source(i)
	// kdl trả về boolean
	
	//IntTest
	// boolean test (int number);
	
	//các hàm khác nhau biểu thức truyền vào
	// tìm công thức chung của các biểu thức đó
	// + tham số truyền vào ?
	// + kdl trả về là gì ?
	// tạo ra 1 class/interface có hàm trừu tượng với tên hàm bất kỳ(phù hợp bài toán)
	// hàm trừu tượng đó sẽ có tham số truyền vào và kdl trả về như đã xác định
	
	private static int[] findElements(int[] source, IntTest intTest) {
		int[] target = new int[source.length];
		int count=0;
		for(int i = 0;i<source.length;i++) {
			if(intTest.test(source[i])) {
				target[count++] = source[i];
			}
		}
		
		
		return Arrays.copyOfRange(target, 0, count);
	}

	
	
	//======================================================
	private static int[] findEvenElements(int[] source) {
		int[] target = new int[source.length];
		int count=0;
		for(int i = 0;i<source.length;i++) {
			if(source[i]%2 ==0) {
				target[count++] = source[i];
			}
		}
		
		
		return Arrays.copyOfRange(target, 0, count);
	}
	private static int[] findEPrimeElements(int[] source) {
		int[] target = new int[source.length];
		int count=0;
		for(int i = 0;i<source.length;i++) {
			if(isPrime(source[i])) {
				target[count++] = source[i];
			}
		}
		
		
		return Arrays.copyOfRange(target, 0, count);
	}
	private static boolean isPrime(int number) {
		if(number == 0 || number ==1) {
			return false;
		}
		for(int i = 2;i<= Math.sqrt(number);i++) {
			if(number % i == 0) {
				return false;
			}
		}
		return true;
	}
	private static int[] findDivisibleElements(int[] source) {
		int[] target = new int[source.length];
		int count=0;
		for(int i = 0;i<source.length;i++) {
			if(source[i] % 5 == 0) {
				target[count++] = source[i];
			}
		}
		
		
		return Arrays.copyOfRange(target, 0, count);
	}
//===================================================================================
}
