package utils;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class RandomUtils {
	private static Random rand = new Random();
	
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
