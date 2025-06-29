package calculation.context;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import bean.Item;
import bean.Store;

public class ClAllocationContext {
	
	private Integer planningAmount;
	private Integer requiredPlanningAmount;
	private Integer minPerStore;
	private Map<Item, List<Store>> refItemStores = new HashMap<>();
	private Map<Integer, Integer> refStores;
	private Map<Integer, BigDecimal> storeTrendFactors;
	private Map<Integer, BigDecimal> refItemWeights;
	private List<Integer> storeIds;
	private Map<Integer, Integer> storeWhIds;
	
	private ClAllocationContext() {
	}
	
	public static ClAllocationContext of() {
		return new ClAllocationContext();
	}

	public Integer getPlanningAmount() {
		return planningAmount;
	}

	public ClAllocationContext withPlanningAmount(Integer planningAmount) {
		this.planningAmount = planningAmount;
		return this;
	}

	public Integer getRequiredPlanningAmount() {
		return requiredPlanningAmount;
	}

	public ClAllocationContext withRequiredPlanningAmount(Integer requiredPlanningAmount) {
		this.requiredPlanningAmount = requiredPlanningAmount;
		return this;
	}
	
	public Integer getMinPerStore() {
		return minPerStore;
	}
	
	public ClAllocationContext withMinPerStore(Integer minPerStore) {
		this.minPerStore = minPerStore;
		return this;
	}

	public Map<Item, List<Store>> getRefItemStores() {
		return refItemStores;
	}

	public ClAllocationContext withRefItemStores(Map<Item, List<Store>> refItemStores) {
		this.refItemStores = refItemStores;
		return this;
	}
	
	public Map<Integer, Integer> getRefStores() {
		return refStores;
	}
	
	public ClAllocationContext withRefStores(Map<Integer, Integer> refStores) {
		this.refStores = refStores;
		return this;
	}

	public Map<Integer, BigDecimal> getStoreTrendFactors() {
		return storeTrendFactors;
	}

	public ClAllocationContext withStoreTrendFactors(Map<Integer, BigDecimal> storeTrendFactors) {
		this.storeTrendFactors = storeTrendFactors;
		return this;
	}

	public Map<Integer, BigDecimal> getRefItemWeights() {
		return refItemWeights;
	}

	public ClAllocationContext withRefItemWeights(Map<Integer, BigDecimal> refItemWeights) {
		this.refItemWeights = refItemWeights;
		return this;
	}

	public List<Integer> getStoreIds() {
		return storeIds;
	}

	public ClAllocationContext withStoreIds(List<Integer> storeIds) {
		this.storeIds = storeIds;
		return this;
	}
	
	public Map<Integer, Integer> getStoreWhIds() {
		return storeWhIds;
	}
	
	public ClAllocationContext withStoreWhIds(Map<Integer, Integer> storeWhIds) {
		this.storeWhIds = storeWhIds;
		return this;
	}
	
	
	
	
}
