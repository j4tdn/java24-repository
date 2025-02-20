package utils;

import bean.Item;
import functional.Type;

import java.util.Arrays;

public class ArrayUtils {
    private ArrayUtils() {
    }

    public static String[] add(String[] source, int position, String newValue) {
        if (position < 0 || position > source.length) {
            throw new IllegalArgumentException("Vị trí thêm vượt ngoài phạm vi của mảng");
        }
        String[] result = new String[source.length + 1];
        result = Arrays.copyOf(source, result.length);

        for (int i = result.length - 1; i > position; i--) {
            result[i] = result[i - 1];
        }
        result[position] = newValue;

        return result;
    }

    public static int[] remove(int[] source, int position) {
        for (int i = position; i < source.length - 1; i++) {
            source[i] = source[i + 1];
        }

        return Arrays.copyOf(source, source.length - 1);
    }

    public static String[] remove(String[] source, int position) {
        for (int i = position; i < source.length - 1; i++) {
            source[i] = source[i + 1];
        }

        return Arrays.copyOf(source, source.length - 1);
    }

    public static int[] customSort(int[] source, int k) {
        for (int i = 0; i < k; i++) {
            for (int j = i + 1; j < source.length; j++) {
                if (source[i] < source[j]) {
                    int tmp = source[i];
                    source[i] = source[j];
                    source[j] = tmp;
                }
            }
        }
        return source;
    }

    public static Item getHighestPrice(Item[] source) {
        int max = Integer.MIN_VALUE;
        Item res = null;
        for (int i = 0; i < source.length; i++) {
            if (source[i].getPrice() > max) {
                max = source[i].getPrice();
                res = source[i];
            }
        }
        return res;
    }

    public static int[] cleanArray(int[] source) {
        for (int i = 0; i < source.length - 1; i++) {
            for (int j = source.length - 1; j > i; j--) {
                if (source[i] == source[j]) {
                    source = remove(source, j);
                }
            }
        }
        return source;
    }

    public static int sumOfAnAscii(byte[] bytes) {
        int sum = 0;
        for (byte b : bytes) {
            sum += b;
        }
        return sum;
    }

}
