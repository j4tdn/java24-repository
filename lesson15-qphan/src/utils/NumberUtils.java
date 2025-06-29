package utils;

import java.math.BigDecimal;

public class NumberUtils {

	private NumberUtils() {

	}
	
	public static boolean isNonNullAndZero(Number number) {
		return number != null && bd(number).compareTo(BigDecimal.ZERO) != 0;
	}

	public static boolean isNullOrZero(Number number) {
		return number == null || bd(number).compareTo(BigDecimal.ZERO) == 0;
	}
	
	public static BigDecimal bd(Number number) {
		return new BigDecimal(String.valueOf(number));
	}

}