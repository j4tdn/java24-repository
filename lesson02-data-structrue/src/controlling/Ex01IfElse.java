package controlling;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.Year;
import java.util.Random;
import java.util.Scanner;

import utils.RandomUtils;

public class Ex01IfElse {

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		
//		int res = rand.nextInt(5, 20);
//		int currentYear = Year.now().getValue();
//		
//		if (res % 2 == 0) {
//			System.out.println(res);
//			System.out.println("Thong tin --> " + (currentYear + res));
//		}
//
//		System.out.print("\nNhập mật khẩu: ");
//		String pass = sc.nextLine();
//		if (pass.length() >= 8) {
//			System.out.println("Valid input");
//		} else {
//			System.out.println("Invalid input. Please enter again");
//		}
		
		
		
		double rounded = RandomUtils.generationPoint();
		System.out.println("Mark [Commercial] = " + rounded);
		
		if (rounded >= 8) {
			System.out.println("Gioi");
		} else if (rounded >= 6.5) {
			System.out.println("Kha");
		} else if (rounded >= 5) {
			System.out.println("Trung binh");
		} else {
			System.out.println("Yeu");
		}
		
		// a/0 exception
		// a/0.0: Infinity
		
		sc.close();
	}
	
	//Modify val tu double -> bigdecimal
	private static BigDecimal bd(double value) {
		return new BigDecimal(String.valueOf(value));
	}

}
