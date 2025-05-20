package utils;

import java.text.DecimalFormat;
import java.util.Map;

public class LogUtils {
	
	private static DecimalFormat df = new DecimalFormat("#,###.#");
	
	public LogUtils() {
	}
	
	public static <K, V> void logging(String prefix, Map<K, V> map) {
		System.out.println(prefix + " {");
		map.forEach((k,v) -> System.out.println("    S" + k + ":  " + df.format(v)));
		System.out.println("}\n");
	}

}
