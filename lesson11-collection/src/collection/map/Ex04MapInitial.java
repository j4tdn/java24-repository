package collection.map;

import java.util.Map;

public class Ex04MapInitial {
	
	public static void main(String[] args) {
		
		// Tạo ra một immutable map -> không chứa null keys
		Map<Integer, String> letters = Map.of(
				65, "A",
				66, "B",
				67, "C",
				null, "D"
		); 
		
		System.out.println("size: " + letters.size());
		System.out.println("65 ==> " + letters.get(65));
		
		// list/set forEach --> Consumer<T> void
		// map      forEach --> BiConsumer<K, V> void
		
		letters.forEach((k, v) -> {
			System.out.printf("k(%s), v(%s)\n", k, v);
		});
		
		// letters.put(68, "D");
	}
	
}
