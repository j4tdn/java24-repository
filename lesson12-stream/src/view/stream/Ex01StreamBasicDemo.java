package view.stream;

import static utils.CollectionUtils.generate;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

import bean.Dish;
import model.DataModel;

public class Ex01StreamBasicDemo {
    public static void main(String[] args) {
    	
    	/*
    	 Các bước làm với stream
		B1. Chuyển đổi từ KDL source sang Stream<T>
			--> source: List<T>

		B2. Sử dụng các hàm bên trong Stream<T>
			--> hàm: filter
           			map

		B3. Chuyển đổi từ Stream<T> sang KDL target
			--> hàm: collect(toList, toSet, toMap, toCollection), toArray
			--> target: List<T>, Set<T>, Array
    	 */
    	
        // Câu hỏi 1: Tại sao ko tạo data model trả về Stream<T>
        // Câu hỏi 2: Tạo sao sau khi xử lý xong không lưu trữ dữ liệu ở Stream<T> mà phải convert sang kiểu khác

        List<Dish> menu = DataModel.getDishes();

        // 1. Get dishes which have calories > 250
        List<Dish> dishesWithHigherCalories = menu.stream() // Stream<Dish>
        .filter(d -> d.getCalories() > 250) // Stream<Dish>
        .collect(Collectors.toList()); // List<Dish>
        
        generate(" 1. Get dishes which have calories > 250", dishesWithHigherCalories );
        // 2. Get name of dishes
        String dishesName = menu.stream() // Stream<Dish>
        .map(d-> d.getName())
        .collect(Collectors.joining(", "));
        
        System.out.println("2. Get name of dishes " + dishesName);
        // 3. Get name of vegetarian dishes
        String veggieName = menu.stream()
        		.filter(Dish::isVeggie)
        		.map(Dish::getName)
        		.collect(Collectors.joining(", "));
        
        System.out.println("3. Get name of vegetarian dishes " + veggieName);
        
     // Stream<T>
     // List<T>, Set<T> extends Collection<T>
     // Map<K, V> -> Set<Entry<K, V>>
        
     // Stream<T> --> collect(Collectors.toList()) --> List<T>
     // Stream<T> --> ... --> Map<K,V>   
        
        // 4. Sort a budget map
        System.out.println("4. Sắp xếp theo biển số xe: ");
        
        Map<String, Integer> models = DataModel.getModels();
        
       Map<String, Integer> sortedModels = models.entrySet() // Set<Entry<K,V>>
        .stream()		// Stream<Entry<K,V>>
        .sorted(Comparator.comparing(Entry::getValue))//Stream<Entry<K,V>>
        .collect(Collectors.toMap(Entry::getKey, Entry::getValue, (v1,v2) -> v2, LinkedHashMap::new));
        
        
       generate("4. Sort a budget map: ", sortedModels);
        
        
    }
}