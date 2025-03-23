package functional.sorting;

import bean.Item;

@FunctionalInterface
public interface ItemCompFunc {
	
	int compare(Item s1, Item s2);
	
}