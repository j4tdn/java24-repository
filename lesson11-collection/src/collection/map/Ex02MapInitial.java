package collection.map;

import java.util.HashMap;
import java.util.Map;

public class Ex02MapInitial {
    public static void main(String[] args) {
        Map<Integer, String> letters = Map.of(
                65, "A",
                66, "B",
                67, "C");
        System.out.println(letters.size());
        System.out.println(letters.get(65));

        letters.forEach((key, value) -> System.out.println(key + ": " + value));
    }

}
