package view;
import static model.DataModel.getDailySpending;
import static utils.CollectionUtils.generate;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
public class Ex05DailySpending {
	public static void main(String[] args) {
		
		var daily = getDailySpending();
		
		generate("Danh sách chi tiêu",daily);
		
		method1(daily);
		
		sortBySpending(daily);
		
		sortByValue(daily, (a,b) -> {
			return b.getValue().compareTo(a.getValue());
		});
	}
	private static void method1 (Map<String, Integer> map) {
		System.out.println("Danh sách chi tiêu lớn hơn 500000 đồng");
		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			if (entry.getValue() > 500000) {
				System.out.println(entry.getKey() + " "+entry.getValue());
			}
		}
		System.out.println("====================================");
	}
	private static void sortBySpending(Map<String, Integer> map) {
		Map<String, Integer> result = new TreeMap<>(map);
		generate("Danh sách sắp xếp theo khoản chi tiêu", result);
	}
	private static void sortByValue (Map<String, Integer> map, Comparator<? super Entry<String, Integer>> comparator) {
		List<Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
		list.sort(comparator);
		
		var result = new LinkedHashMap<String, Integer>();
		for (Entry<String, Integer> entry : list) {
			result.put(entry.getKey(), entry.getValue());
		}
		generate("Danh sách sắp xếp theo value", result);
	}

}
