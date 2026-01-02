package service;

import bean.ItemGroup;
import dao.ItemGroupDao;
import dao.JdbcItemGroupDao;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class ItemGroupServiceImpl implements ItemGroupService {
    private ItemGroupDao itemGroupDao;
    public ItemGroupServiceImpl() {
        itemGroupDao = new JdbcItemGroupDao();
    }

    @Override
    public List<ItemGroup> getAll() {
        return itemGroupDao.getAll();
    }
    @Override
    public ItemGroup get(Integer id) {
        if (id == null) {
            return null;
        }
        return itemGroupDao.get(id);
    }
    @Override
    public void save(ItemGroup itemGroup) {
        Objects.requireNonNull(itemGroup, "Item group cannot be null");
        itemGroupDao.save(itemGroup);
    }
    @Override
    public void update(ItemGroup itemGroup) {
        Objects.requireNonNull(itemGroup, "Item group cannot be null");
        itemGroupDao.update(itemGroup);
    }

    @Override
    public void saveOrUpdate(ItemGroup itemGroup) {
        Objects.requireNonNull(itemGroup, "Item group cannot be null");
        Optional.ofNullable(itemGroup.getId()) // lấy ra coi có cái ID đó không, nếu có thì cập nhập, ko thì save
                .ifPresentOrElse(id -> update(itemGroup), () -> save(itemGroup));
            // ifPresentOrElse return Comsumer, comsumer truyền t trả về void
    }

    @Override
    public void saveGroups(List<ItemGroup> itemGroup) {
        if (itemGroup == null || itemGroup.isEmpty()) {
            return;
        }
        itemGroupDao.saveGroups(itemGroup);
    }
    public ItemGroup getByName(String name) {
        Objects.requireNonNull(name, "Name cannot be null");
        return itemGroupDao.getByName(name);
    }
}
