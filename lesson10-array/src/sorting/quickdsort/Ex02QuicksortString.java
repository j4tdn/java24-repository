package sorting.quickdsort;

import java.util.Arrays;

public class Ex02QuicksortString {
    public static void main(String[] args) {
        String[] elements = {"a1", "a2", null, "b1", "b2", null, "b3"};

        Arrays.sort(elements, (s1, s2) -> {
            if (s1 == null) return 1;
            else if (s2 == null) return -1;
            return s1.compareTo(s2);
        });

        System.out.println(Arrays.toString(elements));

    }
}
