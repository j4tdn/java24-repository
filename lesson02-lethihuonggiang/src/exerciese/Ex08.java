package exerciese;

import java.util.Scanner;

public class Ex08 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number;

		while (true) {

			if (scanner.hasNextInt()) {
				number = scanner.nextInt();

				if (number > 0) {
					break;
				} else {
					System.out.println("Số không nằm trong khoảng cho phép, vui lòng nhập lại.");
				}
			} else {
				System.out.println("Vui lòng nhập lại số nguyên.");
				scanner.next();
			}
		}
		checksonguyento(number);
	}

	public static int checksonguyento(int number) {
		int count = 0;
		if (number % 1 == 0 && number % number == 0) {
			for (int i = 2; i < number; i++) {
				if (number % i == 0) {
					System.out.println("number ko phải là số nguyên tố");
					break;

				} else {
					count++;
					if (count == number - 2) {
						System.out.println("number là số nguyên tố");
					}
				}
			}
		}
		return number;
	}

}
