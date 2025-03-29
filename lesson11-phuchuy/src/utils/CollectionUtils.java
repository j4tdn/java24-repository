package utils;

import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CollectionUtils {
private CollectionUtils() {

}
public static <E> void generate(String prefefix, Collection<E> list) {
	
	System.out.println(prefefix + " {");
	for (E e: list) {
		System.out.println("+ " +e);
	}
	
	System.out.println("}\n");
	System.out.println("==========================================");
}
public static <K,V> void generate(String prefefix, Map<K, V> map) {
	Set<Entry<K, V>> set = map.entrySet();
	generate(prefefix, set);
}
}
