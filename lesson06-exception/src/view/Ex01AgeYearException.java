package view;

import java.time.LocalDate;
import java.time.Year;
import java.util.Scanner;

public class Ex01AgeYearException {

	public static void main(String[] args) {

		// Bài toán 1:
		// Nhập vào năm sinh, in ra số tuổi của người dùng

		Scanner ip = new Scanner(System.in);

		System.out.print("Nhập năm sinh: ");
		
		// Dòng dưới bị exception
		int yob = Integer.parseInt(ip.nextLine());

		ip.close();

		int curentYear = Year.now().getValue();

		int age = curentYear - yob + 1;

		System.out.println("Số tuổi: " + age);
		ip.close();

	}

}
