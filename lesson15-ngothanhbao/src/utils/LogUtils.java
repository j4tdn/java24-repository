package utils;

import java.util.List;
import java.util.Map;

public class LogUtils {
	
	private LogUtils() {
	}
	
	public static <K, V> void logging(String prefix, Map<K, V> map) {
		System.out.println(prefix + " {");
		map.forEach((k, v) -> System.out.println("   " + k + ": " + v));
		System.out.println("}\n");
	}
	
	public static <K, V> void logging2(String prefix, Map<K, List<V>> map) {
		System.out.println(prefix + " {");
		map.forEach((k, v) -> {
			System.out.println("Item: " + k);
			v.forEach(System.out::println);
		});
		System.out.println("}\n");
	}
	
}