package exercises;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int attempts = 0;
		int maxAttempts = 5;
		int number = 0;
		boolean isValid = false;

		while (attempts < maxAttempts) {
			System.out.print("Nhập số nguyên dương N: ");
			String input = scanner.nextLine();

			try {
				number = Integer.parseInt(input); // Kiểm tra nếu input là số nguyên
				if (number > 0) { // Kiểm tra N có phải là số nguyên dương
					isValid = true;
					break; // Thoát vòng lặp nếu N hợp lệ
				} else {
					System.out.println("N phải là số nguyên dương. Hãy thử lại.");
				}
			} catch (NumberFormatException e) {
				System.out.println("Đầu vào không hợp lệ. Hãy nhập một số nguyên dương.");
			}

			attempts++;
		}

		if (isValid) {
			if (isPowerOfTwo(number)) {
				System.out.println(number + "  --> true");
			} else {
				System.out.println(number  + " --> false");
			}
		} else {
			System.out.println("Đã nhập sai quá 5 lần. Kết thúc chương trình.");
		}
	}
	private static boolean isPowerOfTwo(int number) {
		 return (number > 0) && ((number & (number - 1)) == 0);
	}
}
