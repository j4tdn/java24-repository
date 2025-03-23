package model;

import java.time.LocalDate;

import bean.Item;

public class DataModel {
	private DataModel() {
	}
	
	public static Item[] mockItems() {
		return new Item[] {
				new Item(1, "A1", 2d, 101, LocalDate.of(2025, 12, 20)),
				new Item(8, "A8", 32d, 102, LocalDate.of(2025, 12, 20)),
				new Item(2, "A2", 42d, 102, LocalDate.of(2025, 12, 20)),
				new Item(7, "A7", 82d, 101, LocalDate.of(2025, 12, 20)),
				new Item(3, "A3", 12d, 102, LocalDate.of(2025, 12, 20)),
				new Item(6, "A6", 322d, 101, LocalDate.of(2025, 12, 12)),
				new Item(4, "A4", 221d, 102, LocalDate.of(2020, 9, 20)),
				new Item(10, "A10", 1d, 101, LocalDate.of(2020, 06, 30)),
				new Item(9, "A9", 5d, 102, LocalDate.of(2024, 3, 11))
		};
	}
	
}
