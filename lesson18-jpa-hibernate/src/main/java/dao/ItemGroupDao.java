package dao;

import persistence.ItemGroup;

import java.util.List;

public interface ItemGroupDao {
    List<ItemGroup> getAll();

    ItemGroup get(Integer id);

    ItemGroup get(String name);
}
