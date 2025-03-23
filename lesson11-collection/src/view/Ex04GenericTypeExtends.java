package view;

import model.DataModel;

import java.util.Arrays;
import java.util.Comparator;

public class Ex04GenericTypeExtends {
    public static void main(String[] args) {
        Object[] items = DataModel.mockItems().toArray();
        String[] words = {"a", "b", "c"};


    }

    private static <T extends Comparable<T>> void sort(T[] items) {
        Arrays.sort(items);
    }

}
