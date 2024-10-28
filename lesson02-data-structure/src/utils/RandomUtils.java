package utils;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class RandomUtils {
	// utils = utility: tiện ích, hỗ trợ 
	// Biến/hàm static chỉ được khởi tạo 1 lần duy nhất khi class loading 
	
	// Tất cả các hàm trong util class --> đều là static util methods
	// nên được gọi từ class
	// Dù tạo ra N đối tượng thì cũng không ảnh hưởng đến kết quả của hàm static
	// --> Thay vì dùng defualt constructor(public) thì dev có thể tạo 
	// đối tượng lãng phí tài nguyên --> dùng private constructor
	private RandomUtils() {
		
	}
	
	// Biến/hàm chỉ được khởi tạo 1 lần duy nhất khi class loading
	private static Random rd = new Random();
	
	public static double generatePoint() {
		double point = rd.nextDouble(0, 10);
		if(point > 10) {
			point = 10;
		}
		System.out.println("\nĐiểm = " + point);
		
		double rounded = bd(point) // chuyển đổi double sang BigDecimal
				.setScale(1, RoundingMode.HALF_UP) // làm tròn comercial 1
				.doubleValue(); // chuyển từ BigDecimal về lại double
		System.out.println("Điểm làm tròn = " + rounded);
		
		return rounded; 
	}
	
	// Chuyển đổi value từ KDL sang BigDecimal
	
		private static BigDecimal bd(double value) {
			return new BigDecimal(String.valueOf(value));
		}
	

}
