package view.number;

import java.math.BigDecimal;

public class Ex02BigDecimalDemo {
	
	public static void main(String[] args) {
		// COde theo dạng builder pattern --> chỉ có 1 thuộc tính value
		
		
		// Khởi tạo giá trị BigDecimal
		BigDecimal bd1 = new BigDecimal("36429.2486822");
		BigDecimal bd2 = new BigDecimal(36429.2486822);
		BigDecimal bd3 = BigDecimal.valueOf(36429.2486822);
		
		System.out.println(bd1);
		System.out.println(bd2);
		System.out.println(bd3);
		
		// float: 7 chữ số kể cả thập phân
		// double: 16 chữ số kể cả thập phân
		
		
		// add, subtract, multiple, divide 
		// --> MathContext cho double với 16 chữ số
		BigDecimal bd4 = new BigDecimal(43234.13214234)
				.add(bd(4444.42323432443));
		System.out.println(bd4);
		
		// Số nguyên: Integer, Long
		// Số thực: Bigdecimal
		
	}
	
	private static BigDecimal bd(double value) {
		return new BigDecimal(String.valueOf(value));
	}

}
