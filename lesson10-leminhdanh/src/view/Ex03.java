package view;


import bean.Store;
import utils.StoreUtils;

public class Ex03 {
	public static void main(String[] args) {
		Store[] items = mockItem();
		System.out.println("giá bán cao nhất của từng cửa hàng là ");
		for (Store item : StoreUtils.largestPriceEachStore(items)) {
			System.out.println(item);
		}
		
	}

	private static Store[] mockItem() {
		return new Store[] {
				new Store(1, "A", 25, 101),
		        new Store(2, "B", 90, 102),
		        new Store(3, "C", 88, 102),
		        new Store(4, "D", 40, 101),
		        new Store(5, "E", 60, 102),
		        new Store(6, "F", 18, 101)
		};
	}
}
