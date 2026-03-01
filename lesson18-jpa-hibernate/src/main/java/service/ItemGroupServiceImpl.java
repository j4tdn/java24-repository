package service;

import dao.HibernateItemGroupDao;
import dao.ItemGroupDao;
import persistence.ItemGroup;

import java.util.List;
import java.util.Objects;

public class ItemGroupServiceImpl implements ItemGroupService {
    private final ItemGroupDao itemGroupDao;

    public ItemGroupServiceImpl() {
        itemGroupDao = new HibernateItemGroupDao();
    }

    @Override
    public List<ItemGroup> getAll() {
        return itemGroupDao.getAll();
    }

    @Override
    public ItemGroup get(Integer id) {
        Objects.requireNonNull(id, "id should not be null");
        return itemGroupDao.get(id);
    }

    @Override
    public ItemGroup get(String name) {
        Objects.requireNonNull(name, "name should not be null");
        return itemGroupDao.get(name);
    }
}
