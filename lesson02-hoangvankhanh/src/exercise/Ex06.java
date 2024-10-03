package exercise;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);

		int a, b, c;

		do {
			System.out.print("Nhập a =  ");

			while (!ip.hasNextInt()) {
				ip.next();
			}

			a = ip.nextInt();
		} while (a < 0 || a > 20);

		do {
			System.out.print("Nhập b = ");

			while (!ip.hasNextInt()) {
				ip.next();
			}
			b = ip.nextInt();
		} while (b < 0 || b > 20);

		do {
			System.out.print("Nhập c = ");

			while (!ip.hasNextInt()) {
				ip.next();
			}
			c = ip.nextInt();
		} while (c < 0 || c > 20);

		int max = Math.max(c, (Math.max(a, b)));
		int min = Math.min(c, (Math.min(a, b)));

		System.out.println("Số lớn nhất là: " + max);
		System.out.println("Số nhỏ nhất là: " + min);

		ip.close();

	}

}
