package view;

import java.time.Year;
import java.util.Scanner;

public class Ex02Validation {

	public static void main(String[] args) {

		// B1: Nhập vào năm sinh, in ra số tuổi người dùng
		/*
		 * Sử dụng valadation --> đảm bảo đoạn code bị exception sẽ kbh xảy ra nữa
		 */
		Scanner ip = new Scanner(System.in);

		System.out.print("Nhap nam sinh: ");
		String text = "";
		do {
			text = ip.nextLine();

			if (text.matches("\\d+")) {
				// matches("\\d+") là hàm boolean kiểm tra chuỗi này có 1 hay nhiều số
				// trong đó \d muốn được hiểu thì phải có thêm dấu '\'
				break;
			}
			System.out.println("Năm sinh ko hợp lệ, Nhập lại");
		} while (true);
		int yob = Integer.parseInt(text);

		int currentYear = Year.now().getValue();

		int age = currentYear - yob + 1;

		System.out.println("So tuoi la: " + age);
		ip.close();
	}
}
