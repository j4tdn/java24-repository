package collection.map;

import static utils.CollectionUtils.generate;

import java.util.LinkedHashMap;
import java.util.Map;

public class Ex01HashMapDemo {

	
	public static void main(String[] args) {
		/*
		put<K,V>: kiểm tra K đã tồn tại trong map hay chưa, nếu chưa --> thêm vào
		nếu rồi thì ghi đè value 
			+ hashcode (địa chỉ ô nhớ -> là 1 chuỗi số)
			+ equals
			
		HashMap: Ko dùy trì đúng thứ tự đưa vào
		LinkedHashMap: duy trì đúng thứ tự đưa vào
		
		TreeMap: hỗ trợ sorting theo key 
		====================================================================
		Nguyên tắc khi tạo Class mới: override cả hàm equals() và hashCode()
		 
		
		 */
		
		Map<String, Integer> models = new LinkedHashMap<>();
		models.put("Quang Nam", 92);
		models.put("Da Nang", 43);
		models.put("Hue", 75);
		models.put("Quang Tri", 74);
		models.put("Quang Binh", 73);
		models.put(null, 45);
		models.put("Quang Tri", 45); // ghi đè
		models.putIfAbsent("Nghe An", 37);
		
		System.out.println("size of models: "+models.size());
		System.out.println("model number of city 'Hue': "+models.get("Hue"));
		System.out.println("model number of city 'Nghe An': "+models.getOrDefault(models, -1));

		models.remove(null);
		System.out.println("contain Da Nang: "+ models.containsKey("Da Nang"));
		
		generate("models date", models);
		
	}
}
