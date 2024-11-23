package view;

import java.util.Scanner;

import Exception.InvalidNumberException;

public class Ex01 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		float a = 0, b = 0;

		do {
			try {
				System.out.print("Nhap a: ");
				a = Integer.parseInt(ip.nextLine());
				System.out.print("Nhap b: ");
				b = Integer.parseInt(ip.nextLine());
				checkNumber(a);
				break;
			} catch (NumberFormatException e) {
				System.out.println(e.getMessage());
			}
		} while (true);

		System.out.printf("%sx + %s = 0", a, b);
		
		float result = (-b)/a;
		
		System.out.print("\nNghiem cua phuong trinh la: x = " + result);
		ip.close();
	}

	private static void checkNumber(float n) {
		if (n == 0) {
			throw new InvalidNumberException("Number a is not valid !!");
		}
	}
}
