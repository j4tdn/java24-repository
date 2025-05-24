package model;

import bean.Item;

import java.time.LocalDate;
import java.util.List;

public class DataModel {
    private DataModel(){

    }

    public static List<Item> mockItems(){
        return List.of(
                new Item(1, "Item1", LocalDate.of(2025, 2, 27), 170d),
                new Item(2, "Item2", LocalDate.of(2025, 3, 26), 234d),
                new Item(3, "Item3", LocalDate.of(2025, 4, 25), 346d),
                new Item(4, "Item4", LocalDate.of(2025, 5, 24), 2345d),
                new Item(5, "Item5", LocalDate.of(2025, 6, 23), 4756d)
        );
    }

}
