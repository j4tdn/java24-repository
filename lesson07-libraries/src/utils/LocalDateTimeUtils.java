package utils;

public class LocalDateTimeUtils {
	private LocalDateTimeUtils() {
	}

	public static String optionalEnd(long value, String unit) {
		if (value == 0) {
			return "";
		}
		return value + " " + unit;
	}

	public static String optional(long value, String unit) {
		if (value == 0) {
			return "";
		}
		return value + " " + unit + " ";
	}
}
