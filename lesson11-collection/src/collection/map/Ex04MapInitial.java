package collection.map;

import java.util.Map;

public class Ex04MapInitial {
	
	public static void main(String[] args) {
		
		Map<Integer, String> letters = Map.of(
				65,"A",
				66,"B",
				67, "C");
		System.out.println("size: " + letters.size());
		System.out.println("65 ==> "+ letters.get(65));

	}

}
