package utils;

import java.util.Arrays;

import bean.Store;

public class StoreUtils {
	public static Store[] largestPriceEachStore(Store[] items) {
		Store[] result = new Store[items.length];
		int count = 0;

		for (Store item : items) {
			if (count >= 0) {
				if (isExistStore(result, item, count)) {
					continue;
				}
			}
			Store largestPrice = item;
			for (int i = 0; i < items.length; i++) {
				if (item.getStoreId() == items[i].getStoreId()) {
					if (largestPrice.getSalePrice() < items[i].getSalePrice()) {
						largestPrice = items[i];
					}
				}
			}
			result[count++] = largestPrice;
		}
		return Arrays.copyOfRange(result, 0, count);
	}

	private static boolean isExistStore(Store[] source, Store item, int count) {
		for (int i = 0; i < count; i++) {
			if (item.getStoreId() == source[i].getStoreId()) {
				return true;
			}
		}
		return false;
	}
}
