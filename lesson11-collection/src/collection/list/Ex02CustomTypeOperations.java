package collection.list;

import bean.Item;
import model.DataModel;

import static utils.NumberUtils.*;
import static utils.CollectionUtils.*;

import java.util.List;

public class Ex02CustomTypeOperations {
    public static void main(String[] args) {
        List<Item> items = DataModel.mockItems();
        generate("1. Danh sach mat hang", items);

        Item itemToBeDeleted = new Item(1, "Mat hang 22", bd("324"), 102);
        items.remove(itemToBeDeleted);
        generate("2. Danh sach mat hang", items);

        items.removeIf(item -> item.getStoreId() == 103);
        generate("3. Danh sach mat hang", items);

    }
}
