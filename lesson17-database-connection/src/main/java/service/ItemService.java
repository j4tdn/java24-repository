package service;

import java.util.List;

import bean.Item;

public interface ItemService {
	/**
	 * Get all available items
	 * 
	 * @return list of {@link Item}
	 */
	List<Item> getAll();
}
