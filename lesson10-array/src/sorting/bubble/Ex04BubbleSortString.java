package sorting.bubble;

import functional.StringCompFunc;

import java.util.Arrays;

public class Ex04BubbleSortString {
    public static void main(String[] args) {
        String[] strArr = {"A", "B", "C", null, "D", "E", "F", null};

        bubbleSort(strArr, (str1, str2) -> {
                    if (str1 == null) {
                        return -1;
                    }
                    if (str2 == null) {
                        return 1;
                    }
                    return str1.compareTo(str2);
                }
        );

        System.out.println(Arrays.toString(strArr));
    }

    private static void bubbleSort(String[] strArr, StringCompFunc comp) {
        for (int i = 0; i < strArr.length - 1; i++) {
            for (int j = 0; j < strArr.length - i - 1; j++) {
                if (comp.compare(strArr[j], strArr[j + 1]) > 0) {
                    String temp = strArr[j];
                    strArr[j] = strArr[j + 1];
                    strArr[j + 1] = temp;
                }
            }
        }
    }

}
