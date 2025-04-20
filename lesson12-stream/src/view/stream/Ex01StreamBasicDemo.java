package view.stream;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

import bean.Dish;
import model.DataModel;
import utils.CollectionUtils;

import static java.util.Comparator.*;

public class Ex01StreamBasicDemo {
	
	public static void main(String[] args) {
		// Câu hỏi 1: Tại sao ko tạo data model trả về Stream<T>
		// Câu hỏi 2: Tạo sao sau khi xử lý xong không lưu trữ dữ liệu ở Stream<T> mà phải convert sang kiểu khác
		
		// Vì Stream is traversable once: Dữ liệu trong stream chỉ có thể sử dụng được duy nhất 1 lần, nếu
		// lưu trong stream vẫn được nhưng khá bất tiện cho nên ko khởi tạo cũng như lưu trữ dữ liệu trong
		// stream sau khi xử lý xong
		
		List<Dish> menu = DataModel.getDishes();
		
		// 1. Get dishes which have calories > 250
		List<Dish> dishesWithHigherCalories = menu.stream() // Stream<Dish>
			.filter(d -> d.getCalories() > 250) // Stream<Dish>
			.collect(Collectors.toList()); // List<Dish>
		
		CollectionUtils.generate("1. Get dishes which have calories > 250", dishesWithHigherCalories);
		
		
		// 2. Get name of dishes
		String nameOfDishes = menu.stream() // Stream<Dish>
			.map(Dish::getName)  // Stream<String>
			.collect(Collectors.joining(", ")); // String
		
		System.out.println("2. Get name of dishes --> " + nameOfDishes);
			

		// 3. Get name of vegetarian dishes
		String nameOfVeggieDishes = menu.stream() // Stream<Dish>
				.filter(Dish::isVeggie) // Stream<Dish>
				.map(Dish::getName) // Stream<Dish>
				.collect(Collectors.joining(", ")); // String
		
		System.out.println("\n3. Get name of vegetarian dishes --> " + nameOfVeggieDishes);

		System.out.println("\n4. Models Map");
		
		// 4. Sort a models map
		Map<String, Integer> models = DataModel.getModels(); // Map<K, V> Stream<T> Collection<T>
		
		// map -> set -> list   -> sort by ... -> map
		// map -> set -> stream -> sort by ... -> map
		
		Map<String, Integer> sortedModels = models.entrySet() // Set<Entry<String, Integer>>
			.stream()     // Stream<Entry<String, Integer>>
			.sorted((e1, e2) -> {
				String k1 = e1.getKey();
				String k2 = e2.getKey();
				if (k1 == null && k2 != null) {
					return 1;
				}
				if (k2 == null) {
					return -1;
				}
				return k2.compareTo(k1);
			}) // Stream<Entry<String, Integer>> 'sorted'
			.collect(Collectors.toMap(Entry::getKey, Entry::getValue, (v1, v2) -> v1, LinkedHashMap::new)); // Map<K, V>
		
		CollectionUtils.generate("4. Sort a models map", sortedModels);
			
	}
	
}
