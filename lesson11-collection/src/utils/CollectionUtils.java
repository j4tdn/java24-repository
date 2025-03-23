package utils;

import bean.Item;

import java.util.Collection;

public class CollectionUtils {

    private CollectionUtils() {}
    public static <T> void generate(String prefix, Collection<T> collection) {
        System.out.println(prefix + "  {");
        collection.forEach(element -> System.out.println("    +" + element));

        System.out.println("}\n");
    }

}
