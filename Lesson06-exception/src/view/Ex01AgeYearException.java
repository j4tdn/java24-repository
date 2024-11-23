package view;

import java.time.Year;
import java.util.Scanner;

public class Ex01AgeYearException {
	
	public static void main(String[] args) {
		// bài 1 : nhập vào năm sinh, in ra số tuổi của người dùng
		Scanner ip = new Scanner(System.in);
		
		System.out.println("Nhập Năm Sinh : ");
		// dòng 14 bị lỗi exception
		int yob = Integer.parseInt(ip.nextLine());
		
		int currentYear = Year.now().getValue();
		
		int age = currentYear - yob + 1;
		
		System.out.println("==> Số Tuổi = "+ age);
		ip.close();
		
		
				
		
	}

}
