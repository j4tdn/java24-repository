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
		 Kiểm tra số đó có phải là số chẵn hay ko
		 + Nếu là chẵn --> in ra năm hiện tại + số đó
		 + Ngược lại   --> ko làm gì cả
		*/
		Random rd = new Random();
		int number = rd.nextInt(5, 7); // nextInt(a, b) --> [a, b)
		System.out.println("Giá trị ngẫu nhiêu --> " + number);
		
		// Lấy năm hiện tại
		int currentYear = Year.now().getValue();
		
		if (number % 2 == 0) {
			System.out.println("Thông tin --> " + (currentYear+number));
		}
		
		/*
		 Câu 2: Nhập vào mật khẩu
		 Kiểm tra độ dài của mật khẩu đó
		 + Nếu đội dài >= 8 --> in ra mật khẩu hợp lệ
		 + Ngược lại        --> in ra mật khẩu không hợp lệ vui lòng nhập lại
		 */
		Scanner ip = new Scanner(System.in);
		System.out.print("\nNhập mật khẩu: ");
		String password = ip.nextLine();
		if (password.length() >= 8) {
			System.out.println("Mật khẩu hợp lệ");
		} else {
			System.out.println("Mật khẩu không hợp lệ, vui lòng nhập lại");
		}
		
		/*
		 Câu 3: Random điểm của 1 học sinh [0.0, 10.0]
		 Được kết quả, làm tròn 1 chữ số(up, down, [commercial])
		 Nếu điểm
		 + [0, 5)  : Yếu
		 + [5, 6.5): Trung Bình
		 + [6.5, 8): Khá
		 + [8, 10] : Giỏi
		 */
		
		// Lấy phần nguyên: Math.floor, Math.ceil, Math.round
		// Làm tròn lấy cả phần nguyên + thập phân(số chữ số)
		// --> BigDecimal 8 16 32 bytes, hỗ trợ các hàm xử lý
		
		double rounded = RandomUtils.generatePoint();
		
		// 6.5 ?= 6.5
		// --> floating point
		// a/0 --> exception
		// a/0.0 --> Infinity
		// System.out.println(5f/0f);
		
		String rank = "";
		if(rounded < 5) {
			rank = "Yếu";
		} else if (rounded < 6.5) {
			rank = "Trung bình";
		} else if (rounded < 8) {
			rank = "Khá";
		} else {
			rank = "Giỏi";
		}
		System.out.println("Xếp loại --> " + rank);
		
		// đóng kết nối của ip
		ip.close();
	}
	
<<<<<<< HEAD
}
=======
}
>>>>>>> f5ddcb2 (khoi tao)
