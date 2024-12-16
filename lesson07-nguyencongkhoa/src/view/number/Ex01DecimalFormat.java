package view.number;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class Ex01DecimalFormat {

	public static void main(String[] args) {
		float rf = doAllocationF();
		System.out.println("Kết quả: " + rf);

		double rd = doAllocationD();
		System.out.println("Kết quả: " + rd);

		// 3.32345672E11
		float rf1 = 3356.272f;
		System.out.println("Kết quả: " + rf1); // E^...

		// In ra giao diện ngăn cách nhau bởi , phần thập phân .
		// Áp dụng được khi tổng cả phần nguyên + thập phân = 8
		DecimalFormat df = new DecimalFormat("#,###.0000");
		System.out.println("Định dạng: " + df.format(rf1));

		System.out.println("bigde: " + new BigDecimal(rf1));

	}

	// float: 8 chữ số
	private static float doAllocationF() {
		return 33.2829717939291f * 22445.83925929292923333333f;
	}

	// double: 15 chữ số
	private static double doAllocationD() {
		return 33.2829717939291d * 22445.83925929292923333333d;
	}

}