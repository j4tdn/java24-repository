package view.stream;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

import bean.Dish;
import model.DataModel;
import utils.CollectionUtils;

public class Ex01StreamBasicDemo {
	
	public static void main(String[] args) {
		//Cau hoi 1. vì sao khởi tạo datamodel không trả về Stream<T> luôn mà phải trả về collection
		//Cau hoi 2. tại sao khi xử lí xong không lưu dữ liệu ở Stream mà phải convert lại về kiểu khác 
		// vd: collect(Collectors.toList())
		
		//Vì stream là travesabnle once: độ dữ klieeuj trong stream chỉ có thể sử dụng được 1 /
		// nếu lưu trong stream vẫn được nhưng bất tiện cho nên ko khởi tạo cũng dư lưu trữ dữ liệu trong stream sau khi sử dụng
		
		List<Dish> menu = DataModel.getDishes();
		
		//1. Get dishes which have calories > 250
		// tìm thuộc tính thỏa điều kiện gì đó, dùng predicate -> trả về boolean
		List<Dish> dishesWithHigherCalo = menu.stream() // Stream<Dish>
				.filter(d -> d.getCalories() > 250)
				.collect(Collectors.toList()); // List<Dish>
			CollectionUtils.generate("1. Get dishes which have calories > 250", dishesWithHigherCalo);
		//2. Get name of dishes
		// để truyền vào t -> lấy thuộc tính R thì dùng map
		String nameOfDishes = menu.stream()
				.filter(Dish::isVeggie)
				.map(Dish::getName)
				.collect(Collectors.joining(", "));
		System.out.println("2. Get name of dishes --> " + nameOfDishes);
		//3. Get name of veggie dishes
		String nameOfVeggie = menu.stream() //Stream<Dish>
				.filter(Dish::isVeggie) //Stream<Dish> -> predicate
				.map(Dish::getName) // Stream<Dish> -> function -> lấy t trả về r
				.collect(Collectors.joining(", ")); //String
		System.out.println("3. Get name of veggie dishes --> " + nameOfVeggie);
		//4. Sort a budget map
		Map<String, Integer> models = DataModel.getModels(); // Map <K, V> Stream<T> Collection<T>
		Map<String, Integer> sortedModels = models.entrySet() // Set<Entry<String, Integer>>
		.stream()		// Stream<Entry<String, Integer>>
		.sorted((e1, e2) -> {
		String k1 =	e1.getKey();
		String k2 = e2.getKey();
		if (k1 == null & k2 != null) {
			return 1;
		}
		if (k2 == null ) {
			return -1;
		}
		return k2.compareTo(k1);
		}) //Sorted Stream
		.collect(Collectors.toMap(Entry::getKey, Entry::getValue, (v1, v2) -> v1, LinkedHashMap::new)); // Map<K,V>
		
		CollectionUtils.generate("Sort a budget map", sortedModels);
	}
}
