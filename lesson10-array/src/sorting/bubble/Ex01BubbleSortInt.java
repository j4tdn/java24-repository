package sorting.bubble;

import functional.IntCompFunc;

import java.util.Arrays;

public class Ex01BubbleSortInt {

    private static void bubbleSort(int[] arr, IntCompFunc intCompFunc) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (intCompFunc.condition(arr[j], arr[j+1])) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {3, 5, 21, 14, 10, 34, 10};

        bubbleSort(arr, (a, b) -> a < b);

        bubbleSort(arr, (a, b) -> a > b);

        System.out.println(Arrays.toString(arr));

    }
}
