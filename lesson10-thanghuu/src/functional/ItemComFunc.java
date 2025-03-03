package functional;

import bean.Item;

@FunctionalInterface
public interface ItemComFunc {
	int compare(Item i1, Item i2);
}
