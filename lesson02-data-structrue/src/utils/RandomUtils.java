package utils;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class RandomUtils {
	private static Random rand = new Random();
	
	/*
	 all các hàm trong itil class -> đều là static util methods
	 nên đc gọi từ class -> dù tạo ra n obj thì cũng ko ảnh hưởng 
	 đến KQ của hàm static --> thay vì use default constructor(public)
	 thì dev có thể tạo Obj lãng phí tài nguyên => dùng private constructor
	 
	 => nếu class nào ko có tạo Obj thì nên để private
	 */
	
	private RandomUtils() {
	}
	
	public static double generationPoint() {
		double mark = rand.nextDouble(0, 11);

		if (mark > 10) {
			mark = 10;
		}
		System.out.println("Mark = " + mark);

		double rounded = bd(mark) // chuyen doi double sang BigDecimal
				.setScale(1, RoundingMode.HALF_UP)// lam tron commercial 1
				.doubleValue(); // Chuyen tu BD -> double
		System.out.println("Mark [Commercial] = " + rounded);
		
		return rounded;
	}
	
	private static BigDecimal bd(double value) {
		return new BigDecimal(String.valueOf(value));
	}
}
