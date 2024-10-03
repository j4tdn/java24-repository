package controlling;

import java.time.Year;
import java.util.Random;
import java.util.Scanner;

import utils.RandomUtils;

public class Ex01IfElse {
	public static void main(String[] args) {

		// Câu 1
		Random rd = new Random();
		int number = rd.nextInt(5, 20);

		int currentYear = Year.now().getValue();
		if (number % 2 == 0) {
			System.out.println("Thông tin --> " + (currentYear + number));
		}

		// Câu 2
		Scanner ip = new Scanner(System.in);
		System.out.println("Nhap mat khau ");
		String password = ip.nextLine();
		if (password.length() >= 8) {
			System.out.println("mat khau hop le");
		} else {
			System.out.println("Mat khau khong hop le, vui long nhap lai");
		}

		// Câu 3
		double rounded = RandomUtils.generatePoint();

		if (rounded < 5) {
			System.out.println("yếu");
		} else if (rounded < 6.5) {
			System.out.println("trung bình");
		} else if (rounded < 8) {
			System.out.println("Khá");
		} else {
			System.out.println("Giỏi");
		}

		// đóng kết nối của ip
		ip.close();
	}

}