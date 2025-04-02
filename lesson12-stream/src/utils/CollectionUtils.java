package utils;

import java.util.Collection;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;

public class CollectionUtils {

	public CollectionUtils() {
		// TODO Auto-generated constructor stub
	}
	
	public static <K, V> void generate(String prefix, Map<K, V> map) {
		Set<Entry<K, V>> entries = map.entrySet();
		generate(prefix, entries);
	}
	
	public static <T> void generate(String prefix, Collection<T> collection) {
		System.out.println(prefix + "  {");
		collection.forEach(element -> {
			System.out.println("   + " + element);
		});
		System.out.println("}\n");
	}
	
}
