package ex02;

import java.util.Random;
import java.util.Scanner;

public class Devide5And7 {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Nhap n (5 <= n <= 100): ");
        int numberList = sc.nextInt();

        int[] divideBy7 = new int[numberList];
        int[] divideBy5 = new int[numberList];
        int[] others = new int[numberList];
        int count7 = 0, count5 = 0, countOthers = 0;

        System.out.print("Input: ");
        for (int i = 0; i < numberList; i++) {
            int number = randomInRange(0, 1000);
            System.out.print(number + (i < numberList - 1 ? ", " : ""));

            int[] indices = distributeNumber(number, divideBy7, divideBy5, others, count7, count5, countOthers);
            count7 = indices[0];
            count5 = indices[1];
            countOthers = indices[2];
        }

        System.out.println("\nOutput: " +
                formatArray(divideBy7, count7) + " | " +
                formatArray(others, countOthers) + " | " +
                formatArray(divideBy5, count5));

        sc.close();
    }

    private static int randomInRange(int min, int max) {
        Random rd = new Random();
        return rd.nextInt((max - min) + 1) + min;
    }

    private static int[] distributeNumber(int number, int[] divideBy7, int[] divideBy5, int[] others, int count7, int count5, int countOthers) {
        if (number % 7 == 0 && number % 5 != 0) {
            divideBy7[count7++] = number;
        } else if (number % 5 == 0 && number % 7 != 0) {
            divideBy5[count5++] = number;
        } else {
            others[countOthers++] = number;
        }
        return new int[] { count7, count5, countOthers };
    }

    private static String formatArray(int[] array, int size) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < size; i++) {
            result.append(array[i]);
            if (i < size - 1) {
                result.append(", ");
            }
        }
        return result.toString();
    }
}
