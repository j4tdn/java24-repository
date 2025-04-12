package view;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.function.Predicate;

import static utils.CollectionUtils.*;

import model.DataModel;

public class Ex05 {

	public static void main(String[] args) {

		var dailyExpenses = DataModel.getDailyExxpenses();

		generate("Danh sách chi tiêu: ", dailyExpenses);

		System.out.println("\n============================\n");

		generate("Liệt kê thông tin các khoản chi lớn hơn 30 ngìn VNĐ",
				printExpenses(dailyExpenses, t -> t.getValue() >= 30000));

		System.out.println("\n============================\n");

		generate("Danh sách theo chi tiêu (key): ", new TreeMap<>(dailyExpenses)); // Sắp xếp theo thứ tự tiếng anh "ă"
																					// ở sau cùng

		System.out.println("\n============================\n");

		generate("Danh sách theo giá trị (value): ", sortMap(dailyExpenses, (t1, t2) -> {
			return t2.getValue() - t1.getValue();
		}));

	}

	private static List<Map.Entry<String, Integer>> printExpenses(Map<String, Integer> dailyExpenses,
			Predicate<Map.Entry<String, Integer>> predicate) {
		var list = new ArrayList<>(dailyExpenses.entrySet());
		var target = new ArrayList<Map.Entry<String, Integer>>();

		for (Map.Entry<String, Integer> entry : list) {
			if (predicate.test(entry)) {
				target.add(entry);
			}
		}

		return target;
	}

	private static <K, V> Map<K, V> sortMap(Map<K, V> dailyExpenses, Comparator<Entry<K, V>> comparator) {
		var list = new ArrayList<>(dailyExpenses.entrySet());
		list.sort(comparator);

		var target = new LinkedHashMap<K, V>();

		list.forEach(entry -> {
			target.put(entry.getKey(), entry.getValue());
		});

		return target;
	}
}
