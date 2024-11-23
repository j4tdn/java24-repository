package view;

import java.time.Year;
import java.util.Scanner;

public class Ex03TryCatch {
	
	/*Exception in thread "main" java.lang.NumberFormatException: For input string: "aaa"
	at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
	at java.base/java.lang.Integer.parseInt(Integer.java:588)
	at java.base/java.lang.Integer.parseInt(Integer.java:685)
	at view.Ex01AgeYearException.main(Ex01AgeYearException.java:15)
	*/
	
	/* 
	 Cách 2: Sử dụng try/catch để bắt lỗi
	 + Với đoạn code bị exception
	 + Khi không xử lý lỗi --> gặp dòng lỗi --> dừng chương trình
	 + Xử lí lỗi với try/catch
	 	. Đặt đoạn code có khả năng bị exception vào trong khối tru
	 	. Đặt đoạn code xử lí trong khối catch
	 	. Lưu ý: 
	  
	 */
	
	public static void main(String[] args) {
		// Nhap nam sinh in ra so tuoi cua nguoi dung
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nhap nam sinh: ");
		
		int yob = 0;
		
		do {
			try {
				yob = Integer.parseInt(sc.nextLine());
				break;
			}catch(NumberFormatException nfe) {
				System.out.println("Nam sinh khong hop le vui long nhap lai");
			}
		} while(true);
		
		int currentYear = Year.now().getValue();
		
		int age = currentYear - yob + 1;
		
		System.out.println("--> Số tuổi = " + age);
		
		sc.close();
	}
}
