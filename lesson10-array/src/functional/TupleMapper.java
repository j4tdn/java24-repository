package functional;

import bean.*;

@FunctionalInterface
public interface TupleMapper {
 Object apply(Tuple tuple);
}
