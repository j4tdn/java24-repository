package view;

import java.util.Arrays;

import bean.Item;

public class Ex03 {

	private static Item[] items;
	private static Item[] clone;

	public static void main(String[] args) {
		initialData();

		cloneItems();
		bubbleSort(clone, clone.length);

//		for (Item x : clone) {
//			System.out.print(x.getStoreId() + " ");
//		}
		// arr store stores no duplicate
		int[] stores = getStores(clone);
		
		Item[] storesHaveHighestSalesPrice = getStoreHaveHighestSalesPrice(clone, stores);
		for (Item i : storesHaveHighestSalesPrice) {
			System.out.println(i);
		}
	}

	private static void initialData() {
		items = new Item[] { new Item(1, "A", 25, 101), new Item(2, "B", 90, 102), new Item(3, "C", 88, 102),
				new Item(4, "D", 40, 101), new Item(5, "E", 60, 102), new Item(6, "F", 18, 101) };
	}

	private static void cloneItems() {
		clone = new Item[items.length];
		for (int i = 0; i < items.length; i++) {
			clone[i] = items[i];
		}
	}

	private static void bubbleSort(Item items[], int n) {
		Item temp;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (items[j].getStoreId() > items[j + 1].getStoreId()) {
					temp = items[j];
					items[j] = items[j + 1];
					items[j + 1] = temp;
				}
			}
		}
	}

	private static int[] getStores(Item[] clone) {
		int cnt = 0;
		int[] stores = new int[items.length];
		stores[cnt++] = items[0].getStoreId();
		for (int i = 1; i < clone.length; i++) {
			if (clone[i - 1].getStoreId() != clone[i].getStoreId()) {
				stores[cnt++] = clone[i].getStoreId();
			}
		}
		return Arrays.copyOfRange(stores, 0, cnt);
	}

	private static Item[] getStoreHaveHighestSalesPrice(Item[] clone, int[] stores) {
		Item[] itemsHighestPrice = new Item[items.length];
		int cnt = 0;
		for (Item item : clone) {
			int maxSP = getHighestSalesPrice(clone, item.getStoreId());
			for (int x : stores) {
				if (item.getStoreId() == x) {
					if (maxSP == item.getSalesPrice()) {
						itemsHighestPrice[cnt++] = item;
					}
				}
			}
		}
		return Arrays.copyOfRange(itemsHighestPrice, 0, cnt);
	}

	private static int getHighestSalesPrice(Item[] clone, int storeId) {
		int maxSP = Integer.MIN_VALUE;
		for (Item item : clone) {
			if (storeId == item.getStoreId()) {
				maxSP = Math.max(maxSP, item.getSalesPrice());
			}
		}
		return maxSP;

	}

}
