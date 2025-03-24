package view;

import model.DataModel;

import java.util.*;

public class Ex06ExpenseManagement {
    public static void main(String[] args) {
        Map<String, Integer> expenses = DataModel.getExpense();

        System.out.println("Cac khoan chi lon hon 500: ");
        getExpenseGreaterThan500(expenses);

        //Sap xep cac khoan chi theo key
        System.out.println("Sap xep cac khoan chi tang dan theo key:");
        System.out.println(sort(expenses, (o1, o2) -> o1.getKey().compareTo(o2.getKey())));

        //Sap xep cac khoan chi theo value
        System.out.println("Sap xep cac khoan chi giam dan theo value:");
        System.out.println(sort(expenses, (o1, o2) -> o2.getValue().compareTo(o1.getValue())));

    }

    private static void getExpenseGreaterThan500(Map<String, Integer> expenses) {
        for (Map.Entry<String, Integer> entry : expenses.entrySet()) {
            if (entry.getValue() > 500) {
                System.out.println(entry.getKey() + ":" + entry.getValue());
            }
        }
    }

    private static Map<String, Integer> sort(Map<String, Integer> expenses, Comparator<Map.Entry<String, Integer>> comparator) {
        Set<Map.Entry<String, Integer>> entries = expenses.entrySet();
        List<Map.Entry<String, Integer>> list = new ArrayList<>(entries);

        list.sort(comparator);

        Map<String, Integer> sortedMap = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> entry : list) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }

        return sortedMap;
    }


}
