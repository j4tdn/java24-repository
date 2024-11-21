package view;

import java.time.Year;
import java.util.Scanner;

public class Ex01AgeYearException {

	public static void main(String[] args) {

		// B1: Nhập vào năm sinh, in ra số tuổi người dùng
		Scanner ip = new Scanner(System.in);

		System.out.print("Nhap nam sinh: ");
		int yob = Integer.parseInt(ip.nextLine());

		int currentYear = Year.now().getValue();

		int age = currentYear - yob + 1;

		System.out.println("So tuoi la: " + age);
		ip.close();
	}
}
