package exerciese;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int count = 0;

		for (int i = 1; i <= 1000; i++) {
			if (scanner.hasNextInt()) {
				int number = scanner.nextInt();
				if (number % 2 == 0) {
					System.out.println("Number " + number + " là bội của 2 ");
				} else {
					System.out.println("Number " + number + " không là bội của 2 ");
					
				}
			} else {
				System.out.println("Bạn đã nhập sai, vui lòng nhập số nguyên.");
				scanner.next();
				count++;
			}

			if (count == 5) {
				System.out.println("Bạn đã nhập sai quá 5 lần.");
				break;
			}
		}

		scanner.close();
	}
}
