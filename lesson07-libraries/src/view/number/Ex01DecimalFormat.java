package view.number;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class Ex01DecimalFormat {

	public static void main(String[] args) {
		
		double resultF = doAllocationF();
		System.out.println("Kết quả = " + resultF);
		
		double resultD = doAllocationD();
		System.out.println("Kết quả = " + resultD);
		
		float rf1 = 332323.3241f;
		System.out.println("Kết quả = " + rf1);
		
		// In ra giao diện ngăn cách bởi dấu phẩy phần thập phân
		// Áp dụng được khi tổng cả phần nguyên + thập phân = 8
		DecimalFormat df = new DecimalFormat("#,###.0000");
		System.out.println("Định dạng = " + df.format(rf1));
		
		System.out.println("bigde: " + new BigDecimal(rf1));
		
	}
	
	// flout: 8 chữ số
	private static float doAllocationF() {
		return 33.2227213123123f * 21321.312123123123123f; 
	}
	
	// double: 15 chữ số
	private static double doAllocationD() {
		return 33.2227213123123d * 21321.312123123123123d; 
	}
	
}
