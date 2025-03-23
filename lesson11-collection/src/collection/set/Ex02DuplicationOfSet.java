package collection.set;

import bean.Item;
import utils.CollectionUtils;

import java.util.HashSet;
import java.util.Set;

public class Ex02DuplicationOfSet {
    public static void main(String[] args) {
        Set<Item> items = new HashSet<>();
        items.add(new Item(1,"A"));
        items.add(new Item(2,"B"));
        items.add(new Item(3,"C"));
        items.add(new Item(4,"D"));
        items.add(new Item(5,"E"));
        items.add(new Item(6,"F"));
        items.add(new Item(7,"G"));

        items.add(new Item(3,"C"));
        CollectionUtils.generate("1.Danh sach mat hang", items);

        Set<String>
    }
}
