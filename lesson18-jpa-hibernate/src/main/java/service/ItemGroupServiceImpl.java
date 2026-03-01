package service;

import java.util.List;
import java.util.Objects;

import dao.HibernateItemGroupDao;
import dao.ItemGroupDao;
import dto.ItemGroupDto;
import persistence.ItemGroup;

public class ItemGroupServiceImpl implements ItemGroupService {
	
	private ItemGroupDao itemGroupDao;
	
	public ItemGroupServiceImpl() {
		itemGroupDao = new HibernateItemGroupDao();
	}
	
	@Override
	public List<ItemGroup> getAll() {
		return itemGroupDao.getAll();
	}
	
	@Override
	public List<ItemGroupDto> getItemGroupDetails() {
		return itemGroupDao.getItemGroupDetails();
	}
	
	@Override
	public ItemGroup get(Integer id) {
		Objects.requireNonNull(id, "id should not be null.");
		return itemGroupDao.get(id);
	}
	
	@Override
	public ItemGroup get(String name) {
		Objects.requireNonNull(name, "name should not be null.");
		return itemGroupDao.get(name);
	}
	
	@Override
	public void save(ItemGroup group) {
		Objects.requireNonNull(group, "group should not be null.");
		itemGroupDao.save(group);
	}
	
	@Override
	public void testHibernateCache() {
		itemGroupDao.testHibernateCache();
	}
}
