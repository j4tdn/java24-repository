package utils;

import java.util.Collection;

import bean.Item;

public class CollectionUtils {
	
	private CollectionUtils() {
	}
	
	public static <T> void generate(String prefix, Collection<T> collection) {
		System.out.println(prefix + "  {");
		collection.forEach(element -> {
			System.out.println("   + " + element);
		});
		System.out.println("}\n");
	}
	
}
