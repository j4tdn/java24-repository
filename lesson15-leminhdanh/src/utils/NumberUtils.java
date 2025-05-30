package utils;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class NumberUtils {

	private NumberUtils() {

	}

	public static BigDecimal bd(double val) {
		return new BigDecimal(String.valueOf(val));
	}
	
	public static BigDecimal rounding(BigDecimal source, int scale) {
		return source.setScale(scale, RoundingMode.HALF_UP);
	}

}