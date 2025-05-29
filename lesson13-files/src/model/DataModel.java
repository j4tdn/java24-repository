package model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import bean.Item;

public class DataModel {
	private DataModel() {
	}
	
	public static List<Item> mockItems() {
		return List.of(
				new Item(1, "Item 1", LocalDate.of(2021, 8, 12), bd("220")),
				new Item(2, "Item 2", LocalDate.of(2021, 2, 14), bd("561")),
				new Item(3, "Item 3", LocalDate.of(2025, 7, 21), bd("123")),
				new Item(4, "Item 4", LocalDate.of(2023, 1, 24), bd("852")),
				new Item(5, "Item 5", LocalDate.of(2012, 5, 3), bd("965")),
				new Item(6, "Item 6", LocalDate.of(2023, 1, 1), bd("145"))
				);
	}
	
	public static BigDecimal bd(String value) {
		return new BigDecimal(value);
	}
	
}
