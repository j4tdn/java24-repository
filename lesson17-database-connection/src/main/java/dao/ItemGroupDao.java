package dao;

import bean.ItemGroup;

import java.util.List;

public interface ItemGroupDao {
    /**
     * Get all available item groups
     *
     * @return list of {@link ItemGroup}
     */
    List<ItemGroup> getAll();
    /**
     * Get available item groups
     *
     * @return {@link ItemGroup}
     */
    ItemGroup get(int id);
    /**
     * insert a new item groups
     *
     * @param group then given group
     */
    void save(ItemGroup itemGroup);
    /**
     * Update an existing item groups
     *
     * @param group the given group
     */
    void update(ItemGroup itemGroup);

    /**
     * insert new item groups
     *
     * @param groups the given groups
     */
    void saveGroups(List<ItemGroup> itemGroup);

    ItemGroup getByName(String name);

}
