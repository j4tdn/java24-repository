package view;

import java.util.Arrays;

import bean.Item;

public class Ex03 {

	public static void main(String[] args) {
		
		
		Item[] items = {
		new Item(1, "A", 25, 101)
		,new Item(2, "B", 90, 102)
		, new Item(3, "C", 88, 102)
		, new Item(4, "D", 40, 101)
		, new Item(5, "E", 60, 102)
		, new Item(6, "F", 18, 101) };
		getMaxPrices(items, storeIds(items));		
		
	}
	private static void getMaxPrices (Item[] items, int[] storeIds) {
		for (int i =0 ; i<storeIds.length; i++) {
			int maxPrice = Integer.MIN_VALUE;
			for (Item item: items) {
				if (item.getStoreId() == storeIds[i]) {
					if (item.getSalePrices() > maxPrice) {
						maxPrice = item.getSalePrices();
					}
					
				}
			}
			System.out.println("Mặt hàng có giá bán cao nhất của cửa hàng "+storeIds[i]+" là: "+ maxPrice);
		}
	}
	private static int[] storeIds (Item[] items) {
		int[] storeIds = new int[items.length];
		int storeCount = 0;
		for (Item item : items) {
			if (!isExist(item, storeIds)) {
				storeIds[storeCount++] = item.getStoreId();
			}
		}
		return Arrays.copyOfRange(storeIds, 0, storeCount);
	}
	private static boolean isExist(Item item, int[] storeIds) {
		for (int i = 0 ; i < storeIds.length; i++) {
			if (item.getStoreId() == storeIds[i]) {
				return true;
			}
		}
		return false;
	}
	
}
