package utils;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class RandomUtils {
	// util = utility: tiá»‡n Ă­ch, há»— trá»£
	
	// Biáº¿n/HĂ m static chá»‰ Ä‘Æ°á»£c khá»Ÿi táº¡o 1 láº§n duy nháº¥t khi class loading
	
	// Tất cả các hàm trong util class --> đều là static util method
	// nên được gọi từ class
	
	public RandomUtils() {
		
	}
	
	private static Random rd = new Random();
	
	public static double generatePoint() {
		double point = rd.nextDouble(0, 11); // [0, 11)
		if (point > 10) {
			point = 10;
		}
		
		System.out.println("\nÄ�iá»ƒm = " + point);
		
		double rounded = bd(point) // chuyá»ƒn Ä‘á»•i double sang BigDecimal
				.setScale(1, RoundingMode.HALF_UP) // lĂ m trĂ²n commercial 1 chá»¯ sá»‘ tháº­p phĂ¢n
				.doubleValue(); // chuyá»ƒn tá»« BigDecimal vá»� láº¡i double
		System.out.println("Ä�iá»ƒm(lĂ m trĂ²n) = " + rounded);
		
		return rounded;
	}
	
	// Chuyá»ƒn Ä‘á»•i value tá»« KDL double sang BigDecimal
	private static BigDecimal bd(double value) {
		return new BigDecimal(String.valueOf(value));
	}
	
}
