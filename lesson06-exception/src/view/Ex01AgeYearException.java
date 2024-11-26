package view;

import java.time.Year;
import java.util.Scanner;

public class Ex01AgeYearException {

	public static void main(String[] args) {

		// Nhập vào năm sinh
		Scanner ip = new Scanner(System.in);

		System.out.printf("Nhập năm sinh: ");

		int yob = Integer.parseInt(ip.nextLine());

		int currentyear = Year.now().getValue();

		int age = currentyear - yob + 1;

		System.out.println(">> Số tuổi là " + age);

		ip.close();

	}
}
