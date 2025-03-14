package collection.list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Ex02AddRemoveAllElements {
	
	public static void main(String[] args) {
		List<String> list1 = mockList1();
		List<String> list2 = mockList2();
		
		// Hợp
		List<String> unionAll = new ArrayList<>(list1);
		unionAll.addAll(list2);
		generte("Kết quả hợp 2 danh sách", unionAll);
		
		// Giao
		List<String> intersect = new ArrayList<>(list1);
		intersect.retainAll(list2);
		generte("Kết quả giao 2 danh sách", intersect);
		
		// Hiệu
		List<String> diff = new ArrayList<>(list1);
		diff.removeAll(list2);
		generte("Kết quả hiệu 2 danh sách", diff);
	}
	
	private static void generte(String prefix, Collection<String> collection) {
		System.out.print(prefix + " --> ");
		collection.forEach(s -> System.out.print(s + " "));
		System.out.println("\n\n");
	}
	
	private static List<String> mockList1() {
		List<String> list = new ArrayList<>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("e");
		return list;
	}
	
	private static List<String> mockList2() {
		List<String> list = new ArrayList<>();
		list.add("d");
		list.add("e");
		list.add("x");
		list.add("y");
		return list;
	}
	
}
