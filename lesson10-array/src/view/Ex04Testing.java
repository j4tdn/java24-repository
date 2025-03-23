package view;

import functional.IntTest;

import java.util.Arrays;

public class Ex04Testing {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println(Arrays.toString(findElement(nums, number -> number % 2==0)));
        System.out.println(Arrays.toString(findElement(nums, number -> number % 5==0)));
        System.out.println(Arrays.toString(findElement(nums, number -> isPrime(number))));
    }

    private static int[] findElement(int[] nums, IntTest test) {
        int[] target = new int[nums.length];
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (test.test(nums[i])) {
                target[count++] = nums[i];
            }
        }
        return Arrays.copyOfRange(target, 0, count);
    }

    private static boolean isPrime(int number) {
        if(number < 2) return false;
        for(int i = 2; i <= Math.sqrt(number); i++) {
            if(number % i == 0) return false;
        }
        return true;
    }
}
