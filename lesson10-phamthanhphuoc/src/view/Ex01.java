package view;

import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class Ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int n;
        System.out.print("Nhập số lượng phần tử :  ");
        n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = rand.nextInt(10, 51);
        }

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(handleCoincidence(arr)));
        compareMeanValue(arr);
        System.out.println("Số Lớn thứ 3 trong mảng = " +  thirdLargest(arr));
    }

    private static int[] handleCoincidence(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    arr = remove(arr, j);
                    arr = remove(arr, i);
                }
            }
        }
        return arr;
    }

    private static void compareMeanValue(int[] arr) {
        int s1 = 0, s2 = 0;

        for (int i = 0; i < arr.length / 2; i++) {
            s1 += arr[i];
        }

        for (int i = (arr.length + 1) / 2; i < arr.length; i++) {
            s2 += arr[i];
        }

        if (s1 > s2)
            System.out.println("Giá Trị trung bình của " + arr.length / 2 + " Phần tử đầu tiên lớn hơn " + (arr.length + 1) / 2 + " Phần tử cuối cùng");
        else System.out.println("Giá Trị trung bình của " + arr.length / 2 + " phần tử đầu tiên bé hơn " + (arr.length) / 2 + " phần tử cuối cùng");
    }

    private static int thirdLargest(int[] arr) {
        arr = cleanArray(arr);
        int[] newArr = customSort(arr, 3);
        System.out.println(Arrays.toString(newArr));
        return newArr[2];
    }

    private static int[] remove(int[] source, int position) {
        for (int i = position; i < source.length - 1; i++) {
            source[i] = source[i + 1];
        }
        return Arrays.copyOf(source, source.length - 1);
    }

    private static int[] customSort(int[] source, int k) {
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

    private static int[] cleanArray(int[] source) {
        for (int i = 0; i < source.length - 1; i++) {
            for (int j = source.length - 1; j > i; j--) {
                if (source[i] == source[j]) {
                    source = remove(source, j);
                }
            }
        }
        return source;
    }
}

