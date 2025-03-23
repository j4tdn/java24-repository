package view;

import bean.Item;
import functional.ObjectMapper;

import java.time.LocalDate;
import java.util.Arrays;

public class Ex06Mapping {
    public static void main(String[] args) {
        Item[] items = mockItems();
        System.out.println(Arrays.toString(mapping(items, Item::getName)));
        System.out.println(Arrays.toString(mapping(items, Item::getId)));
    }

    private static Object[] mapping(Item[] items, ObjectMapper objectMapper) {
        Object[] result = new Object[items.length];
        for (int i = 0; i < items.length; i++) {
            result[i] = objectMapper.apply(items[i]);
        }
        return result;
    }

    private static Item[] mockItems() {
        return new Item[] {
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
    }

}
