package utils;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class Ex01RandomUtils {
	// util: tiện ích, hỗ trợ

	// tất cả các hàm trong util class --> dều la static tl mêthods
	// nên được gọi từ class
	// dù có tạo ra n đối tượng thì cũng k ảnh hưởng đến KQ của hàm static
	// --> thay vì dùng hàm tạo mặc định thì dev có thể tạo đối tượng lãng phí tài
	// nguyên
	// --> Ta sẽ private hàm khởi tạo mặc định lại để tránh khởi tạo luôn trong
	// class util
// bien/Ham static chi dc khoi tao 1 lan duy nhat torng luc class dang loading
	private static Random rd = new Random();

	private Ex01RandomUtils() {
	};

	public static double generatePoint() {
		double point = rd.nextDouble(0, 11); // [0, 11)
		if (point > 10) {
			point = 10;
		}
		System.out.println("\n Diem= " + point);

		double rounded = bd(point) // chuyen doi double sang BigDecimal
				.setScale(1, RoundingMode.HALF_UP) // lam tron commercial 1
				.doubleValue(); // chyen tu BigDecimal ve lai double
		System.out.println("Diem (lam tron)= " + rounded);
		return rounded;
	}

	// Chuyen doi value tu KDL double sang BigDecimal
	private static BigDecimal bd(double value) {
		return new BigDecimal(String.valueOf(value));
	}
}
