package util;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class RandomUtils {
	private static Random rd = new Random();

	public static double generatePoint() {
		double point = rd.nextDouble(0, 11);
		if (point > 10) {
			point = 10;
		}
		System.out.println("\nĐiểm = " + point);
		
		double rounded = bd(point) // chuyển đổi double sang BigDecimal
				.setScale(1, RoundingMode.HALF_UP) // làm tròn commercial 1 chữ số thập phân
				.doubleValue(); // chuyển từ BigDecimal về lại Double
		System.out.println("Điểm(làm tròn) = " + rounded);
		
		return rounded;
	}
	
	// Chuyển đổi value từ KDL double sang BigDecimal
	private static BigDecimal bd(double value) {
		return new BigDecimal(String.valueOf(value));
	}
}
