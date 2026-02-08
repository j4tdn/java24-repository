package service;

import java.util.List;

import dto.ItemGroupDto;
import persistence.ItemGroup;

public interface ItemGroupService {
	
	/**
	 * Get all available item groups
	 * 
	 * @return list of {@link ItemGroup}
	 */
	List<ItemGroup> getAll();
	
	/**
	 * Get all available item groups together with item's info
	 * 
	 * @return list of {@link ItemGroupDto}
	 */
	List<ItemGroupDto> getItemGroupDetails();
	
	/**
	 * Get item group with the given id
	 * 
	 * @return found {@link ItemGroup} or null if not found
	 */
	ItemGroup get(Integer id);
	
	/**
	 * Get item group with the given name
	 * 
	 * @return found {@link ItemGroup} or null if not found
	 */
	ItemGroup get(String name);
	
	/**
	 * Save new item group
	 * 
	 * @param group the group
	 */
	void save(ItemGroup group);
	
	/**
	 * Test 1st, 2nd level cache of Hibernate
	 */
	void testHibernateCache();
	
}
