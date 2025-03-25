package collection.map;

import java.util.HashMap;
import java.util.Map;

public class Ex01HashMapDemo {

	public static void main(String[] args) {
		
//		put<K, V>: Kiem tra xem K da ton tai trong map chuaw, chua thi se theem vao, rooif thif se ghi de
		
		Map<String, Integer> models = new HashMap<>();
		models.put("QN", 92);
		models.put("DN", 43);
		models.put("H", 75);
		models.put("QT", 74);
		models.put("GL", 81);
		
		System.out.println("Size of " + models.size());
		System.out.println(models.get("GL"));
	}
	
}
