package sorting.quickdsort;

import bean.Item;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;

public class Ex02QuicksortItem {
    public static void main(String[] args) {
        Item[] items = new Item[]{
                new Item(1, "A", 25.0, 101, LocalDate.of(2003, 2,27)),
                new Item(2, "B", 90.0, 102, LocalDate.of(2003, 3,27)),
                new Item(3, "C", 88.0, 102, LocalDate.of(2006, 1,15)),
                new Item(4, "D", 40.0, 101, LocalDate.of(2004, 5,29)),
                new Item(5, "E", 60.0, 102, LocalDate.of(2009, 3,28)),
                new Item(6, "F", 18.0, 101, LocalDate.of(2007, 7,26)),
                new Item(7, "G", 100.0, 103, LocalDate.of(2001, 5,21)),
                new Item(8, "H", 200.0, 103, LocalDate.of(2000, 8,22)),
                new Item(9, "I", 70.0, 104, LocalDate.of(2006, 9,23)),
        };

        Arrays.sort(items, Comparator.comparingInt(Item::getId));
        System.out.println(Arrays.toString(items));

        Arrays.sort(items, Comparator.comparingDouble(Item::getSalesPrice));
        System.out.println(Arrays.toString(items));

        Arrays.sort(items, Comparator.comparingInt(Item::getStoreId));
        System.out.println(Arrays.toString(items));

        Arrays.sort(items, Comparator.comparing(Item::getExpiryDate));
        System.out.println(Arrays.toString(items));

    }
}
