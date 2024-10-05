package utils;

import java.util.Scanner;

public class Ex01Utils {
	
	public static int testInput(int maxWrongTimes, int minValue, String statement) {
		Scanner ip = new Scanner(System.in);
		String text = "";
		int wrongTimes = 0;
		while(true) {
			System.out.print(statement + " : ");
			text = ip.nextLine();
			if(isNumber(text, minValue)) {
				break;
			}
			
			wrongTimes++;
			if(wrongTimes < maxWrongTimes) {
				System.out.println("Không hợp lệ, sai lần thứ " + wrongTimes);
			}	
			
			if(wrongTimes == maxWrongTimes) {
				System.out.println("Bạn đã nhập sai quá " + maxWrongTimes + " lần. Kết thúc chương trình");
				System.exit(0);
			}
		}
		return Integer.parseInt(text);
	}
	
	private static boolean isNumber(String text, int minValue) {
		if(text == null || text.isEmpty()) {
			return false;
		}
		
		for(int i = 0; i < text.length(); i++) {
			char letter = text.charAt(i);
			if(letter < '0' || letter > '9') {
				return false;
			}
		}
		return Integer.parseInt(text) > minValue;
	}
}
