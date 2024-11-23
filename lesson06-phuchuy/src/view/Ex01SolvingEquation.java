package view;

import java.util.Scanner;

public class Ex01SolvingEquation {
	static Scanner ip = new Scanner(System.in);

	public static void main(String[] args) {
		solvingEquation();
	}

	private static void solvingEquation() {
		int a;
		int b;
		while (true) {
			try {
				System.out.println("Nhập vào 2 số a và b ");
				System.out.print("a: ");
				a = Integer.parseInt(ip.nextLine());

				System.out.print("b: ");
				b = Integer.parseInt(ip.nextLine());

				try {
					float x = -b / a;
					break;
				} catch (ArithmeticException e) {
					System.out.println("A không thể là 0 --> " + e.getMessage());
				}

			} catch (NumberFormatException e) {
				System.out.println("Không hợp lệ, vui lòng nhập lại !");
			} finally {
				ip.close();
			}

		}
		float x = (float) -b / a;
		System.out.printf("Phương trình có dạng: %dx + %d = 0", a, b);
		System.out.print("\nNghiệm của phương trình là: " + x);
	}

}
