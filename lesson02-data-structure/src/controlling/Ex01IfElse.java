package controlling;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.Year;
import java.util.Random;
import java.util.Scanner;

import utils.RandomUtils;

public class Ex01IfElse {
	
	public static void main(String[] args) {
		/*
		 Câu 1: Random 1 số nguyên ngẫu nhiên [5;20)
		 Ktra số đó có phải là số chẵn hay ko
		 + Nếu chẵn --> in ra năm hiện tại + số đó
		 + Ngược lại --> ko làm gì cả	 
		 */
		
		Random rd = new Random();
		int number = rd.nextInt(5, 20);
		System.out.println("Giá trị ngẫu nhiên " + number);
		
		// Lấy năm hiện tại
		int currentYear = Year.now().getValue();
		
		if (number % 2 == 0) {
			System.out.println("Thông tin --> " + (currentYear+number));
		}
		
		/*
		 Câu 2: Nhập vào mật khẩu
		 Ktra độ dài có hợp lệ
		 + Nếu độ dài >= 8 --> in ra mk hợp lệ
		 + Ngược lại --> in ra mk ko hợp lệ vui lòng nhập lại
		 
		 */
		Scanner ip = new Scanner(System.in);
		System.out.print("Nhập mật khẩu: ");
		String  password = ip.nextLine();
		if (password.length() > 8) {
			System.out.println("Mật khẩu hợp lệ");
		}
		else {
			System.out.println("Mật khẩu không hợp lệ, vui lòng nhập lại");
		}
		
		
		
		/*
		 Câu 3: Random điểm của 1 hs [0.0, 10.0]
		 Được kqua, làm tròn 1 chữ số (up, down, commercial)
		 + [0, 5): Yếu
		 + [5, 6.5): TB
		 + [6.5, 8): Khá
		 + [8, 10): Giỏi
		 */
		
		// Lấy phần nguyên: Math.floor, Math.ceil, Math.round
		// Làm tròn lấy phần nguyên + thập phân ( số chữ số)
		// --> BigDecimal 8 16 32 bytes, hỗ trợ các hàm xử lý
		
		double point = rd.nextDouble(0, 11);
		if (point > 10) {
			point = 10;
		}
		
		System.out.println("\nĐiểm = " + point);
		
		double rounded = RandomUtils.generatePoint();
		// 6.5 ?= 6.5
		// --> floating point
		// 0/0 --> exception
		// a/0.0 --> unlimit
		
		if (rounded < 5) {
			System.out.println("Yếu");
		}
		else if (rounded < 6.5) {
			System.out.println("TB");
		}
		else if (rounded < 8) {
			System.out.println("Khá");
		}
		else {
			System.out.println("Giỏi");
		}
		
		// đóng kết nối của ip
		ip.close();
	}
	
}
