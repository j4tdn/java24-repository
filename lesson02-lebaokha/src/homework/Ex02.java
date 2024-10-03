package homework;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {

		Scanner ip = new Scanner(System.in);
		int temp = 0;
		int exponential = 0;

		for (int count = 0; count < 5; count++) {
			System.out.print("Nhập vào số N từ bàn phím: ");
			String number = ip.nextLine();

			try {
				exponential = Integer.parseInt(number);

				if (exponential > 0) {
					temp = 1;
					break;
				} else {
					System.out.println("Nhập lại, không hợp lệ!");
				}
			} catch (Exception e) {
				System.out.println("Nhập lại, không hợp lệ!");
			}

		}

		if (temp == 1) {
			while (exponential % 2 == 0) {
				exponential = exponential / 2;
			}
			if (exponential == 1) {
				System.out.println("true");
			} else {
				System.out.println("false");
			}
		}

		ip.close();

	}
}
