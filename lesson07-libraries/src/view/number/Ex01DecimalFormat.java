package view.number;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class Ex01DecimalFormat {

	public static void main(String[] args) {
		double rd = doAllocationD();
		System.out.println("Kết quả: " + rd);
		float rf = doAllocationF();
		System.out.println("Kết quả: "+ rf);
		
		float rf1 = 213492.231213f;
		System.out.println("Kết quả: "+rf1);
		
		System.out.println("bigde: "+ new BigDecimal(rf1));
		
		//IN ra giao diện ngnă cách nhau bơi , phần thập phân .
		// Áp dụng đc khi tổng cả phần nguyên + thập phân = 8 
		DecimalFormat df = new DecimalFormat("#,###.00000000");
		System.out.println("Định dạng: "+ df.format(rf1));
	}
	
	// double có 15 chữ số
	private static double doAllocationD() {
		return 3328282837.129837192d * 228273892121.98371298321d;
	}
	private static float doAllocationF() {
		return  3328282837.129837192f * 228273892121.98371298321f;
	}

}
