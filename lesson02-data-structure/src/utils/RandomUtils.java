package utils;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class RandomUtils {
	private static Random rd = new Random();
	
	
	// Tất cả các hàm trong util class ---> đều là static util method
	// Nên được gọi từ class
	// Dù tạo ra N đối tượng thì vẫn không ảnh hưởng đến kết quả của hàm static
	// --> Thay vì dùng default constructor( public ) thì dev có thể tạo ra
	// Đối tượng lãng phí tài nguyên ---> Dùng private constructor
	
	
	private RandomUtils() {
		
	}
	
	
	public static double generatePoint() {
		double score = rd.nextDouble(0,10); // [0,10)
		if(score > 10 ) {
			score = 10;
		}
		System.out.println("\nDiem = " + score);
		
		double rounded = bd(score) // Chuyen tu double sang BigDecimal
				.setScale(1, RoundingMode.HALF_UP) // Lam tron commercial 1 chu so thap phan
				.doubleValue(); // Chuyen tu BigDecimal ve lai double
		System.out.println("Diem lam tron = " + rounded);
		return rounded;
	}

	private static BigDecimal bd(double value) {
		return new BigDecimal(String.valueOf(value));
	}
	
}
