package utils;

import java.math.BigDecimal;

public class NumberUtils {
	
	public NumberUtils() {
	}

	public static BigDecimal bd(Number number) {
		return new BigDecimal(String.valueOf(number));
	}
}
