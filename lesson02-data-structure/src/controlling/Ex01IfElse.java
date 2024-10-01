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
		  Câu 1: Random 1 số nguyên ngẫu nhiên [5, 20)
		  Kiểm tra số đó có phải là số chẵn hay không
		  + Nếu là chẵn --> in ra năm hiện tại + số đó 
		  + Ngược lại --> không làm gì cả		 
		 */
		
		Random rd = new Random();
		
		int number = rd.nextInt(5, 20); // nextInt(a,b) --> [a,b)
		System.out.println("Giá trị ngẫu nhiên --> " + number);
		
		//
		int currentYear = Year.now().getValue();
		
		if (number % 2 == 0) {
			System.out.println("Thông tin --> " + currentYear+number );
		}
		
		/*
		  Câu 2: Nhập vào mật khẩu
		  Kiểm tra độ dài của mật khẩu đó 
		  + Nếu độ dài >= 8 --> in ra mật khẩu hợp lệ
		  + Ngược lại       --> in ra mật khẩu không hợp lệ, vui lòng nhập lại
		 */
		
		Scanner ip = new Scanner(System.in);
		System.out.println("\nNhập mật khẩu");
		String password = ip.nextLine();
		if(password.length() >= 8) {
			System.out.println("Mật khẩu hợp lệ");
		}
		else {
			System.out.println("Mật khẩu không hợp lệ, vui lòng nhập lại");
		}
		
		/*
		 Câu 3: Random điểm của 1 học sinh [0.0, 10.0]
		 Được kết quả, làm tròn 1 chữ số(up, down, [comercial])
		 Nếu điểm 
		 + [0, 5): Yếu
		 + [5, 6.5): Trung bình
		 + [6.5, 8): Khá
		 + [8, 10]: Giỏi
		 */
		
		// Lấy phần nguyên: Math.floor, Math.ceil, Math.round
		// Làm tròn lấy cả phần nguyên + thập phân(số chữ số)
		// --> BigDecimal 8 16 32 bytes, hỗ trợ các hàm xử lí 
		
		// Tìm hiểu thêm KDL BigDecimal ???
		
		double rounded = RandomUtils.generatePoint();
		
		// 6.5 ?= 6.5
		// --> floating point
		// 0/0 --> exception
		// 0.0 / 0.0 -- > unlimit
		
		String rank = "";
		if(rounded <5) {
			rank = "Yếu";
		} else if (rounded < 6.5) {
			rank = "Trung bình";
		} else if (rounded < 8) {
			rank = "Khá";
		} else {
			rank = "Giỏi";
		}
		
		System.out.println("Xếp loại -->" + rank);
		
		
				
		// đóng kết nối của ip
		ip.close();
			
	}
	
	// Chuyển đổi value từ KDL sang BigDecimal
	
	private static BigDecimal bd(double value) {
		return new BigDecimal(String.valueOf(value));
	}
	

}
