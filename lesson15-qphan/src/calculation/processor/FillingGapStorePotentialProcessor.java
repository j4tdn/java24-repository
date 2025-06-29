package calculation.processor;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import bean.Item;
import bean.RefItemStoreId;
import bean.Store;
import utils.LogUtils;

import static utils.NumberUtils.*;


public class FillingGapStorePotentialProcessor implements Processor<Map<RefItemStoreId, BigDecimal>> {

	private Map<Item, List<Store>> refItemStores;
	private Map<Integer, Integer> refStores;
	
	private FillingGapStorePotentialProcessor() {
	}
	
	public static FillingGapStorePotentialProcessor prepare() {
		return new FillingGapStorePotentialProcessor();
	}
	
	public FillingGapStorePotentialProcessor withRefItemStores(Map<Item, List<Store>> refItemStores) {
		this.refItemStores = refItemStores;
		return this;
	}
	
	public FillingGapStorePotentialProcessor withRefStores(Map<Integer, Integer> refStores) {
		this.refStores = refStores;
		return this;
	}
	
	@Override
	public Map<RefItemStoreId, BigDecimal> process() {
		final Map<RefItemStoreId, BigDecimal> storePotentials = new LinkedHashMap<>();
		
		refItemStores.forEach((refItem, stores) -> {
			BigDecimal interpolatedStorePotential = null;
			
			Map<Integer, BigDecimal> ownStorePotentialMap = stores.stream()
				.filter(store -> isNonNullAndZero(store.getPotential()))
				.collect(Collectors.toMap(Store::getId, Store::getPotential));
			
			BigDecimal average = ownStorePotentialMap.values()
					.stream()
					.reduce(BigDecimal.ZERO, BigDecimal::add)
					.divide(bd(ownStorePotentialMap.size()), 1, RoundingMode.HALF_UP);
			
			for (Store store: stores) {
				Integer storeId = store.getId();
				BigDecimal storePotential = store.getPotential();
				if (isNonNullAndZero(storePotential)) {
					interpolatedStorePotential = storePotential;
				} else {
					Integer refStoreId = refStores.get(storeId);
					if (refStoreId == null) {
						interpolatedStorePotential = average;
						LogUtils.log(">> Filling gap store " + storeId + " by AVG value " + average);
					} else {
						BigDecimal refStorePotential = ownStorePotentialMap.get(refStoreId);
						if (isNonNullAndZero(refStorePotential)) {
							interpolatedStorePotential = refStorePotential;
							LogUtils.log(">> Filling gap store " + storeId + " by ref storeId " + refStoreId + " has potential = " + refStorePotential);
						} else {
							interpolatedStorePotential = average;
							LogUtils.log(">> Filling gap store " + storeId + " by AVG value " + average);
						}
					}
				}
				storePotentials.put(new RefItemStoreId(refItem.getId(), storeId), interpolatedStorePotential.setScale(1,  RoundingMode.HALF_UP));
			}
		});
		
		return storePotentials;
	}
	
}
