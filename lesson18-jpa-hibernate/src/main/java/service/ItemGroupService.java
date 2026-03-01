package service;

import persistence.ItemGroup;

import java.util.List;

public interface ItemGroupService {
    List<ItemGroup> getAll();

    ItemGroup get(Integer id);

    ItemGroup get(String name);
}
