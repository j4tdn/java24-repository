package exercise;

import java.util.Arrays;

import bean.Item;

public class Ex03 {
	public static void main(String[] args) {
		Item[] items = mockItems();
		int[] storeIds = new int[items.length];
		for (int i = 0; i < items.length; i++) {
			storeIds[i] = items[i].getStoreId();
		}
		storeIds = removeDuplicates(storeIds);
		Arrays.sort(storeIds);
		for (int i = 0; i < storeIds.length; i++) {
			Item[] itemsInStore = findItemInSameStore(items, storeIds[i]);
			int max = Integer.MIN_VALUE;
			for (int j = 0; j < itemsInStore.length; j++) {
				int price = itemsInStore[j].getSalesPrice();
				if (price > max) {
					max = price;
				}
			}
			System.out.println("Item has the highest price in store " + storeIds[i] + ": " + max);
		}
	}
	
	public static Item[] mockItems() {
		return new Item[]{
				new Item(1, "A", 25, 101),
				new Item(2, "B", 35, 104),
				new Item(3, "C", 12, 102),
				new Item(4, "D", 64, 101),
				new Item(5, "E", 73, 104),
				new Item(6, "F", 34, 101),
				new Item(7, "G", 84, 104),
				new Item(8, "H", 94, 102),
				new Item(9, "I", 45, 103),
				new Item(10, "J", 95, 103),
				new Item(11, "K", 67, 102),
		};
	}
	
	public static Item[] findItemInSameStore(Item[] items, int storeId) {
		Item[] itemsInStore = new Item[items.length];
		int count = 0;
		for (Item item: items) {
			if (item.getStoreId() == storeId) {
				itemsInStore[count++] = item;
			}
		}
		return Arrays.copyOfRange(itemsInStore, 0, count);
	}
	
	public static int[] removeDuplicates(int[] arr) {
		int[] target = new int[arr.length];
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			boolean hasDuplicates = false;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					hasDuplicates = true;
					break;
				}
			}
			if (!hasDuplicates) {
				target[count++] = arr[i];
			}
		}
		return Arrays.copyOfRange(target, 0, count);
	}
}
