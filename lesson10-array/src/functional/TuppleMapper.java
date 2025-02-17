package functional;

import bean.Tuple;

@FunctionalInterface
public interface TuppleMapper {
	
	Integer apply(Tuple tuple);
	
}
