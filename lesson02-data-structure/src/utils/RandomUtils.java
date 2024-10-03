package utils;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class RandomUtils {
	//utils = utility: tiện ích, hỗ trợ
	
	private static Random rd = new Random();
	
	public static double generatePoint() {
		double point = rd.nextDouble(0,11);
		if (point > 10) {
			point = 10;
		}
		System.out.println("\nĐiểm = " + point);
		
		double rounded = bd(point)//chuyển đổi từ double sang bigdecimal
				.setScale(1, RoundingMode.HALF_UP)//làm tròn commercial  1 chữ số thập phân
				.doubleValue();//chuyền từ bigdecimal sang double 
		
		System.out.println("Điểm đã làm tròn = " + rounded);
		
		return rounded;
	}
	
	private static BigDecimal bd(double value){
		return new BigDecimal(String.valueOf(value));
	}

}
