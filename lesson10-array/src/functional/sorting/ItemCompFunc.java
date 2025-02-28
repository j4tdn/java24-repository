package functional.sorting;

import bean.Item;

@FunctionalInterface
public interface ItemCompFunc {
	
	int compare(Item a, Item b);
	
}
