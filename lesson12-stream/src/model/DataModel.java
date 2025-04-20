package model;

import java.util.List;

import bean.Apple;
import bean.Dish;
import common.Kind;

public class DataModel {
	
	private DataModel() {
		
	}

	public static List<Dish> getDishes() {
		return List.of(
			new Dish("1", "D1", 234d, Kind.FISH),
			new Dish("2", "D2", 254d, Kind.MEAT),
			new Dish("3", "D3", 274d, Kind.EGG),
			new Dish("4", "D4", 224d, Kind.FISH),
			new Dish("5", "D5", 24d, Kind.VEGGIE),
			new Dish("6", "D6", 430d, Kind.FISH),
			new Dish("7", "D7", 123d, Kind.EGG),
			new Dish("8", "D8", 111d, Kind.VEGGIE)
		);
	}
	
	public static List<Apple> getApples() {
		return List.of(
				new Apple(1, "green", 200, "Vietnam"),	
				new Apple(16, "green", 300, "Vietnam"),	
				new Apple(22, "red", 300, "Lao"),	
				new Apple(4, "yellow", 400, "Thailand"),	
				new Apple(17, "red", 600, "Vietnam"),	
				new Apple(6, "green", 100, "Thailand"),
				new Apple(23, "blue", 100, "Vietnam")
				
		);
	}
	
	public static List<String> readFiles() {
		return List.of(
			"1, green, 200, Vietnam",
			"16, green, 300, Vietnam",
			"12, red, 300, Lao"
		);
	}

}
