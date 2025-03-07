package model;

import java.time.LocalDate;

import bean.Item;

public class DataModel {

	private DataModel() {
		
	}
	public static Item[] mockItems() {
		return new Item[] {
				new Item(1, "A1", 22d, 101, LocalDate.of(2025, 8, 10)),
				new Item(8, "A8", 120d, 101, LocalDate.of(2025, 6, 20)),
				new Item(2, "A2", 18d, 102, LocalDate.of(2025, 2, 8)),
				new Item(11, "A11", 180d, 102, LocalDate.of(2021, 5, 24)),
				new Item(7, "A7", 88d, 102, LocalDate.of(2021, 5, 24)),
				new Item(3, "A3", 120d, 102, LocalDate.of(2025, 12, 19)),
				new Item(6, "A6", 22d, 201, LocalDate.of(2025, 8, 20)),
				new Item(4, "A4", 120d, 201, LocalDate.of(2025, 11, 22)),
				new Item(10, "A10", 22d, 201, LocalDate.of(2025, 10, 30)),
				new Item(5, "A5", 66d, 101, LocalDate.of(2025, 12, 20)),
				new Item(9, "A9", 180d, 202, LocalDate.of(2025, 10, 20)),
		};
	}
}
