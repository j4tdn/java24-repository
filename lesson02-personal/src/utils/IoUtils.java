package utils;

import java.util.Scanner;

public class IoUtils {

	public static Scanner ip = new Scanner(System.in);

	public static int inputNumber(int minvalue, int maxWrongTimes, String statement) {
		String text = "";
		int wrongTimes = 0;
		while (true) {
			System.out.println(statement);
			text = ip.nextLine();
			if (isNumber(text, minvalue)) {
				break;
			}

			wrongTimes++;
			System.out.println("Không hợp lệ lần thứ " + wrongTimes);

			if (wrongTimes == maxWrongTimes) {
				System.out.println("Không hợp lệ quá " + maxWrongTimes + " lần. Kết thúc chương trình");
				System.exit(0);
			}

		}
		return Integer.parseInt(text);

	}

	public static int inputNumber(int minvalue, int maxValue, int maxWrongTimes, String statement) {
		String text = "";
		int wrongTimes = 0;
		while (true) {
			System.out.println(statement);
			text = ip.nextLine();
			if (isNumber(text, minvalue, maxValue)) {
				break;
			}

			wrongTimes++;
			System.out.println("Không hợp lệ lần thứ " + wrongTimes);

			if (wrongTimes == maxWrongTimes) {
				System.out.println("Không hợp lệ quá " + maxWrongTimes + " lần. Kết thúc chương trình");
				System.exit(0);
			}

		}
		return Integer.parseInt(text);

	}

	public static boolean isNumber(String text, int minValue, int maxValue) {
		if (isNumber(text)) {
			int number = Integer.parseInt(text);
			return number >= minValue && number < maxValue;
		}
		return false;

	}

	public static boolean isNumber(String text, int minValue) {
		return isNumber(text) && Integer.parseInt(text) >= minValue;
	}

	public static boolean isNumber(String text) {
		if (text == null | text.isEmpty()) {
			return false;
		}

		for (int i = 0; i < text.length(); i++) {
			char letter = text.charAt(i);
			if (letter < '0' || letter > '9') {
				return false;
			}
		}
		return true;
	}

}
