package controlling;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.time.Year;
import java.util.Random;
import java.util.Scanner;

import utils.RandomUtils;

public class Ex01IfElse {
	
	public static void main(String[] args) {
		
		//1.
		Random rd = new Random();
		
		int a = rd.nextInt(5, 20);
		System.out.println("Giá trị ngẫu nhiên -->" + a);
		
		int currentYear = Year.now().getValue();
		
		if (a % 2 == 0) {
			System.out.println("Thông tin --> " + (currentYear + a));
		}
		
		//2.
		Scanner ip = new Scanner(System.in);
		
		System.out.print("\nNhập mk: ");
		String password = ip.nextLine();
		
		if (password.length() >= 8) {
			System.out.println("Mật khẩu hợp lệ");
		} else {
			System.out.println("Mật khẩu không hợp lệ, vui lòng nhập lại");
		}
		
		//3.
		
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
		
		ip.close();
	}
}
