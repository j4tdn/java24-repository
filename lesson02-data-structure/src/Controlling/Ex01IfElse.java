package Controlling;

import java.math.BigDecimal;
import java.time.Year;
import java.util.Random;
import java.util.Scanner;

import utils.Ex01RandomUtils;

public class Ex01IfElse {

	public static void main(String[] args) {

		/*
		 * Câu 1: Random 1 số nguyên ngẫu nhiên từ [5, 20) check if that number co phai
		 * so chan hay ko + Nếu là chẵn --> in ra hàm hiện tại + số đó + Ngược lại --->
		 * ko làm gì cả
		 * 
		 */
		Random rd = new Random();
		int number = rd.nextInt(5, 20); // nextInt(a,b) --> [a,b)
		System.out.println("Gia tri ngau nhien ---> " + number);
		// Lay nam hien tai
		int currentYear = Year.now().getValue();

		if (number % 2 == 0) {
			System.out.println("Thong tin ---> " + (currentYear + number));
		}

		/*
		 * Câu 2: Nhập vào mật khẩu Kiểm tra độ dài của mật khẩu đó + Nếu độ dài lớn hơn
		 * 8 --> in ra mật khẩu hợp lệ + Ngược lại --> in ra mật khẩu không hợp lệ
		 */
		Scanner ip = new Scanner(System.in);
		System.out.print("\nNhap mat khau: ");
		String password = ip.nextLine();
		if (password.length() >= 8) {
			System.out.println("Mat khau hop le");
		} else {
			System.out.println("Mat khau ko hop le");
		}

		/*
		 * Cau 3: Random diem cua 1 hs [0.0, 10.0] Dc ket qua, lam tron 1 chu so thap
		 * phan(up, down, [commercial]) Neu diem: + [0, 5): Yeu + [5, 6.5): Trung binh +
		 * [6.5, 8): Kha + [8, 10]: Gioi
		 */
		/*
		 * Lay phan nguyen: Math.floor, Math.cell, Math.round Lam tron lay ca phan
		 * nguyen + thap phan ( so chu so ) --> BigDecimal 8 16 32
		 * 
		 */
		double rounded = Ex01RandomUtils.generatePoint();

		String rank = "";
		if (rounded < 5) {
			rank = "Yeu";
		} else if (rounded < 6.5) {
			rank = "Trung Binh";
		} else if (rounded < 8) {
			rank = "Kha";
		} else {
			rank = "Gioi";
		}
		System.out.println("Xep Loai: " + rank);
		ip.close();
		// dong ket noi ip
	}

	// Chuyen doi value tu KDL double sang BigDecimal
	private static BigDecimal bd(double value) {
		return new BigDecimal(String.valueOf(value));
	}
}
