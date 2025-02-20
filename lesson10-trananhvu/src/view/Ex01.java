package view;

import utils.ArrayUtils;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int n;
        System.out.print("Nhap n : ");
        n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = rand.nextInt(10, 51);
        }

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(handleCoincidence(arr)));
        compareMeanValue(arr);
        System.out.println(thirdLargest(arr));
    }

    private static int[] handleCoincidence(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    arr = ArrayUtils.remove(arr, j);
                    arr = ArrayUtils.remove(arr, i);
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
            System.out.println(arr.length / 2 + " phan tu dau tien lon hon " + (arr.length + 1) / 2 + " phan tu cuoi cung");
        else System.out.println(arr.length / 2 + " phan tu dau tien be hon " + (arr.length) / 2 + " phan tu cuoi cung");
    }

    private static int thirdLargest(int[] arr) {
        arr = ArrayUtils.cleanArray(arr);
        int[] newArr = ArrayUtils.customSort(arr, 3);
        System.out.println(Arrays.toString(newArr));
        return newArr[2];
    }

}
