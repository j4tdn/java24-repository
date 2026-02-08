package service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

import bean.Item;
import bean.ItemGroup;
import bean.ItemGroupDto;
import dao.ItemDao;
import dao.ItemGroupDao;
import dao.JdbcItemDao;
import dao.JdbcItemGroupDao;

public class ItemGroupServiceImpl implements ItemGroupService {

	private final ItemGroupDao itemGroupDao;
	private final ItemDao itemDao;

	public ItemGroupServiceImpl() {
		itemGroupDao = new JdbcItemGroupDao();
		itemDao = new JdbcItemDao();
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
	public List<ItemGroup> getItemGroups() {
		List<Item> items = itemDao.getAll();

		return items.stream().collect(Collectors.groupingBy(Item::getGroup)).entrySet().stream().map(e -> {
			ItemGroup group = e.getKey();
			group.setItems(e.getValue());
			return group;
		}).toList();

	}

	@Override
	public ItemGroup get(Integer id) {
		if (id == null) {
			return null;
		}
		return itemGroupDao.get(id);
	}

	@Override
	public ItemGroup get(String name) {
		if (name == null) {
			return null;
		}
		return itemGroupDao.get(name);
	}

	@Override
	public void save(ItemGroup group) {
		Objects.requireNonNull(group, "group should not be null");
		itemGroupDao.save(group);
	}

	@Override
	public void saveGroups(List<ItemGroup> groups) {
		if (groups == null || groups.isEmpty()) {
			return;
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
		Optional.ofNullable(get(group.getId())).ifPresentOrElse(id -> update(group), () -> save(group));
	}
}
