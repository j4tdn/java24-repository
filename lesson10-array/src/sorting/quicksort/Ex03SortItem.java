package sorting.quicksort;

import java.util.Arrays;

import bean.Item;
import model.DataModel;
import utils.ArrayUtils;

public class Ex03SortItem {
	
	public static void main(String[] args) {
		
		Item[] items = DataModel.mockItems();
		
		Arrays.sort(items, (a, b) -> {
			if (a == null) {
				return -1;
			}
			if (b == null) {
				return 1;
			}
			return Double.compare(a.getSalesPrices(), b.getSalesPrices());
		});
		
		ArrayUtils.generate("2. Mảng sắp xếp tăng dần theo id", items);
	}

}
