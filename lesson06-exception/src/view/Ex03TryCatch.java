package view;

import java.time.Year;
import java.util.Scanner;

public class Ex03TryCatch {
	

	/*
	 Exception in thread "main" java.lang.NumberFormatException: For input string: "dsa"
	at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
	at java.base/java.lang.Integer.parseInt(Integer.java:662)
	at java.base/java.lang.Integer.parseInt(Integer.java:778)
	at view.Ex01AgeYearException.main(Ex01AgeYearException.java:16)
	
	Cách 2: Sử dụng try/catch để bắt lỗi
	+ Với đoạn code bị exception
	
	+ Khi không xử lí lỗi --> gặp dòng lỗi --> dừng chương trình
	
	+ Xử lí lỗi với try/catch
		- Đặt đoạn code có khả năng bị exception trong khối try
		- Đặt đoạn code xử lí trong khối catch
		- Lưu ý: Xử lí được khi bắt đúng exception
				 Exception cha có thể bắt cho exception con
	
	 */
	
	

	public static void main(String[] args) {

		// Bài toán 1:
		// Nhập vào năm sinh, in ra số tuổi của người dùng

		Scanner ip = new Scanner(System.in);

		System.out.print("Nhập năm sinh");
		
		int yob = 0;
		//Bắt lỗi dòng bị exception
		
		do {
			try {
				yob = Integer.parseInt(ip.nextLine());
				break;
			} catch(NumberFormatException nfe) {

				System.out.println("Năm sinh chưa hợp lệ, nhập lại");
			}			
		} while(true);

		int currentYear = Year.now().getValue();

		int age = currentYear - yob + 1;

		System.out.println("==> Số tuổi = " + age);

		ip.close();
	}

}
