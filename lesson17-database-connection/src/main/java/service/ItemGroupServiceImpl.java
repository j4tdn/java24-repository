package service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import bean.ItemGroup;
import dao.ItemGroupDao;
import dao.JdbcItemGroupDao;

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
	public ItemGroup get(Integer id) {
		if (id == null) {
			return null;
		}
		return itemGroupDao.get(id);
	}
	
	@Override
	public void save(ItemGroup group) {
		Objects.requireNonNull(group, "group should not be null");
		itemGroupDao.save(group);
	}
	
	@Override
	public void saveGroups(List<ItemGroup> groups) {
		if (groups == null || groups.isEmpty()) {
			return ;
		}
		itemGroupDao.saveGroups(groups);
	}
	
	@Override
	public void update(ItemGroup group) {
		Objects.requireNonNull(group, "group should not be null");
		itemGroupDao.update(group);
	}
	
	@Override
	public void saveOrUpdate(ItemGroup group) {
		Objects.requireNonNull(group, "group should not be null");
		Optional.ofNullable(get(group.getId()))
			.ifPresentOrElse(id -> update(group), () -> save(group));
	}
}
