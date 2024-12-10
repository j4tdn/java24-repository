package utils;

public class UtilsDateTime {
	
	private UtilsDateTime() {
	}
	
	public static String optional(long value, String unit) {
		if (value == 0) {
			return "";
		}
		return value + " " + unit + " ";
	}
	
	public static String optionalEnd(long value, String unit) {
		if (value == 0) {
			return "";
		}
		return value + " " + unit;
	}
	
}
