package service;

import bean.ItemGroup;

import java.util.List;

public interface ItemGroupService {
    List<ItemGroup> getAll();
    ItemGroup get(Integer id);
    void save(ItemGroup itemGroup);
    void update(ItemGroup itemGroup);
    void saveOrUpdate(ItemGroup itemGroup);
    void saveGroups(List<ItemGroup> itemGroup);
    ItemGroup getByName(String name);
}
