package model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import bean.Apple;
import bean.Dish;
import bean.Player;
import common.Kind;

public class DataModel {
	private DataModel() {
	}
	
	public static List<Player> getPlayers() {
		return List.of(
				new Player("A1", List.of("baco", "haichuon", "giaro"), false),
				new Player("A2", List.of(), true),
				new Player("A3", List.of("bonco", "hairo", "giabich"), false),
				new Player("A4", List.of("bayco", "boichuon", "giaco"), false)
				);
				
	}
	
	public static List<Dish> getDishes() {
	    return List.of(
	        new Dish("1", "D1", 234d, Kind.FISH),
	        new Dish("2", "D2", 542d, Kind.MEAT),
	        new Dish("3", "D3", 180d, Kind.EGG),
	        new Dish("4", "D4", 100d, Kind.VEGGIE),
	        new Dish("5", "D5", 101d, Kind.VEGGIE),
	        new Dish("6", "D6", 255d, Kind.FISH),
	        new Dish("7", "D7", 888d, Kind.OTHER),
	        new Dish("8", "D8", 102d, Kind.VEGGIE)
	    );
	}
	
	public static Map<String, Integer> getModels(){
		Map<String, Integer> models = new HashMap<String, Integer>();
        models.put("Quảng Nam", 92);
        models.put("Đà Nẵng", 43);
        models.put("Huế", 75);
        models.put("Quảng Trị", 74);
        models.put("Quảng Bình", 73);
        return models;
	}
 
	public static List<Apple> getApples() {
		return List.of(new Apple(1, "green", 200, "Vietnam"), 
				new Apple(16, "green", 300, "Vietnam"),
				new Apple(22, "red", 300, "Lao"), 
				new Apple(4, "yellow", 400, "Thailand"),
				new Apple(17, "red", 600, "Vietnam"), 
				new Apple(23, "blue", 200, "Vietnam"), 
				new Apple(6, "green", 100, "Thailand"));
	}
	
	public static List<String> readFiles() {
	    return List.of(
	        "1, green, 200, Vietnam",
	        "16, green, 300, Vietnam",
	        "22, red, 300, Lao"
	    );
	}
}