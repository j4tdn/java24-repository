package collection.map;

import java.util.HashMap;
import java.util.Map;

import static utils.CollectionUtils.*;

public class Ex01HashMapDemo {
	public static void main(String[] args) {
		Map<String,Integer> models = new HashMap<>();
		models.put("Quảng Nam", 92);
		models.put("Đà Nẵng", 43);
		models.put("Huế", 75);
		models.put("Quảng Trị", 74);
		models.put("Quảng Bình", 73);
		models.put(null, -2);
		models.put("Quảng Trị", 47);
		models.putIfAbsent("Đà Nẵng", 34);
		
		System.out.println("size of models: " + models.size());
		System.out.println("model number of city Huế :" + models.get("Huế"));
		System.out.println("model number of city Nghệ an :" + models.getOrDefault("Nghệ an", -1));
		
		models.remove(null);
		System.out.println("contains 'Quảng Bình' :" + models.containsKey("Quảng Bình"));
		
		
		generate("models data:", models);
	}
	

}
