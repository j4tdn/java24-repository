package utils;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Collection;
import java.util.Map;

public class NumberUtils {
	
	private NumberUtils() {
	}
	
	public static BigDecimal bd(Number number) {
		return new BigDecimal(String.valueOf(number));
	}
	
	public static BigDecimal rounding(BigDecimal source, int scale) {
		return source.setScale(scale, RoundingMode.HALF_UP);
	}
	
	public static <E> boolean isNullOrEmpty(Collection<E> collection) {
		return collection == null || collection.isEmpty();
	}
	
	public static <K, V> boolean isNullOrEmpty(Map<K, V> map) {
		return map == null || map.isEmpty();
	}
	
	public static Integer zeroIfNegative(Integer source) {
		return Math.max(0, source);
	}
	
}
