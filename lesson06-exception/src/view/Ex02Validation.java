package view;

import java.time.Year;
import java.util.Scanner;

public class Ex02Validation {

	public static void main(String[] args) {

		// Nhập vào năm sinh
		Scanner ip = new Scanner(System.in);

		System.out.print("Nhập năm sinh: ");

		String text = "";
		do {
			text = ip.nextLine();

			if (text.matches("\\d+")) {
				break;
			}
			System.out.print("Năm sinh chưa hợp lệ, nhập lại: ");
		} while (true);
		// Bị exception
		int yob = Integer.parseInt(text);

		int currentyear = Year.now().getValue();

		int age = currentyear - yob + 1;

		System.out.println(">> Số tuổi là " + age);

		ip.close();

	}
}
