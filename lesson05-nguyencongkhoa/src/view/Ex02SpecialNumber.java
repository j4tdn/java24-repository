package view;

import java.util.Scanner;

public class Ex02SpecialNumber {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập số cần kiểm tra là số đặc biệt = ");
		int n = sc.nextInt();
		if (isSpecialNumber(n)) {
			System.out.println(n + " là số đặc biệt");
		} else {
			System.out.println(n + " không phải là số đặc biệt");
		}
	}
	
	private static boolean isSpecialNumber(int n) {
		int i = 0, cur = 0;
		while (i < n) {
			cur += ++i ;
			if (n == (cur)) {
				return true;
			} 
		}
		return false;
	}
}
