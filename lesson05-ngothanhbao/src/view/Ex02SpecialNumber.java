package view;

import java.util.Scanner;

public class Ex02SpecialNumber {
	public static void main(String[] args) {
		int n;
		Scanner ip = new Scanner(System.in);
		System.out.print("Nhap n: ");
		n= Integer.parseInt(ip.nextLine());
		if(isSpecialNumber(n)) {
			System.out.println("La so dac biet");
		} else {
			System.out.println("Khong phai la so dac biet");
		}
	}
	
	public static boolean isSpecialNumber(int n) {
		int temp = 0;
		for(int i = 1;i < n;i++) {
			temp = temp + i;
			if(temp == n) {
				return true;
			}
		}
		return false;
	}
}
