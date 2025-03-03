package view;

import static utils.ArrayUtils.*;

import java.util.Arrays;

import bean.Item;
import functional.ItemComFunc;

public class Ex03 {

	public static void main(String[] args) {
		
		Item[] items = mockItem();
		generate("Danh sach mat hang:", items);
		
		bubbleSort(items, (a, b) -> {
			int storeIdDif = a.getStoreId().compareTo(b.getStoreId());
			if(storeIdDif != 0) {
				return storeIdDif;
			}
			
			return Double.compare(b.getSalesPrice(), a.getSalesPrice());
		});
		
		generate("Danh sach mat hang da duoc sap xep:", items);
		
		for (int idStore: filterIdStore(items)) {
			System.out.println("Mat hang co gia cao nhat cua cua hang " + idStore + " la:");
			 System.out.println(getItemOfStoreByPrice(items, idStore)+"\n");
		}
		
	}
	
	private static Item getItemOfStoreByPrice(Item[] items, int idStore) {
		Item[] res = new Item[items.length];
		int count = 0;
		
		for (Item item: items) {
			if (item.getStoreId() == idStore) {
				res[count++] = item;
			}
		}
		
		res = Arrays.copyOf(res, count);
		
		return getHighestPrice(res);
	}
	
	
	
	private static int[] filterIdStore(Item[] arr) {
		int[] idStore = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			idStore[i] = arr[i].getStoreId();
		}
		
		idStore = clearId(idStore);
		
		return idStore; 
	}
	
	
	private static void bubbleSort(Item[] items, ItemComFunc icf) {
		for (int i = 0; i < items.length; i++) {
			for (int j = 0; j < items.length - i - 1; j++) {
				if (icf.compare(items[j], items[j + 1]) > 0) {
					swap(items, j, j + 1);
				}
			}
		}
	}
	
	private static Item[] mockItem() {
		return new Item[] {
				new Item(1, "A", 25, 101),
	            new Item(2, "B", 90, 102),
	            new Item(3, "C", 88, 102),
	            new Item(4, "D", 40, 101),
	            new Item(5, "E", 60, 102),
	            new Item(6, "F", 18, 101),
	            new Item(7, "G", 100, 103),
	            new Item(8, "H", 200, 103),
	            new Item(9, "I", 70, 104),
	            new Item(10, "J", 40, 105)
		};
	}
	
}
