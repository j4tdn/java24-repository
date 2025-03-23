package sorting.bubble;

import functional.FloatCompFunc;

import java.util.Arrays;

public class Ex02BubbleSortFloat {

    private static void bubbleSort(Float[] arr, FloatCompFunc comp) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (comp.compare(arr[j], arr[j + 1]) > 0) {
                    float temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Float[] arr = {3.2f, 5.5f, 21.6f, 14.1f, 10.0f, 34.7f, 10.9f};
        bubbleSort(arr, Float::compare);
        System.out.println(Arrays.toString(arr));
    }
}
