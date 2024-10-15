package utils;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class RandomUtils {
	
	
	// Tất cả các hàm trpong util class đều là hàm static util methods
	// Nên được gọi từ class
	// Dù mình có tạo ra N đối tượng thì cũng ko ảnh hưởng đến kết quả của static
	// --> thay vì dùng default constructor(public) thì dev có thể tạo ra 
	// đối tượng lãng phí tài nguyên --> dùng private constructor
	private RandomUtils( ) {
	}
	
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
