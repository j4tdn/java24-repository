package view;

import java.time.Year;
import java.util.Scanner;

public class Ex03TryCatch {
	
	
	/*
	  Cách 2 : Sử dụng try catch để bắt lỗi
	  + Với đoạn code bị exception 
	  
	  + Khi không xử lý lỗi --> gặp dòng lỗi --> dừng chương trình 
	  
	  + Xử lý lỗi với try catch 
	  	.Đặt đoạn code có khả năng bị exception trong khối try
	  	.Đặt đoạn code xử lý trong khối catch
	  	.Lưu ý : Chỉ xử lý được khi bắt đúng exception 
	  		Exception cha có thể bắt được exception con 
	 */
	public static void main(String[] args) {
		//Bài 1 : Nhập vào năm sinh 
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập năm sinh : ");
		
		int yob = 0;
		do {
			try {
				yob = Integer.parseInt(sc.nextLine());
				break;
			} catch (NumberFormatException nfe) {
				//In lỗi chi tiết -->  nfe.printStackTrace();
				//System.out.println("exception --> "+nfe.getMessage());
				System.out.println("Nhập lại: ");
			}
		}while(true);
		
		int currentYear = Year.now().getValue();
		
		int age = currentYear - yob + 1;
		
		System.out.println("Số tuổi : "+age);
		
		sc.close();
		
	}
}
