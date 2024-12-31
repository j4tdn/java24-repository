package view.number;

import java.math.BigDecimal;

public class Ex02BigDecimalDemo {
	public static void main(String[] args) {
		BigDecimal bd1 = new BigDecimal("36429.2486822");
		BigDecimal bd2 = new BigDecimal(36429.2486822);
		BigDecimal bd3 = BigDecimal.valueOf(36429.2486822);

		System.out.println("bd1: " + bd1);
		System.out.println("bd2: " + bd2);
		System.out.println("bd3: " + bd3);
		BigDecimal bd4 = bd(36429.1234567222).add(bd(444.7654321444));
		
	
		
		
	}

	private static BigDecimal bd(double value) {
		return new BigDecimal(String.valueOf(value));
	}
}
