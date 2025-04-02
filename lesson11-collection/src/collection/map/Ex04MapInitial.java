package collection.map;

import java.util.Map;

public class Ex04MapInitial {
	
	public static void main(String[] args) {
		
		Map<Integer, String> letters = Map.of(
				65, "A",
				66, "B"
				);		
		System.out.println("size " + letters.size());
		System.out.println(letters.get(65));
		
		letters.forEach((k, v) -> {
			System.out.printf("K(%s), v(%s)\n",k,v);
		});
	}

}
