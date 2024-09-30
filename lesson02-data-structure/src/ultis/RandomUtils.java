package ultis;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class RandomUtils {

	private static Random rd = new Random();
	
	public static double generatePoint() {
		double point = rd.nextDouble(0, 10);
		System.out.println("\nDiem = "+ point);
		
		double rounded = bd(point)  // chuyen doi double sang bigdecimal
				.setScale(1, RoundingMode.HALF_UP)  // lam tron commercial 1 gia tri
				.doubleValue(); //chuen tu Bigdecimal ve lai double
		
		System.out.println("Diem (lam tron) = " + rounded);
		
		return rounded;
	}
	
	private static BigDecimal bd(double value) {
		return new BigDecimal(String.valueOf(value));
	}
}
