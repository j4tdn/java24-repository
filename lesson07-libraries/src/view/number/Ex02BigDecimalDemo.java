package view.number;

import java.math.BigDecimal;

public class Ex02BigDecimalDemo {
	
	public static void main(String[] args) {
		// Code theo dạng Builder Pattern --> chỉ 
		//có 1 thuộc tính value
		
		//Khởi tạo giá trị BigDecimal
		BigDecimal bd1 = new BigDecimal("11234.123465654");
		BigDecimal bd2 = new BigDecimal(11234.123465654);
		BigDecimal bd3 = BigDecimal.valueOf(11234.123465654);
		
		System.out.println("bd1 --> " + bd1 );
		System.out.println("bd2 --> " + bd2 );
		System.out.println("bd3 --> " + bd3 );
		
		BigDecimal bd4 = bd(1)
				.add(bd(2));
	}
	
	
	private static BigDecimal bd(double value) {
		return new BigDecimal(String.valueOf(value));
	}
}
