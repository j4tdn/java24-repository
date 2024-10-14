package utils;

import java.util.Scanner;

public class IoUtils {
	
	private static Scanner ip = new Scanner(System.in);
	
	public static int inputNumber(int minValue, int maxValue, int maxWrongTimes, String statement) {
		String text = "";
		int wrongTimes = 0;
		while (true) {
			System.out.print(statement + ": ");
			text = ip.nextLine();
			if (isNumber(text, minValue, maxValue)) {
				break;
			}

			wrongTimes++;
			System.out.println("Không hợp lệ, sai lần " + wrongTimes + "\n");

			if (wrongTimes == maxWrongTimes) {
				System.out.println("Sai quá " + maxWrongTimes + " lần(thoát chương trình)");
				System.exit(0);
			}
		}
		
		return Integer.parseInt(text);
	}
	
	public static int inputNumber(int minValue, int maxWrongTimes, String statement) {
		String text = "";
		int wrongTimes = 0;
		while (true) {
			System.out.print(statement + ": ");
			text = ip.nextLine();
			if (isNumber(text, minValue)) {
				break;
			}

			wrongTimes++;
			System.out.println("Không hợp lệ, sai lần " + wrongTimes + "\n");

			if (wrongTimes == maxWrongTimes) {
				System.out.println("Sai quá " + maxWrongTimes + " lần(thoát chương trình)");
				System.exit(0);
			}
		}
		
		return Integer.parseInt(text);
	}
	
	private static boolean isNumber(String text, int minValue, int maxValue) {
		if (isNumber(text)) {
			int number = Integer.parseInt(text);
			return number > minValue && number < maxValue;
		}
		return false;
	}
	
	private static boolean isNumber(String text, int minValue) {
		return isNumber(text) && Integer.parseInt(text) > minValue;
	}

	private static boolean isNumber(String text) {
		if (text == null || text.isEmpty()) {
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