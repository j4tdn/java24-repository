package collection.map;

import java.util.HashMap;
import java.util.Map;

public class Ex01HashMapDemo {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);
        map.put("D", 4);
        System.out.println(map.get("A"));
    }
}
