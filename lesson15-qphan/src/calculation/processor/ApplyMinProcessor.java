package calculation.processor;

import static utils.NumberUtils.bd;

import java.math.BigDecimal;
import java.math.MathContext;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;


public class ApplyMinProcessor implements Processor<Map<Integer, BigDecimal>> {

	private Map<Integer, BigDecimal> whAllocatedAmounts;
	private Integer minPerStore;
	private Map<Integer, Integer> storeWhIds;
	
	private ApplyMinProcessor() {
	}
	
	public static ApplyMinProcessor prepare() {
		return new ApplyMinProcessor();
	}
	
	public ApplyMinProcessor withWhAllocatedAmounts(Map<Integer, BigDecimal> whAllocatedAmounts) {
		this.whAllocatedAmounts = whAllocatedAmounts;
		return this;
	}
	
	public ApplyMinProcessor withMinPerStore(Integer minPerStore) {
		this.minPerStore = minPerStore;
		return this;
	}
	
	public ApplyMinProcessor withStoreWhIds(Map<Integer, Integer> storeWhIds) {
		this.storeWhIds = storeWhIds;
		return this;
	}
	
	@Override
	public Map<Integer, BigDecimal> process() {
		final var whStoreAmounts = storeWhIds.entrySet().stream()
				.collect(Collectors.groupingBy(Entry::getValue, Collectors.counting()));
		
		return whAllocatedAmounts.entrySet().stream()
				.collect(Collectors.toMap(Entry::getKey, e -> {
					final var amountOfStore = bd(whStoreAmounts.get(e.getKey()));
					final var minPerStoreAsBd = bd(minPerStore);
					final var minPerWh = amountOfStore.multiply(minPerStoreAsBd, MathContext.DECIMAL128);
					return e.getValue().compareTo(minPerWh) > 0 ? e.getValue() : minPerWh;
				}));
	}
	
}
