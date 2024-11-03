package ex02;

import java.util.Scanner;

public class SpecialNumberChecker {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Nhập số nguyên: ");
		int n = ip.nextInt();
		
		if(isSpecialNumber(n)) {
			System.out.println(n + "Là số đặc biệt");
		}else {
			System.out.println(n + "Không là số đặc biệt");
		}
	}
	
	public static boolean isSpecialNumber(int n) {
		if(n < 1) {
			return false;
		}
		int sum = n * (n + 1) / 2;
		
		return sum==n;
	}

}
