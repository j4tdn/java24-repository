package view;

import java.time.Year;
import java.util.Scanner;

public class Ex03TryCatch {

	// ctrl shift O import thư viện và xoá cái dư thừa

	/*
	 * c2: use try/catch to cat exception + Với đoạn code vị exception
	 * 
	 * + Khi ko xử lý lỗi -> gặp dòng lỗi -> terminal program
	 * 
	 * + Xử lý lỗi với try/catch . Đặt đoạn code có khả năng bị exception trong khối
	 * try . Đặt đoạn code xử lý trong khối catch . Lưu ý: Xử lý được khi bắt đúng
	 * exception Exception cha có thể bắt cho exception con
	 * 
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter year of birth: ");
		int yob = 0;
		do {
			try {
				yob = Integer.parseInt(sc.nextLine());
				break;
			} catch (NumberFormatException nfe) {
				// System.out.println("Exception --> " + nfe.getMessage());

				// cho biết cụ thể lỗi ..
				//nfe.printStackTrace();
				
				System.out.print("Invalid year of birth, enter again: ");
			}
		} while (true);

		int currentYear = Year.now().getValue();

		int age = currentYear - yob + 1;

		System.out.println("==> Age = " + age);

		sc.close();
	}

}
