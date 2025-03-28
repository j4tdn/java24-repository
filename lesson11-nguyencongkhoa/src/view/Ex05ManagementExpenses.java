package view;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import bean.CDShop;

public class Ex05ManagementExpenses {

	public static void main(String[] args) {
		Map<String, Integer> expenses = dataExpenses();

		System.out.println("\nThông tin các khoản chi lớn hơn 500k VND:");
		listInforExpensesGreaterThan500kVND(expenses);

		System.out.println("\nSort Asc by expense accounts:");
		sortAscExpenseAccounts(expenses);

		System.out.println("\nSort Desc by price:");
		sortDescPrice(expenses);
	}

	private static Map<String, Integer> dataExpenses() {
		Map<String, Integer> expenses = new HashMap<>();

		expenses.put("Ăn uống", 500000);
		expenses.put("Mua sắm", 200000);
		expenses.put("Xăng xe", 800000);
		expenses.put("Giải trí", 600000);
		expenses.put("Sửa chữa", 100000);
		expenses.put("Hóa đơn điện", 300000);
		expenses.put("Hóa đơn nước", 150000);
		expenses.put("Thuê nhà", 2000000);
		expenses.put("Mua quà", 500000);
		expenses.put("Du lịch", 1500000);

		return expenses;
	}

	private static void listInforExpensesGreaterThan500kVND(Map<String, Integer> expenses) {
		for (Map.Entry<String, Integer> entry : expenses.entrySet()) {
			String key = entry.getKey();
			Integer value = entry.getValue();
			if (value > 500000) {
				System.out.println(key + ": " + value);
			}
		}
	}

	private static void sortAscExpenseAccounts(Map<String, Integer> expenses) {
//		for (Map.Entry<String, Integer> entry: expenses.entrySet()) {
//			String key = entry.getKey();
//			Integer value = entry.getValue();
//				System.out.println(key + ": " + value);
//		}
		List<Map.Entry<String, Integer>> listExpenses = new ArrayList<>(expenses.entrySet());

//		System.out.println("\nExpense trước khi sort:");
//		for (Map.Entry<String, Integer> entry : listExpenses) {
//			System.out.println(entry.getKey() + ": " + entry.getValue());
//		}
		listExpenses.sort((l1, l2) -> l1.getKey().compareTo(l2.getKey()));

		System.out.println("\nExpense sau khi sort:");
		for (Map.Entry<String, Integer> entry : listExpenses) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
	}

	private static void sortDescPrice(Map<String, Integer> expenses) {
		List<Map.Entry<String, Integer>> listExpenses = new ArrayList<>(expenses.entrySet());

		System.out.println("\nExpense trước khi sort:");
		for (Map.Entry<String, Integer> entry : listExpenses) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
		listExpenses.sort((l1, l2) -> Integer.compare(l2.getValue(), l1.getValue()));

		System.out.println("\nExpense sau khi sort:");
		for (Map.Entry<String, Integer> entry : listExpenses) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
	}
}
