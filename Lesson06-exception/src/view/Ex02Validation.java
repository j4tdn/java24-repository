package view;

import java.time.Year;
import java.util.Scanner;

public class Ex02Validation {
	
	public static void main(String[] args) {
		// bài 1 : nhập vào năm sinh, in ra số tuổi của người dùng
		Scanner ip = new Scanner(System.in);
		
		System.out.println("Nhập Năm Sinh : ");
		
		// ràng buộc
		String text= "";
		do{
			text = ip.nextLine();
			
			if (text.matches("\\d+")) {
				break;
			}
			System.out.println("năm sinh chưa hợp lệ, nhập lại");
			
		}while(true);
		
		int yob = Integer.parseInt(ip.nextLine());
		
		int currentYear = Year.now().getValue();
		
		int age = currentYear - yob + 1;
		
		System.out.println("==> Số Tuổi = "+ age);
		ip.close();
	}

}
