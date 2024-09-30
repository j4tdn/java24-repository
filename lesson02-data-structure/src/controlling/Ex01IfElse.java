package controlling;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.Year;
import java.util.Random;
import java.util.Scanner;

import ultis.RandomUtils;

public class Ex01IfElse {

	public static void main(String[] args) {
//		Cau 1:
		Random rd = new Random();
		int number = rd.nextInt(5, 20);
		int currentYear = Year.now().getValue();
		
		if (number % 2 == 0) {
			System.out.println("Thong tin --> "+ (currentYear + number));
		}
		
//		Cau 2:
		Scanner ip = new Scanner(System.in);
		System.out.print("Nhap mat khau");
		String password = ip.nextLine();
		
		if (password.length() >= 8) {
			System.out.println("Mat khau hop le.");
		}
		else {
			System.out.println("Mat khau khong hop le!, vui long nhap lai");
		}
		
		//Dong ket noi cua ip
		ip.close();
		
//		Cau 3: Random cua 1 hs nam trong gtri 1.0 - 10.0
//		Duoc ket qua lam tron 1 chu so 
		double point = rd.nextDouble(0, 10);
		System.out.println("\nDiem = "+ point);
		
		double rounded = RandomUtils.generatePoint();
		
		
		
	}
	
	
}
