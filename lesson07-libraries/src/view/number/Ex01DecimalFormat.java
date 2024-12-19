package view.number;

import java.text.DecimalFormat;

public class Ex01DecimalFormat {

	public static void main(String[] args) {
		double result = doAllocation();
		System.out.println("Ket qua: " + result);
		
		float rf1 = 234676543123456542.456789f;
		
		// In ra giao diện ngăn cách nhau bởi , phần thập phân .
		// Áp dụng được khi tổng cả phần nguyên + thập phân = 8
		DecimalFormat df = new DecimalFormat("#,###.000");
		System.out.println("ket qua: " + df.format(rf1));
	}
	
	private static double doAllocation() {
		return 33.28297 * 22.35668986;
	}
	
}
