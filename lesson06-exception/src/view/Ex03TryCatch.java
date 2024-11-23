package view;

import java.time.Year;
import java.util.Scanner;

public class Ex03TryCatch {
	
/*
 
 Cách 1: Sử dụng validation
 ---> dảm bảo đoạn code bị exception sẽ không bao giờ xảy ra
 
 Cách 2: Sử dụng try/catch để bắt lỗi
 + Với đoạn code bị exception
 
 + Khi không xử lý lỗi --> gặp dòng lỗi --> dừng chương trình

 + Xử lý với try/catch
 	. Đặt đoạn code có khả năng bị exception trong khối try
 	. Đặt đoạn code xử lý trong khối catch
 	. Lưu ý: Xử lý khi bắt đúng exception
 */
	
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		
		System.out.println("Nhap nam sinh: ");
		
//		String text = "";
//		do {
//			text = ip.nextLine();
//			if(text.matches("\\d+")) {
//				break;
//			}
//			
//			System.out.println("Nam sinh chua hop le !!!, nhap lai:");
//		}while(true);
//		int yob = Integer.parseInt(text);
		int yob;
		
		do {
			try {
				yob = Integer.parseInt(ip.nextLine());
				break;
			}catch (NumberFormatException nfe) {
//				System.out.println("exception --> " + nfe.getMessage());
//				nfe.printStackTrace();
				System.out.println("moi nhap lai!");
			}
		} while (true);
		
		int currentYear = Year.now().getValue();
		
		int age = currentYear - yob + 1;
		
		System.out.println("--> So tuoi: " + age);
		ip.close();
	}
	
}
