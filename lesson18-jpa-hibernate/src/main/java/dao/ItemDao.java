package dao;

import java.util.List;

import persistence.Item;

public interface ItemDao {
	
	/**
	 * Get all available items
	 * 
	 * @return list of {@link Item}
	 */
	List<Item> getAll();
	
}
