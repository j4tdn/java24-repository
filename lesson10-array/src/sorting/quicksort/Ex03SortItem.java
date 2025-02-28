package sorting.quicksort;

import java.util.Arrays;

import bean.Item;
import model.DataModel;
import utils.ArrayUtils;

public class Ex03SortItem {

	public static void main(String[] args) {

		Item[] items = DataModel.mockItems();

		// sort item, asc id
		Arrays.sort(items, (i1, i2) -> {
			return i1.getId().compareTo(i2.getId());
		});
		ArrayUtils.generate("1. Tăng dần theo id", items);

		// salePrice desc
		Arrays.sort(items, (i1, i2) -> {
			return i1.getSalesPrice().compareTo(i2.getSalesPrice());
		});
		ArrayUtils.generate("2. Giảm dần theo salesPrice", items);

		// salePrice desc
		Arrays.sort(items, (i1, i2) -> {
			int storeIdDiff = i1.getStoreId().compareTo(i2.getStoreId());
			if (storeIdDiff != 0) {
				return storeIdDiff;
			}
			return i2.getExpiredDate().compareTo(i1.getExpiredDate());
		});
		ArrayUtils.generate("3. Tăng dần theo storeId. giảm dần theo expiredDate", items);
	}

}
