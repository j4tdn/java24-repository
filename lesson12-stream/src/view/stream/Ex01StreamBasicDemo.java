package view.stream;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

import bean.Dish;
import common.Kind;
import model.DataModel;
import utils.CollectionUtils;

public class Ex01StreamBasicDemo {
	
	public static void main(String[] args) {
		//1: wwhy ko gen data model trả về Stream<T>
		//2: why sau khi xử lý xong lưu save data trong Stream<T>
		
		//Vif Stream is traversable once: Data trog stream chỉ có thể use dc duy nhất 1 lần
		// nếu lưu trong stream vẫn dc nhưng khá bất tiện cho nên ko khởi tạo cũng như lưu trữ
		//data trog stream sau khi xử lý xog
		List<Dish> menu = DataModel.getDishes();
		
		//1. dishes calo > 250
		List<Dish> dishWHigherCalor = menu.stream()//Stream<Dish>
			.filter(d -> d.getCalories() > 250) // Steam<Dish>
			.collect(Collectors.toList()); // List
		
		CollectionUtils.generate("1. Get dishers which have calories > 250", dishWHigherCalor);
		//2.name of dishes
		String nameOfDishes = menu.stream()
			.map(Dish::getName) //Stream<String>
			.collect(Collectors.joining(", "));
		System.out.println("2. Get name of Dishes --> " + nameOfDishes);
		
		//3.name of vegetarian dishes
		String nameOfVeggieDishes = menu.stream()
			.filter(d -> d.getKind() == Kind.VEGGIE)
			.map(Dish::getName)
			.collect(Collectors.joining(", "));
		System.out.println("3. Get name of vegerarian dishes --> " + nameOfVeggieDishes);
		//4.sort a budget map
		Map<String, Integer> models = DataModel.getModels();
		Map<String, Integer> sortedModels = models.entrySet() //Set<Entry<String, Integer>>
				.stream() // Stream<Entry<String, Integer>>
				.sorted((e1, e2) -> {
					String k1 =  e1.getKey();
					String k2 = e2.getKey();
					if (k1 == null && k2 != null) {
						return 1;
					}
					if (k2 == null) {
						return -1;
					}
					return k2.compareTo(k1);
				}) // Stream ... 'sorted'
				.collect(Collectors.toMap(Entry::getKey, Entry::getValue, (v1, v2) -> v1, LinkedHashMap::new)); //Map<K, V>
		CollectionUtils.generate("4. Sort a models map", sortedModels);
	}
	
}
