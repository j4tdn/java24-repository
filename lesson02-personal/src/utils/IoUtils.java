package utils;

import java.util.Scanner;

public class IoUtils {

	public static int inputNumber(int minValue, int maxWrongTimes, String statement) {
		Scanner ip = new Scanner(System.in);
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
		
		ip.close();
		
		return Integer.parseInt(text);
	}

	private static boolean isNumber(String text, int minValue) {
		if (text == null || text.isEmpty()) {
			return false;
		}

		for (int i = 0; i < text.length(); i++) {
			char letter = text.charAt(i);
			if (letter < '0' || letter > '9') {
				return false;
			}
		}

		return Integer.parseInt(text) > minValue;
	}

}
