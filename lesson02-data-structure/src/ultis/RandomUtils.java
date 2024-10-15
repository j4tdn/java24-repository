package ultis;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class RandomUtils {
	//util = utility: tiện ích, hỗ trợ
	
	//tất cả các hàm trong util class --> dều là static util method
	//Nên được gọi ra từ class
	//Dù tạo ra N đối tượng thì cũng không ảnh hưởng đến kq của hàm static
	// --> thay vì dùng default constructor(public) thì dev có thể tọa
	// đối tượng lãng phí tài nguyên --> dùng private constructor.
	
	private RandomUtils() {
	}
	
	// biến/ hàm static chỉ được khởi tạo 1 lần duy nhất khi class loading
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
