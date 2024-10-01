package utils;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class RandomUtils {
	private static Random rd = new Random();

	public static double generatePoint() {
		// Biến/hàm Static chỉ được khởi tạo 1 lần duy nhất khi class loading
		

		double point = rd.nextDouble(0, 11);
		if (point > 10) {
			point = 10;
		}

		System.out.println("\nĐiểm = " + point);

		double rounded = bd(point).setScale(1, RoundingMode.HALF_UP)// Làm tròn commercial 1 chữ số thập phân
				.doubleValue();// CHuyển từ BigDecimal về double
		System.out.println("Điểm (làm tròn): " + rounded);

		return rounded;
	}

	private static BigDecimal bd(double value) {
		return new BigDecimal(String.valueOf(value));
	}
}
