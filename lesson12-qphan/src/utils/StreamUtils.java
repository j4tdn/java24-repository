package utils;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class StreamUtils {

	private StreamUtils() {
	}

	public static <E> List<E> filterToList(Collection<E> collection, Predicate<E> predicate) {
		return collection.stream().filter(e -> predicate.test(e)).collect(Collectors.toList());
	}

	public static <E, K, V> Map<K, V> filterToMap(Collection<E> collection, Predicate<E> predicate,
			Function<E, K> keyMapper, Function<E, V> valueMapper) {
		return collection.stream().filter(e -> predicate.test(e))
				.collect(Collectors.toMap(e -> keyMapper.apply(e), e -> valueMapper.apply(e)));
	}

	public static BigDecimal sumOfBigDecimal(Collection<BigDecimal> collection) {
		return collection.stream().reduce(BigDecimal.ZERO, BigDecimal::add);
	}
	
	public static Integer sumOfInteger(Collection<Integer> collection) {
		return collection.stream().reduce(0, Integer::sum);
	}
	
	public static <E, K, V> Map<K, V> toMap(Collection<E> collection, Function<E, K> keyMapper, Function<E, V> valueMapper) {
		return collection.stream().collect(Collectors.toMap(e -> keyMapper.apply(e), e -> valueMapper.apply(e)));
	}

	public static <E, K, V, M extends Map<K, V>> Map<K, V> toMap(Collection<E> collection, Function<E, K> keyMapper,
			Function<E, V> valueMapper, Supplier<M> mapSupplier) {
		return collection.stream().collect(
				Collectors.toMap(e -> keyMapper.apply(e), e -> valueMapper.apply(e), (v1, v2) -> v2, mapSupplier));
	}

}
