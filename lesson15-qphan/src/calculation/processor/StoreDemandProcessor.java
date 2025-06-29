package calculation.processor;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.stream.Collectors;

import bean.RefItemStoreId;


public class StoreDemandProcessor implements Processor<Map<Integer, BigDecimal>> {

	private Map<Integer, BigDecimal> storeTrendFactors;
	private Map<Integer, BigDecimal> refItemWeights;
	private Map<RefItemStoreId, BigDecimal> interpolatedStorePotentials;
	private List<Integer> storeIds;
	
	private StoreDemandProcessor() {
	}
	
	public static StoreDemandProcessor prepare() {
		return new StoreDemandProcessor();
	}
	
	public StoreDemandProcessor withStoreTrendFactors(Map<Integer, BigDecimal> storeTrendFactors) {
		this.storeTrendFactors = storeTrendFactors;
		return this;
	}
	
	 public StoreDemandProcessor withRefItemWeights(Map<Integer, BigDecimal> refItemWeights) {
		this.refItemWeights = refItemWeights;
		return this;
	}
	 
	 public StoreDemandProcessor withInterpolatedStorePotentials(Map<RefItemStoreId, BigDecimal> interpolatedStorePotentials) {
		this.interpolatedStorePotentials = interpolatedStorePotentials;
		return this;
	}
	 
	 public StoreDemandProcessor withStoreIds(List<Integer> storeIds) {
		this.storeIds = storeIds;
		return this;
	}
	
	// <refItemId, storeId>, storePotential
	// 55 1 22.2
	// 55 2 45
	// 77 1 42
	// 77 2 18
	
	// <storeId> List<refItem, storePotential>
	
	@Override
	public Map<Integer, BigDecimal> process() {
		Map<Integer, List<Entry<RefItemStoreId, BigDecimal>>> storeRefItemPotentialMap = interpolatedStorePotentials.entrySet()
			.stream()
			.collect(Collectors.groupingBy(e -> e.getKey().getStoreId()));
		
		Map<Integer, BigDecimal> storeDemands = new LinkedHashMap<>();
		storeIds.forEach(storeId -> {
			// duyệt từng store
			BigDecimal storeTrendFactor = Optional.ofNullable(storeTrendFactors.get(storeId)).orElse(BigDecimal.ONE);
			BigDecimal totalOfWeights = BigDecimal.ZERO;
			
			BigDecimal potentialWeight = BigDecimal.ZERO;
			List<Entry<RefItemStoreId, BigDecimal>> refItemStorePotentials = storeRefItemPotentialMap.get(storeId);
			for (var risp: refItemStorePotentials) {
				// duyệt từng refItem
				BigDecimal storePotential = risp.getValue();
				Integer refItemId = risp.getKey().getRefItemId();
				
				BigDecimal refItemWeight = refItemWeights.get(refItemId);
				totalOfWeights = totalOfWeights.add(refItemWeight);
				
				potentialWeight = potentialWeight.add(storePotential.multiply(refItemWeight));
			};
			
			storeDemands.put(storeId, potentialWeight.multiply(storeTrendFactor, MathContext.DECIMAL128).divide(totalOfWeights, 1, RoundingMode.HALF_UP));
		});
		
		return storeDemands;
	}
	
}
