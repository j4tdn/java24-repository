package view;

import java.time.Year;
import java.util.Scanner;

public class Ex03TryCatch {

	public static void main(String[] args) {

		// B1: Nhập vào năm sinh, in ra số tuổi người dùng

		// Cách 2: Sử dụng Try - catch

		// + Với đoạn code bị exception

		// + Khi k xử lí lỗi --> gặp dòng lỗi --> dừng ctrinh

		// + Xử lý lỗi với Try - Catch
		// . Đặt đoạn code có khả năng bị exception trong try
		// . Đặt đoạn code xử lí vào trong catch
		// Lưu ý: Xử lý được khi bắt đúng lỗi
		Scanner ip = new Scanner(System.in);
		int yob = 0;
		System.out.print("Nhap nam sinh: ");
		do {
			try {
				yob = Integer.parseInt(ip.nextLine());
				break;

			} catch (NumberFormatException nfe) {
				System.out.println("Nhập lại");
			}
		} while (true);
		// String text = "";
		// do {
		// text = ip.nextLine();

		// if (text.matches("\\d+")) {
		// matches("\\d+") là hàm boolean kiểm tra chuỗi này có 1 hay nhiều số
		// trong đó \d muốn được hiểu thì phải có thêm dấu '\'
		// break;
		// }
		// System.out.println("Năm sinh ko hợp lệ, Nhập lại");
		// } while (true);
		// int yob = Integer.parseInt(text);

		int currentYear = Year.now().getValue();

		int age = currentYear - yob + 1;

		System.out.println("So tuoi la: " + age);
		ip.close();
	}
}
