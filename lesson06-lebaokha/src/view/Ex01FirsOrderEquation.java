package view;

import java.util.Scanner;

public class Ex01FirsOrderEquation {

	public static void main(String[] args) {
		System.out.println(">>> Phương trình bậc nhất >>>");

		Scanner ip = new Scanner(System.in);

		float a = 0;
		float b = 0;

		do {
			try {
				System.out.print("Nhập giá trị a = ");
				a = Float.parseFloat(ip.nextLine());
				System.out.print("Nhập giá trị b = ");
				b = Float.parseFloat(ip.nextLine());
				
				div(a, b);
				break;
			} catch (NumberFormatException nfe) {
				System.out.print("Giá trị chưa hợp lệ, nhập lại: \n");
			} catch (ArithmeticException ae) {
				System.out.print("Không chia được cho 0, nhập lại: \n");
			}

		} while (true);

		System.out.println("Nghiệm của phương trình là " + div(a, b));

		ip.close();
	}

	private static float div(float a, float b) {
		if (a == 0) {
			throw new ArithmeticException("Vui lòng nhập số khác 0");

		}

		return -b / a;
	}
}
