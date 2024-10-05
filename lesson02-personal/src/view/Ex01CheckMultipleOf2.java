package view;

import java.util.Scanner;

public class Ex01CheckMultipleOf2 {

	/*
	 * Viết chương trình(hàm) kiểm tra số nguyên N có phải là bội của 2 hay không
	 * Yêu cầu: N là số nguyên dương được nhập từ bàn phím, bắt buộc nhập lại nếu N
	 * không hợp lệ (tối đa 5 lần)
	 */

	public static void main(String[] args) {

		Scanner ip = new Scanner(System.in);
		String text = "";
		int wrongtimes = 0;

		while (true) {
			System.out.println("Nhập vào số nguyên dương N");
			text = ip.nextLine();
			if (isNumber(text)) {
				break;
			}
			wrongtimes++;
			System.out.println("Không hợp lệ, sai lần thứ " + wrongtimes);
			
			if(wrongtimes == 5) {
				System.out.println("Sai quá 5 lần, thoát chương trình");
				System.exit(0);
			}
		}
		
		int n = Integer.parseInt(text);
		if( n % 2 == 0 ) {
			System.out.println(text + " là bội của 2 ");
		} else {
			System.out.println(text + " không phải là bội của 2 ");
		}
		ip.close();
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
