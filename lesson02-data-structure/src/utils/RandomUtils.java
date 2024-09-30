package utils;

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
		
		System.out.println("điểm = " + point);
		
		double rounded = bd(point) //chuyển đổi double sang BigDecimal
				.setScale(1, RoundingMode.HALF_UP) // Làm tròn commercial 1
 				.doubleValue(); // chuyển từ BigDecimal về lại double
		System.out.println("điểm (làm tròn)" + rounded);
		return rounded;
	}
	
	//chuyển đổi value từ KDL double sang BigDecimal
	private static BigDecimal bd(double value) {
		return new BigDecimal(String.valueOf(value));
	}
}
