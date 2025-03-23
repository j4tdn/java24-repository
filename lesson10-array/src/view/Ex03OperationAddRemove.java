package view;

import java.util.Arrays;

public class Ex03OperationAddRemove {
    public static void main(String[] args) {
        String[] words = new String[]{"a", "b", "c", "d", "e", "f", "g", "h"};
        try{
            System.out.println(Arrays.toString(add(words, 3, "cc")));

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println(Arrays.toString(remove(words, 3)));
    }

    private static String[] add(String[] source, int position, String newValue) {
        if(position < 0  || position > source.length) {
            throw new IllegalArgumentException("Vị trí thêm vượt ngoài phạm vi của mảng");
        }
        String[] result = new String[source.length + 1];
        result = Arrays.copyOf(source, result.length);

        for (int i = result.length - 1; i >= position; i--) {
            result[i] = result[i - 1];
        }
        result[position] = newValue;

        return result;
    }

    private static String[] remove(String[] source, int position) {
        for (int i = position; i < source.length - 1; i++) {
            source[i] = source[i + 1];
        }

        return Arrays.copyOf(source, source.length - 1);
    }

}
