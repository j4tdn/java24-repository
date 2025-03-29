package view;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;

import model.DataModel;

public class Ex06ExpenseManagement {
	
	public static void main(String[] args) {
		Map<String, Integer> expense = DataModel.getExpenses();
		
		System.out.println("cac khoan chi lon hon 500:");
		getExpenseGreater500(expense);
		System.out.println();
		System.out.println("Sap xep theo cac khoan chi tieu: ");
		System.out.println(sort(expense, (s1, s2) -> s1.getValue().compareTo(s2.getValue())));
		
		System.out.println("Sap xep giam dan theo so tien: ");
		System.out.println(sort(expense, (s1, s2) -> s2.getValue().compareTo(s1.getValue())));
	}
	
	private static void getExpenseGreater500(Map<String, Integer> expense) {
		for (Map.Entry<String, Integer> entry : expense.entrySet()) {
			if (entry.getValue() > 500) {
				System.out.println(entry.getKey() + ":" + entry.getValue());
			}
		}
	}
	
	private static <K, V> Map<K, V> sort(Map<K, V> expense, Comparator<Map.Entry<K, V>> comparator) {
		var list = new ArrayList<>(expense.entrySet());
		
		list.sort(comparator);
		
		var target = new LinkedHashMap<K, V>();
		list.forEach(element -> {
			target.put(element.getKey(), element.getValue());
		});
		
		return target;
	}

}
