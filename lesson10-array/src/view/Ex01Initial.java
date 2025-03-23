package view;

import bean.Item;

import java.util.Arrays;

public class Ex01Initial {
    public static void main(String[] args) {

        int[] digits = new int[10];
        String[] sequences = {"hello", "welcome", "world", "goodbye"};
        double[] avgPoints = new double[]{2,7,4,6,8.9};

        Item[] items = new Item[4];

        System.out.println(Arrays.toString(digits));
        System.out.println(Arrays.toString(sequences));
        System.out.println(Arrays.toString(avgPoints));

    }
}
