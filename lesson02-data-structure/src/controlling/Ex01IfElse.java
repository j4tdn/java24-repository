package controlling;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.Year;
import java.util.Random;
import java.util.Scanner;

import utils.RandomUtils;

public class Ex01IfElse {
	
	public static void main(String[] args) {
		Random rd = new Random();
		int number = rd.nextInt(5,20);
		
		// Lấy năm hiện tại
		int currentYear = Year.now().getValue();
		
		if(number % 2 == 0) {
			System.out.println("Info ----> " + (currentYear + number));
		}
		
		Scanner ip = new Scanner(System.in);
		System.out.print("\nNhap mat khau: ");
		String password = ip.nextLine();
		if(password.length() >= 8) {
			System.out.println("Mat khau hop le!");
		} else {
			System.out.println("Mat khau khong hop le");
		}
		/*
		 Random ket qua cua 1 hoc sinh [0.0,10.0]
		 Duoc ket qua, lam tron 1 chu so (up, down, [commercial])
		 */
		// Lay phan nguyen dung: Math.floor, Math.ceil, Math.round
		// Lam tron lay phan nguyen + Thap phan(so chu so)
		// ---> BigDecimal 8 16 24 32 bytes, ho tro cac ham xu li
		double rounded = RandomUtils.generatePoint();
		
	}
}
