package sorting.bubble;

import bean.Item;
import functional.ItemCompFunc;
import model.DataModel;
import static utils.ArrayUtils.*;

public class Ex05BubbleSortItem {
	public static void main(String[] args) {
		Item[] items = DataModel.mockItems();
		generate("1. danh sach mat hang", items);
		
		bubbleSort(items, (i1, i2) -> {
			if(i1.getSalePrices() > i2.getSalePrices()) {
				return 1;
			}
			return -1;
		});
		generate("2. Sap xep theo gia ban(tang dan)", items);
		
		
		bubbleSort(items, (i1, i2) -> {
			
			return i2.getName().compareTo(i1.getName());
		});
		generate("3. Sap xep theo ten(giam dan)", items);
		
		
		bubbleSort(items, (i1, i2) -> {
			return i1.getExpriredDate().compareTo(i2.getExpriredDate());
		});
		generate("4. Sap xep theo ngay het hang(tang dan)", items);
		
		
		bubbleSort(items, (i1, i2) -> {
			if (i1.getStoreId() == i2.getStoreId()) {
				return i1.getId() - i2.getId();
			}
			return i1.getStoreId()-i2.getStoreId();
		});
		generate("5. Sap xep theo ma cua hang(tang dan), ma mat hang(tang dan)", items);
		
		
		bubbleSort(items, (i1, i2) -> {
			if (i2.getStoreId() == i1.getStoreId()) {
				return i1.getExpriredDate().compareTo(i2.getExpriredDate());
			}
			return i2.getStoreId() - i1.getStoreId();
		});
		generate("6. Sap xep theo ma cua hang(giam dan), ngay het han(tang dan)", items);
		
		
		bubbleSort(items, (i1, i2) -> {
			if (i2.getStoreId() != i1.getStoreId()) {
				return i2.getStoreId() - i1.getStoreId();
			}
			
			if (i1.getExpriredDate().compareTo(i2.getExpriredDate()) != 0){
				return i1.getExpriredDate().compareTo(i2.getExpriredDate());
			}
			return i2.getId() - (i1.getId());
		});
		generate("6. Sap xep theo ma cua hang(giam dan), ngay het han(tang dan), ma MH(giam dan)", items);
		
	}

	private static void bubbleSort(Item[] items, ItemCompFunc icf) {
		for (int i = 0; i < items.length; i++) {
			for (int j = 0; j < items.length - i - 1; j++) {
				if (icf.compare(items[j], items[j + 1]) > 0) {
					swap(items, j, j + 1);
				}
			}
		}

	}
}
