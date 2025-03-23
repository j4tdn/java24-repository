package sorting.bubble;

import bean.Item;
import functional.ItemCompFunc;

import java.time.LocalDate;
import java.util.Arrays;

public class Ex05BubbleSortItem {
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
                new Item(10, "J", 40.0, 105, LocalDate.of(2005, 11,12)),
        };

        bubbleSort(items, ((i1, i2) -> {
            if(i1.getStoreId() == i2.getStoreId()) {
                return i1.getId() - (i2.getId());
            }
            return i1.getStoreId() - i2.getStoreId();
        }));

        System.out.println(Arrays.toString(items));
    }

    private static void bubbleSort(Item[] items, ItemCompFunc itemComp) {
        for (int i = 0; i < items.length - 1; i++) {
            for (int j = 0; j < items.length - i - 1; j++) {
                if(itemComp.compare(items[j], items[j+1]) > 0) {
                    Item temp = items[j];
                    items[j] = items[j + 1];
                    items[j + 1] = temp;
                }
            }
        }
    }

}
