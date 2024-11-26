package view;

import java.time.Year;
import java.util.Scanner;

public class Ex03TryCatch {

	/*
	 * Exception in thread "main" java.lang.NumberFormatException: For input string:
	 * "aaa" at java.base/java.lang.NumberFormatException.forInputString(
	 * NumberFormatException.java:67) at
	 * java.base/java.lang.Integer.parseInt(Integer.java:668) at
	 * java.base/java.lang.Integer.parseInt(Integer.java:786) at
	 * view.Ex01AgeYearException.main(Ex01AgeYearException.java:18)
	 */

	/*
	 * 
	 * Cách 2: Sử dụng try/catch để bắt lỗi + Với đoạn code bị exception
	 * 
	 * + Khi không xử lý lỗi --> gặp dòng lỗi --> dừng chương trình
	 * 
	 * + Xử lý lỗi với try/catch . Đặt đoạn code có khả năng bị exception trong khối
	 * try . Đặt đoạn code xử lý trong khối catch . Lưu ý: Xử lý được khi bắt đúng
	 * exception Exception cha có thể bắt cho exception con
	 * 
	 */

	public static void main(String[] args) {

		// Bài toán 1:
		// Nhập vào năm sinh, in ra số tuổi của người dùng

		Scanner ip = new Scanner(System.in);

		System.out.print("Nhập năm sinh: ");

		int yob = 0;

		do {
			try {
				yob = Integer.parseInt(ip.nextLine());
				break;
			} catch (NumberFormatException nfe) {
				System.out.print("Năm sinh chưa hợp lệ, nhập lại: ");
			}
		} while (true);

		int currentYear = Year.now().getValue();

		int age = currentYear - yob + 1;

		System.out.println("==> Số tuổi = " + age);

		ip.close();
	}

}