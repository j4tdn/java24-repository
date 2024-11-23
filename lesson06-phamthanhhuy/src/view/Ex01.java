package view;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {

		Scanner ip = new Scanner(System.in);

		System.out.println("Giải ax + b = 0");

		System.out.print("Nhập a: ");
		int a = 0;

		do {
			try {
				a = Integer.parseInt(ip.nextLine());
				if (a == 0) {
					throw new ArithmeticException("Nhập a khác 0");
				}
				break;
			} catch (NumberFormatException | ArithmeticException e) {
				e.printStackTrace();
				System.out.print("Không hợp lệ. Nhập lại a: ");
			}

		} while (true);

		System.out.print("Nhập b: ");
		int b = 0;
		do {
			try {
				b = Integer.parseInt(ip.nextLine());
				break;
			} catch (NumberFormatException e) {
				e.printStackTrace();
				System.out.print("Không hợp lệ. Nhập lại b: ");
			}
		} while (true);

		System.out.println("Kết quả của x: " + -b / (double) a);

	}
}
