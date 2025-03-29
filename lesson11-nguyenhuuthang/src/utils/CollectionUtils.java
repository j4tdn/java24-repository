package utils;

import java.util.Collection;

public class CollectionUtils {
	private CollectionUtils() {
		// TODO Auto-generated constructor stub
	}
	
	public static <T> void generate(String prefix, Collection<T> collection) {
		System.out.println(prefix + "   { ");
		collection.forEach(elements -> {
			System.out.println("     - " + elements);
		});
		System.out.println("}\n");
	}
	
}
