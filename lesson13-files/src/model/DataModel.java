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
			new Item(1, "Item 1", LocalDate.of(2020, 10, 12), bd("220")),
			new Item(2, "Item 2", LocalDate.of(2021, 10, 13), bd("240")),
			new Item(3, "Item 3", LocalDate.of(2022, 10, 14), bd("250")),
			new Item(4, "Item 4", LocalDate.of(2023, 10, 15), bd("270")),
			new Item(5, "Item 5", LocalDate.of(2024, 10, 16), bd("280")),
			new Item(6, "Item 6", LocalDate.of(2025, 10, 17), bd("290"))
		);
	}
	
	public static BigDecimal bd(String value) {
		return new BigDecimal(value);
	}
}
 