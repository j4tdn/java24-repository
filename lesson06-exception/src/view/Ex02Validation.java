package view;

import java.time.Year;
import java.util.Scanner;

public class Ex02Validation {
	
	/*
	 cach 1: su dung validation
	 --> dam bao doan code bi exception se khong bao gio xay ra
	 */
	public static void main(String[] args) {

		Scanner ip = new Scanner(System.in);

		System.out.print("nhap nam sinh: ");

		String text = "";
		do {
			text = ip.nextLine();
			if (text.matches("\\d+")) {
				break;
			} else {
				System.out.print("Nam sinhc hua hop le, nhap lai: ");
			}
		} while (true);

		int yob = Integer.parseInt(text);

		int currentYear = Year.now().getValue();

		int age = currentYear - yob + 1;

		System.out.println("So tuoi = " + age);

		ip.close();
	}

}
