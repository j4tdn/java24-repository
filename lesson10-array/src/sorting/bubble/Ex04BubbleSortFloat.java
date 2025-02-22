package sorting.bubble;

import java.util.Arrays;
import functional.FloatCompFunc;
import utils.ArrayUtils;  // ✅ Import chính xác class ArrayUtils

public class Ex04BubbleSortFloat {

    public static void main(String[] args) {
        float[] elements = { 8.45f, 17.2f, 22.2f, 14.4f, 36.5f, 3.4f, 18.7f };

        bubbleSort(elements, (a, b) -> Float.compare(a, b));

        System.out.println("Mảng sau khi sắp xếp: " + Arrays.toString(elements));
    }

    private static void bubbleSort(float[] elements, FloatCompFunc isf) {
        for (int i = 0; i < elements.length; i++) {
            for (int j = 0; j < elements.length - i - 1; j++) {
                if (isf.compare(elements[j], elements[j + 1]) > 0) {
                    ArrayUtils.swap(elements, j, j + 1);  // ✅ Gọi đúng hàm swap từ ArrayUtils
                }
            }
        }
    }
}
