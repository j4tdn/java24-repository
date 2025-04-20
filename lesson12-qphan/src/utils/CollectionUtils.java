package utils;

import java.util.Collection;
import java.util.Map;

public class CollectionUtils {
	
	private CollectionUtils() {
	}
	
	public static <K, V> void generate(String prefix, Map<K, V> elements) {
		System.out.println(prefix + " --> {");
		elements.entrySet().forEach(element -> System.out.println("    + " + element));
		System.out.println("}\n");
	}
	
	public static <E> void generate(String prefix, Collection<E> elements) {
		System.out.println(prefix + " --> {");
		elements.forEach(element -> System.out.println("    + " + element));
		System.out.println("}\n");
	}
	
}
