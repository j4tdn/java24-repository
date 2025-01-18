package ex05;

import java.util.Scanner;

public class Ex05 {
	
	// Logic sai
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		
		System.out.println("Nhập số cần kiểm tra: ");
		int number = ip.nextInt();
		
		if (checkTheHappyNumber(number)) {
			System.out.println("Số " + number + " là số hạnh phúc");
		}
		
		if (!checkTheHappyNumber(number)) {
			System.out.println("Số " + number + " không là số hạnh phúc");
		}
		ip.close();
		
	}
	
	public static int sumOfSquares(int number) {
		int sum = 0;
		
		while (number > 0) {
			int digit = number % 10;
			sum += digit * digit;
			number /= 10;
		}
		
		return sum;
	}

	public static boolean checkTheHappyNumber(int number) {
		int a = number;
		int b = number;
		
		while (a !=1 && b != 1) {
			a = sumOfSquares(a);
			b = sumOfSquares(sumOfSquares(b));
		}
		
		return b == 1;
	}
	
}
