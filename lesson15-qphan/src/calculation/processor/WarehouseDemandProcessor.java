package calculation.processor;

import java.math.BigDecimal;
import java.util.Map;
import java.util.stream.Collectors;

import bean.StoreWhParam;


public class WarehouseDemandProcessor implements Processor<Map<Integer, BigDecimal>> {

	private Map<Integer, BigDecimal> storeDemands;
	private Map<Integer, Integer> storeWhIds;
	
	private WarehouseDemandProcessor() {
	}
	
	public static WarehouseDemandProcessor prepare() {
		return new WarehouseDemandProcessor();
	}
	
	public WarehouseDemandProcessor withStoreDemands(Map<Integer, BigDecimal> storeDemands) {
		this.storeDemands = storeDemands;
		return this;
	}
	
	public WarehouseDemandProcessor withStoreWhIds(Map<Integer, Integer> storeWhIds) {
		this.storeWhIds = storeWhIds;
		return this;
	}
	
	@Override
	public Map<Integer, BigDecimal> process() {
		return storeDemands.entrySet()
			.stream()
			.map(e -> new StoreWhParam(e.getKey(), storeWhIds.get(e.getKey()), e.getValue()))
			.collect(Collectors.groupingBy(
						StoreWhParam::getWhId, Collectors.reducing(BigDecimal.ZERO, StoreWhParam::getStoreDemand, BigDecimal::add)));
	}
	
}
