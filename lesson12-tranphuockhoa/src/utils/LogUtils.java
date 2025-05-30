package utils;

import java.util.Map;

public class LogUtils {
	
	private LogUtils() {
	}
	
	public static <K, V> void logging(String prefix, Map<K, V> map) {
		System.out.println(prefix + " {");
		map.forEach((k, v) -> System.out.println("    S" + k + ": " + v));
		System.out.println("}\n");
	}
	
}