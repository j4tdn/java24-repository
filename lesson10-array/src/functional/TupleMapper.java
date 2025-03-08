package functional;
import bean.Tuple;

@FunctionalInterface
public interface TupleMapper {
	
	Object apply(Tuple tuple);
	
}