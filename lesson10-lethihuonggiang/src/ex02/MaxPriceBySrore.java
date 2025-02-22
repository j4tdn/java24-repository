package ex02;

import java.util.Arrays;

public class MaxPriceBySrore {
	
	public static void main(String[] args) {
		Product[] items = {
				new Product(1, "A",25, 101),
				new Product(2, "B",90, 102),
				new Product(3, "C",88, 102),
				new Product(4, "D",40, 101),
				new Product(5, "E",60, 102),
				new Product(6, "F",18, 101),
		};
		int[] storeIds = getUniqueStores(items);
		int storeCount = storeIds.length;
		
		for(int i = 0; i < storeCount; i++) {
			Product maxItem = findMaxPriceItem(items, storeIds[i]);
			printResult(storeIds[i], maxItem);
		}
	}
	public static int[] getUniqueStores(Product[] items) {
	    int[] storeIds = new int[items.length];
	    int storeCount = 0;

	    for (int i = 0; i < items.length; i++) {
	        int currentStoreId = items[i].getStoreId();
	        boolean found = false;

	        for (int j = 0; j < storeCount; j++) {
	            if (storeIds[j] == currentStoreId) {
	                found = true; 
	                break; 
	            }
	        }

	        if (!found) {
	            storeIds[storeCount] = currentStoreId;
	            storeCount++;
	        }
	    }
	    return Arrays.copyOf(storeIds, storeCount);
	}
	
	public static Product findMaxPriceItem(Product[] items, int storeId) {
		Product maxItem = null;
		for (Product item : items) {
			if(item.getStoreId()== storeId) {
				if (maxItem == null || item.getSalesPrice()> maxItem.getSalesPrice()) {
					maxItem = item;
				}
			}
		}
		return maxItem;
	}
	 public static void printResult(int storeId, Product maxItem) {
		 if(maxItem != null) {
			 System.out.println(
					 "StoreId=" + storeId
					 + "-> ItemID=" + maxItem.getItemId()
					 + ", Name=" + maxItem.getName()
					 + ", SalePrice=" + maxItem.getSalesPrice()
					 );
		 }
	 }
}
