package utils;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class CollectionUtils {
private CollectionUtils() {
	// TODO Auto-generated constructor stub
}

public static <E,K,V> Map<K, V> filterToMap (Collection<E> collection, Predicate<E> predicate ,Function<E, K> keyMapper, Function<E, V> valMapper){
	return collection.stream().filter(t -> predicate.test(t)).collect(Collectors.toMap(k -> keyMapper.apply(k), v -> valMapper.apply(v)));
}
public static <E,K,V> Map<K, V> filterToMap (Collection<E> collection,Function<E, K> keyMapper, Function<E, V> valMapper){
	return collection.stream().collect(Collectors.toMap(k -> keyMapper.apply(k), v -> valMapper.apply(v)));
}

public static <E> List<E> filterToList (Collection<E> collection, Predicate<E> predicate){
	return collection.stream().filter(t -> predicate.test(t)).toList();
}
public static <K,V> void logging (String prefix, Map<K, V> map){
	System.out.println(prefix + " {");
	map.forEach((k,v) -> System.out.println(k+ "\n"+ v));
	System.out.println("}\n");
}





}

