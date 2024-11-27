package view;

import java.util.Scanner;

public class Ex01LinearEquation {

	public static void main(String[] args) {

		Scanner ip = new Scanner(System.in);

		System.out.println("Phương trình bậc nhất ax + b = 0");
		int a, b;
		float x;

		do {
			try {
				System.out.println("Nhập hệ số a");
				a = Integer.parseInt(ip.nextLine());

				System.out.println("Nhập hệ số b");
				b = Integer.parseInt(ip.nextLine());

				x = findX(a, b);
				break;

			} catch (ArithmeticException | NumberFormatException e) {
				System.out.println(e.getMessage());
				System.out.println("Nhập lại số hợp lệ");
				
			}

		} while (true);
		
		System.out.println("Nghiệm của hệ phương trình x = " +  x);

		ip.close();
	}

	private static float findX(int a, int b) {
		if (a == 0) {
			throw new ArithmeticException("Nhập a khác 0");
		}
		return (float) -b / a;
	}

}
