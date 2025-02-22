package functional;

import bean.Item;

@FunctionalInterface
public interface ObjectMapper {
	Object apply(Item item);
}
