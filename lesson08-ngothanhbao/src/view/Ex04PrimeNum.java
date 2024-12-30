package view;

import java.util.Scanner;

public class Ex04PrimeNum {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.print("Nhập a: ");
		int a = Integer.parseInt(ip.nextLine());
		System.out.print("Nhập b: ");
		int b = Integer.parseInt(ip.nextLine());
		ip.close();
		if(commonDiv(a, b) > 1)
		{
			System.out.println("a va b la so nguyen to tuong duong");
		} else {
			System.out.println("a va b khong phai la so nguyen to tuong duong");
		}
	}

	public static int commonDiv(int a, int b) {
		if (a == b)
			return a;
		if (a > b)
			return commonDiv(a - b, b);
		else
			return commonDiv(a, b - a);
	}

}
