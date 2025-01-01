package view.number;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class Exx01DecimalFormat {

	public static void main(String[] args) {

		double rd = doAllocationD();
		System.out.println("Kết quả: " + rd);
		
		double rf = doAllocationF();
		System.out.println("Kết quả: " + rf);
		
		

		float rf1 = 3356.272f;
		System.out.println("Kết quả: " + rf1); // E^

		// In ra giao diện ngăn cách nhau bởi dấu , phần thập phân .
		// Áp dunng được khi tổng cả phần nguyên + thập phân = 8
		DecimalFormat df = new DecimalFormat("#,###.0000");
		System.out.println("Định dạng: " + df.format(rf1));
		
		System.out.println("Bridge: "+ new BigDecimal(rf1));
	}

	private static double doAllocationF() {
		return 33.282914234234234234f * 2254.84375345f;
	}
	
	private static double doAllocationD() {
		return 33.282914234234234234d * 2254.84375345d;
	
}
}
