package dao;

import java.util.List;

import bean.ItemGroup;

public interface ItemGroupDao {

	/**
	 * Get all available item groups
	 * 
	 * @return list of {@link ItemGroup}
	 */
	List<ItemGroup> getAll();

	/**
	 * Get item group with the given id
	 * 
	 * @return found {@link ItemGroup} or null if not found
	 */
	ItemGroup get(int id);

	/**
	 * Insert a new item group
	 * 
	 * @param group the given group
	 */
	void save(ItemGroup group);
	
	/**
	 * Insert new item groups
	 * 
	 * @param groups the given groups
	 */
	void saveGroups(List<ItemGroup> groups);
	
	/**
	 * Update an existing item group
	 * 
	 * @param group then given group
	 */
	void update(ItemGroup group);
	
}
