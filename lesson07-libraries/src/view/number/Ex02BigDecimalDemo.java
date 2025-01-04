package view.number;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class Ex02BigDecimalDemo {
	
	public static void main(String[] args) {
		// Code theo dạng Builder Pattern --> chỉ có 1 thuộc tính value
		
		// Khởi tạo giá trị BigDecimal
		BigDecimal bd1 = new BigDecimal("36429.2486822");
		BigDecimal bd2 = new BigDecimal(36429.2486822);
		BigDecimal bd3 = BigDecimal.valueOf(36429.2486822);
		
		System.out.println("bd1: " + bd1);
		System.out.println("bd2: " + bd2);
		System.out.println("bd3: " + bd3);
		
		// float: 7 chữ số
		// double: 16 chữ số
		
		// add, subtract, multiple, divide 
		// --> MathContext cho double với 16 chữ số
		
		BigDecimal bd4 = bd(36429.12345672224233)
				.add(bd(4444.76543214443233), MathContext.DECIMAL64)
				.divide(bd(2));
		System.out.println("bd4: " + bd4);
		
		// Số nguyên: Integer, Long
		// Số thực: BigDecimal
		
		
	}
	
	private static BigDecimal bd(double value) {
		return new BigDecimal(String.valueOf(value));
	}
	
}