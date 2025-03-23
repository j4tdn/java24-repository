package sorting.quicksort;

import java.util.Arrays;

import bean.Item;
import model.DataModel;
import utils.ArrayUtils;

public class Ex03SortItem {

	public static void main(String[] args) {

		// Arrays.sort(T[] a, Comparator<T> comparator)
		// Hỗ trợ sort theo nhiều chức năng khác nhau thông qua việc override comparator
		Item[] items = DataModel.mockItems();

		// Sắp xếp tăng dần theo ID
		Arrays.sort(items, (i1, i2) -> {
			return i1.getId().compareTo(i2.getId());
		});
		ArrayUtils.generate("1. Tăng dần theo id", items);

		// Sắp xếp giảm dần theo giá bán
		Arrays.sort(items, (i1, i2) -> {
			return Double.compare(i2.getSalesPrice(), i1.getSalesPrice());
		});
		ArrayUtils.generate("2. Giảm dần theo salesPrice", items);

		// Sắp xếp tăng dần theo ID cửa hàng, giảm dần theo ngày hết hạn
		Arrays.sort(items, (i1, i2) -> {
			int storeIdDiff = i1.getStoreId().compareTo(i2.getStoreId());

			if (storeIdDiff != 0) {
				return storeIdDiff;
			}

			return i2.getExpiredDate().compareTo(i1.getExpiredDate());
		});
		ArrayUtils.generate("3. Tăng dần theo storeId, giảm dần theo expiredDate", items);

	}
}