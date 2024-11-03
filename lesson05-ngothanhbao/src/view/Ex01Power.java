package view;

import java.util.Scanner;

public class Ex01Power {
	public static void main(String[] args) {
		int a, b;
		Scanner ip = new Scanner(System.in);
		System.out.print("Nhap a: ");
		a = Integer.parseInt(ip.nextLine());
		System.out.print("Nhap b");
		b = Integer.parseInt(ip.nextLine());
		ip.close();
		if (isPowerOf(a, b)) {
			System.out.println("La luy thua");
		} else {
			System.out.println("Khong phai la luy thua");
		}

	}
	
	public static boolean isPowerOf(int a,int b) {
		if(a / b != b * b) {
			return false;
		}
		return true;
	}
}
