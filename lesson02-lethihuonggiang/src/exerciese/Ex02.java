package exerciese;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int count = 0;
		int check = 2;

		for (int i = 1; i <= 1000; i++) {
			if (scanner.hasNextInt()) {
				int number = scanner.nextInt();

				if (number >= 0) {
					if (isPowerOfTwo(number)) {
						System.out.println("Number " + number + " là lũy thừa của 2 ");
					} else {
						System.out.println("Number " + number + " không là lũy thừa của 2 ");
						count++;
					}
				} else {
					System.out.println("Bạn đã nhập sai, vui lòng nhập số nguyên không âm.");
					scanner.next();
					count++;
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

	private static boolean isPowerOfTwo(int number) {
		return (number > 0) && ((number & (number - 1)) == 0);
	}

}
