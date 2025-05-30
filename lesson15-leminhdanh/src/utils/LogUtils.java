package utils;

import java.util.Collection;
import java.util.Map;

public class LogUtils {

	private LogUtils() {
	}

	public static <K, A, V> void generate(String prefix, Map<K, Map<A, V>> collection) {
		System.out.println(prefix);
		
		collection.entrySet().stream().forEach(e -> {
			System.out.println(e.getKey() + ": " );
			e.getValue().entrySet().stream().forEach(s -> {
				System.out.println("\tS" + s.getKey() + ": " + s.getValue());
			});
		});
	}
	
	public static <K, V> void generate1(String prefix, Map<K, V> collection) {
		
		System.out.println(prefix);
		collection.entrySet().stream().forEach(m -> {
			System.out.println("\tS" + m.getKey() + ": " + m.getValue());
		});
	}
	
}
