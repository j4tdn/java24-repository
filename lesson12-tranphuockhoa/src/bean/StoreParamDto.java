package bean;

import java.util.Map;
import java.util.Objects;
import java.util.function.BinaryOperator;

public class StoreParamDto<T extends Number> {
	
	private final Map<Long, T> storePrams;
	private T sum;
	
	public StoreParamDto(Map<Long, T> storePrams, T initial, BinaryOperator<T> operator) {
		this.storePrams = storePrams;
		this.sum = storePrams.values().stream().filter(Objects::nonNull).reduce(initial, operator);
	}
	
	public T getStoreParam(Long storeId) {
		return storePrams.get(storeId);
	}
	
	public Map<Long, T> getStorePrams() {
		return storePrams;
	}
	
	public T getSum() {
		return sum;
	}
	
}