package view.number;

import java.math.BigDecimal;
import java.math.MathContext;

public class Ex02BigDecimalDemo {
	public static void main(String[] args) {
		//Code theo Builder Pattern --> chỉ có 1 thuộc tính value
		
		//Khởi tạo giá trị BigDecimal
		BigDecimal bd1 = new BigDecimal("36342.34244322");
		BigDecimal bd2 = new BigDecimal(36342.34244322);
		BigDecimal bd3 = BigDecimal.valueOf(36342.34244322);
		
		System.out.println("bd1: "+ bd1);
		System.out.println("bd2: "+ bd2);
		System.out.println("bd3: "+ bd3);
		
		BigDecimal bd4 = bd(1)
				.add(bd(4444.76543212224233), MathContext.DECIMAL64).divide(bd(2));
		System.out.println(bd4);
		
		// Số nguyên: Integer, Long
		// SỐ thực: BigDecimal
		
		
	}
	private static  BigDecimal bd(double value) {
		return new BigDecimal(String.valueOf(value));
	}

}
