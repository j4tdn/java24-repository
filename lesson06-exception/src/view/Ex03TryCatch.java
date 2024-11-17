package view;

import java.time.Year;
import java.util.Scanner;

	/*
	 * Nhập năm sinh: fdsdfs
Exception in thread "main" java.lang.NumberFormatException: For input string: "fdsdfs"
	at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
	at java.base/java.lang.Integer.parseInt(Integer.java:662)
	at java.base/java.lang.Integer.parseInt(Integer.java:778)
	at view.Ex01AgeYearException.main(Ex01AgeYearException.java:17)
	 */

/*
  Cách 2: Sử dụng try/catch để bắt lỗi
  + Với đoạn code bị exccption
  
  + Khi không xử lý lỗi --> gặp dòng lỗi --> dừng chương trình
  
  + Xử lý lỗi với try/catch
  	. Đặt đoạn code có khả năng bị exception trong khối try
  	. Đặt đoạn code xử lý trong khối catch
  	. Lưu ý: chỉ xử lý được khi bắt đúng exception
  			Exception cah có thể bắt cho exception con
 */

public class Ex03TryCatch {

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
				nfe.printStackTrace();
				System.out.print("Năm sinh ko hợp lệ, nhập lại: ");
			}
		} while (true);
		

		ip.close();

		int curentYear = Year.now().getValue();

		int age = curentYear - yob + 1;

		System.out.println("Số tuổi: " + age);
		ip.close();

	}

}
