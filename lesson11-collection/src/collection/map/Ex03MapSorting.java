package collection.map;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

import utils.CollectionUtils;

public class Ex03MapSorting {

	public static void main(String[] args) {
		// Hỗ trợ sort theo key
		Map<String, Integer> models = new TreeMap<>((s1, s2) -> {
			if (s1 == null) {
				return -1;
			}

			if (s2 == null) {
				return 1;
			}

			return s1.compareTo(s2);
		});

		models.put("Quảng Nam", 92);
		models.put("Đà Nẵng", 43);
		models.put("Huế", 75);
		models.put("Quảng Trị", 74);
		models.put("Quảng Bình", 73);
		models.put(null, -2);

		CollectionUtils.generate("1. Sắp xếp theo key", models);

		CollectionUtils.generate(
				"2. Sắp xếp map giảm dần theo value", 
				sort(models, (e1, e2) -> {
					return e2.getValue().compareTo(e1.getValue());
				})
		);

	}

	private static <K, V> Map<K, V> sort(Map<K, V> source, Comparator<Entry<K, V>> comparator) {
		// B1: Chuyển đổi từ map -> set of entries
		// B2: Chuyển đổi từ set sang list
		var list = new ArrayList<>(source.entrySet());

		// B3: Sắp xếp list
		list.sort(comparator);
		
		// B4: Đưa danh sách sắp xếp vào map(LinkedHashMap)
		var target = new LinkedHashMap<K, V>();
		list.forEach(entry -> {
			target.put(entry.getKey(), entry.getValue());
		});
		
		return target;
	}

}
