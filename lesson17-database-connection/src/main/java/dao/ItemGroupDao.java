package dao;

import bean.Item;
import bean.ItemGroup;
import bean.ItemGroupAndItem;
import bean.ListGroups;

import java.util.List;

public interface ItemGroupDao {
    List<ItemGroup> getAll();

    ItemGroup getById(Integer id);

    void save(ItemGroup itemGroup);

    void update(ItemGroup itemGroup);

    void saveGroups(List<ItemGroup> itemGroups);

    ItemGroup getByName(String name);

    List<ItemGroupAndItem> getAllItemGroups();

    List<ListGroups> getAllListGroups();

    List<Item> getTopItems();
}
