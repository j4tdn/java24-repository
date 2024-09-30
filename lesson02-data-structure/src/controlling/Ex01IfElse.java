package controlling;

import java.time.Year;
import java.util.Random;
import java.util.Scanner;

import util.RandomUtils;

public class Ex01IfElse {
	
	public static void main(String[] args) {
		
		/*
		 *  Câu 1
		 */
		
		Random rd = new Random();
		int number = rd.nextInt(5, 20);
		System.out.println("Giá trị ngẫu nhiên --> " + number);
		
		int currentYear = Year.now().getValue();
		
		if (number % 2 == 0) {
			System.out.println("Thông tin --> " + (currentYear+number));
		}
		
		/*
		 *  Câu 2:
		 */
		
		Scanner ip = new Scanner(System.in);
		System.out.println("\nNhập mật khẩu: ");
		String password = ip.nextLine();
		if (password.length() >= 8) {
			System.out.println("Mật khẩu hợp lệ");
		} else {
			System.out.println("Mật khẩu không hơp lệ, vui lòng nhập lại");
		}
		
		/*
		 * Câu 3: Random điểm của 1 học sinh [0.0, 10.0]
		 * Được kết quả, làm tròn 1 chữ số (up, down, [commercial])
		 * Nếu điểm
		 * + [0,5)   : Yếu
		 * + [5,6.5) : Trung Bình
		 * + [6.5,8) : Khá
		 * + [8, 10] : Giỏi
		 */
		
		// Lấy phần nguyên: Math.floor, Math.ceil, Math.round
		// Làm tròn lấy cả phần nguyên + thập phân(số chữ số)
		// --> BigDecimal 8 16 32 bytes, hỗ trợ các hàm xử lý
		
		double rounded = RandomUtils.generatePoint();
		
		if (rounded < 5) {
			System.out.println("Yếu");
		} else if (rounded < 6.5) {
			System.out.println("Trung Bình");
		} else if (rounded < 8) {
			System.out.println("Khá");
		} else {
			System.out.println("Giỏi");
		}
		
		// đóng kết nối của ip
		ip.close();
	}
	
}
