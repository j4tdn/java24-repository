package collection.map;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

import utils.CollectionUtils;

public class Ex03MapSorting {

	public static void main(String[] args) {
		//Hỗ trợ sort theo key
		Map<String, Integer> models = new TreeMap<>((s1,s2) -> {
			if (s1 == null) {
				return -1;
			}
			if (s2 == null) {
				return 1;
			}
			return s1.compareTo(s2);
		});
		models.put("Quang Nam", 92);
		models.put("Da Nang", 43);
		models.put("Hue", 75);
		models.put("Quang Tri", 74);
		models.put("Quang Binh", 73);
		models.put(null, -2);
		
		CollectionUtils.generate("1. Sắp xếp theo key", models);

		CollectionUtils.generate("2. Sắp xếp theo value", sort(models, (e1,e2)-> {
			return e1.getValue().compareTo(e2.getValue());
		}));
		
		
	
		
		
	}
	// muốn sort theo value
	private static Map<String , Integer> sort(Map<String, Integer> source, Comparator<Entry<String, Integer>> comparator ){
		//B1: chuyển đổi từ map -> set of entries
				Set<Entry<String, Integer>> entries = source.entrySet();
				
				//B2: chuyển đổi từ set sang list
				List<Entry<String, Integer>> list = new ArrayList<Map.Entry<String,Integer>>(entries);
				
				//B3: sắp xếp
				list.sort(comparator);
				
				//B4: Đưa danh sách đã sắp xếp vào Map lại (100% phỉa dùng LinkedHashMap -> duy trì thứ tự đưa vào)
				Map<String, Integer> target = new LinkedHashMap<>();
				list.forEach(entry -> {
					target.put(entry.getKey(), entry.getValue());
				});
				return target;
	}
}
