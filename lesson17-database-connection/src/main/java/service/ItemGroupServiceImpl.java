package service;

import bean.Item;
import bean.ItemGroup;
import bean.ItemGroupAndItem;
import bean.ListGroups;
import dao.ItemGroupDao;
import dao.JdbcItemGroupDao;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class ItemGroupServiceImpl implements ItemGroupService {
    private final ItemGroupDao itemGroupDao;

    public ItemGroupServiceImpl() {
        itemGroupDao = new JdbcItemGroupDao();
    }

    @Override
    public List<ItemGroup> getAll() {
        return itemGroupDao.getAll();
    }

    @Override
    public ItemGroup getByItemGroupId(Integer itemGroupId) {
        return itemGroupDao.getById(itemGroupId);
    }

    @Override
    public ItemGroup getItemByName(String name) {
        return itemGroupDao.getByName(name);
    }

    @Override
    public List<ItemGroupAndItem> getAllItemGroups() {
        return itemGroupDao.getAllItemGroups();
    }

    @Override
    public List<ListGroups> getAllListGroups() {
        return itemGroupDao.getAllListGroups();
    }

    @Override
    public List<Item> getAllItems() {
        return itemGroupDao.getTopItems();
    }


    @Override
    public void save(ItemGroup itemGroup) {
        Objects.requireNonNull(itemGroup);
        itemGroupDao.save(itemGroup);
    }

    @Override
    public void update(ItemGroup itemGroup) {
        Objects.requireNonNull(itemGroup);
        itemGroupDao.update(itemGroup);
    }

    @Override
    public void saveOrUpdate(ItemGroup itemGroup) {
        Optional.ofNullable(itemGroup.getId())
                .ifPresentOrElse(id -> update(itemGroup), () -> save(itemGroup));

    }
}
