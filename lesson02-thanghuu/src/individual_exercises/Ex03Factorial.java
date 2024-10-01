package individual_exercises;

import java.util.Scanner;

public class Ex03Factorial {
	
	private static long factorial(int number) {
		long result = 1;
		for(int i = 1; i <= number; i++) {
			result *= i;
		}
		return result;
	}
	
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Nhap so can kiem tra: ");
		int n = Integer.parseInt(ip.nextLine());
		
		if(n < 0) {
			System.out.println("Loi, n Khong phai la so nguyen duong!");
		}
		else {
			long result = factorial(n);
			System.out.println(n +"! = " + result);
		}
		ip.close();
	}
}
