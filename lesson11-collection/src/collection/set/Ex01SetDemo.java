package collection.set;

import utils.CollectionUtils;

import java.util.HashSet;
import java.util.Set;

public class Ex01SetDemo {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("A");
        set.add("B");
        set.add("C");
        set.add("D");
        set.add("E");
        set.add("F");

        set.add("A");
        set.add("B");
        CollectionUtils.generate("1. DU lieu", set);
    }
}
