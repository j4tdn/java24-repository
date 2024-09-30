package utils;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class RandomUtils {
	// util = utility: tiện ích, hỗ trợ
	
	// Biến/Hàm static chỉ được khởi tạo 1 lần duy nhất khi class loading
	private static Random rd = new Random();
	
	public static double generatePoint() {
		double point = rd.nextDouble(0, 11); // [0, 11)
		if (point > 10) {
			point = 10;
		}
		
		System.out.println("\nĐiểm = " + point);
		
		double rounded = bd(point) // chuyển đổi double sang BigDecimal
				.setScale(1, RoundingMode.HALF_UP) // làm tròn commercial 1 chữ số thập phân
				.doubleValue(); // chuyển từ BigDecimal về lại double
		System.out.println("Điểm(làm tròn) = " + rounded);
		
		return rounded;
	}
	
	// Chuyển đổi value từ KDL double sang BigDecimal
	private static BigDecimal bd(double value) {
		return new BigDecimal(String.valueOf(value));
	}
	
}
