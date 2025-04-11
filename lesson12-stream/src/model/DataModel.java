package model;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import bean.Apple;

public class DataModel {
	private DataModel() {
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

}
