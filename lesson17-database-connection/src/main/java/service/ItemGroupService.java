package service;

import bean.Item;
import bean.ItemGroup;
import bean.ItemGroupAndItem;
import bean.ListGroups;

import java.util.List;

public interface ItemGroupService {
    List<ItemGroup> getAll();
    ItemGroup getByItemGroupId(Integer itemGroupId);
    ItemGroup getItemByName(String name);
    List<ItemGroupAndItem> getAllItemGroups();
    void save(ItemGroup itemGroup);
    void update(ItemGroup itemGroup);
    void saveOrUpdate(ItemGroup itemGroup);
    List<ListGroups> getAllListGroups();
    List<Item> getAllItems();
}
