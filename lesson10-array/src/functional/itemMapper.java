package functional;
import bean.Item;
@FunctionalInterface
public interface itemMapper {
	
	Object apply(Item item);
}
