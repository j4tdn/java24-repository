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
		 * Câu 1: Random 1 số nguyên ngâu nhiên [5,20) Kiểm tra số đó là chẵn hay ko +
		 * nếu là chẵn --> in ra năm hiện tại và + số đó + ngược lại --> ko làm gì cả
		 */
		Random rd = new Random();
		int number = rd.nextInt(5, 20);
		System.out.println("Gia tri ngau nhien --> " + number);

		// Lấy năm hiện tại
		int currentYear = Year.now().getValue();

		if (number % 2 == 0) {

			System.out.println("Thong tin --> " + (currentYear + number));

		}
		/*
		 * Câu 2: Nhập vào 1 mk Kiểm tra độ dài của mk đó + nếu độ dài >= 8 thì in ra mk
		 * hợp lệ + ngược lại thì in ra mk ko hợp lệ vui lòng nhập lại
		 * 
		 * 
		 */

		Scanner ip = new Scanner(System.in);
		System.out.print("\nNhập vào mk: ");
		String password = ip.nextLine();

		if (password.length() >= 8) {
			System.out.println("MK hợp lệ");
		} else {
			System.out.println("Mk ko hợp lệ vui lòng nhập lại");
		}

		/*
		 * Câu 3: Random điểm của 1 bạn học sinh nằm trong [0.0, 10.0] Được kết quả làm
		 * tròn 1 chữ số (up, down, commercial) Nếu điểm: + [0,5) : Yếu + [5, 6.5) : TB
		 * + [6.5,8) : Khá + [8,10): Giỏi
		 */

		// Lấy phàn nguyên: Math.floor, Math.ceil. Math.round
		// Làm tròn lấy cả phần nguyên + thập phân(số chữ số)
		// --> BigDecimal 8 16 32 bytes, hỗ trợ các hàm xử lý

		

		double point = rd.nextDouble(0, 11);
		if (point > 10) {
			point = 10;
		}

		System.out.println("\nĐiểm = " + point);

		double rounded = bd(point).setScale(1, RoundingMode.HALF_UP)// Làm tròn commercial 1 chữ số thập phân
				.doubleValue();// CHuyển từ BigDecimal về double
		System.out.println("Điểm (làm tròn): " + rounded);
		String rank;
		if (rounded < 5) {
			rank = "Yếu";
		} else if (rounded < 6.5) {
			rank = "TB";
		} else if (rounded < 8) {
			rank = "Khá";
		} else {
			rank = "Giỏi";
		}
		System.out.println("Xếp loại --> " + rank);

		ip.close();// Đóng kết nối của ip
	}

	private static BigDecimal bd(double value) {
		return new BigDecimal(String.valueOf(value));
	}

}
