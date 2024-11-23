package view;

import java.time.Year;
import java.util.Scanner;

public class Ex03TryCatch {
	
	public static void main(String[] args) {
		// bài 1 : nhập vào năm sinh, in ra số tuổi của người dùng
		
		/*
		 * sử dụng try/catch để bắt lỗi
		 * 
		 *+ với đoạn code bị exception
		 *+ khi không sử lý lỗi --> gặp dòng lỗi  --> dừng chương trình
		 *+ xử lý lỗi với try/catch
		 *  . đặt đoạn code có khả năng bị exception trong khối try
		 *  . đặt đoạn code xử lý trong khôi catch
		 *  . lưu ý: xử lý được khi bắt đúng exception
		 */
		Scanner ip = new Scanner(System.in);
		
		System.out.println("Nhập Năm Sinh : ");
		int yob=0;
		do {
			try {
				yob = Integer.parseInt(ip.nextLine());
				break;
			}catch(NumberFormatException nfe){
				System.out.println("năm sinh không hợp lệ, nhập lại");
				
			}
		}while(true);
		
		
		int currentYear = Year.now().getValue();
		
		int age = currentYear - yob + 1;
		
		System.out.println("==> Số Tuổi = "+ age);
		ip.close();
		
		
				
		
	}

}
