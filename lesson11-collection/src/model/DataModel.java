package model;

import bean.Item;

import static utils.NumberUtils.*;
import java.util.ArrayList;
import java.util.List;

public class DataModel {
    private DataModel() {
    }

    public static List<Item> mockItems() {
        List<Item> items = new ArrayList<Item>();
        items.add(new Item(2, "Item A6", bd("789"), 101));
        items.add(new Item(1, "Item A1", bd("218"), 101));
        items.add(new Item(2, "Item A2", bd("641"), 102));
        items.add(new Item(2, "Item A3", bd("341"), 102));
        items.add(new Item(2, "Item A4", bd("854"), 103));
        items.add(new Item(2, "Item A5", bd("354"), 104));
        return items;
    }

}
