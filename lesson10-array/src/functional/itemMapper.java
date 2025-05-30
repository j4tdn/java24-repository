package functional;

import bean.Item;

@FunctionalInterface
public interface ItemMapper {
	
	Object apply(Item item);
	
}
