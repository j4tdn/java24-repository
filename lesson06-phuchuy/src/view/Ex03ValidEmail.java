package view;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import exception.InvalidEmail;

public class Ex03ValidEmail {
	static Scanner ip = new Scanner(System.in);

	public static void main(String[] args) {
		createEmail();
	}

	private static void createEmail() {
		while (true) {
			try {
				System.out.print("Tạo email (@mail.com): ");
				String prefix = ip.nextLine();
				validEmail(prefix);
				System.out.printf("Email của bạn là: %s@mail.com", prefix);
				break;
			} catch (InvalidEmail e) {
				System.out.println(e.getMessage());
			}
		}
	}

	private static void validEmail(String email) {

		String prefixRegex = "^[^A-Za-z0-9]+";
		String prefixRegex1 = "[^A-Za-z0-9]+$";
		String prefixRegex2 = "[^A-Za-z0-9]{2,}";
		String prefixRegex3 = "[^A-Za-z0-9-._]+";

		Pattern pattern = Pattern.compile(prefixRegex);
		Pattern pattern1 = Pattern.compile(prefixRegex1);
		Pattern pattern2 = Pattern.compile(prefixRegex2);
		Pattern pattern3 = Pattern.compile(prefixRegex3);

		Matcher m = pattern.matcher(email);
		Matcher m1 = pattern1.matcher(email);
		Matcher m2 = pattern2.matcher(email);
		Matcher m3 = pattern3.matcher(email);
		
		if (m.find()) {
			throw new InvalidEmail("Không thể bắt đầu là kí tự đặc biệt ");
		}
		if (m1.find()) {
			throw new InvalidEmail("Không thể kết thúc với kí tự đặc biệt ");
		}
		if (m2.find()) {
			throw new InvalidEmail("Các kí tự đặc biệt không được lặp lại ");
		}
		if (m3.find()) {
			throw new InvalidEmail("Chỉ cho phép các kí tự ._- ");
		}

	}

}
