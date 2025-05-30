package collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ex01StringListOperations {
	
	// Khai báo biết KDL array hoặc collection
	// numbers, numberArray, numberList
	
	public static void main(String[] args) {
		List<String> list = mockData();
		
		// Thêm vào vị trí bất kì, cuối -> 1 phần tử, collection
		
		// Xóa theo vị trí index, 'value', điều kiện, collection
		// Xóa phần tử đầu tiên thỏa mãn
		String valToBeDeleted = "ttt";
		// list.remove("ttt");
		// ConcurrentModificationException: b22 k81 a20 z22 ttt c02 m72 n45 d76 
		// for (String s: list) {
			// if (s.equals(valToBeDeleted)) {
			// 	
			// }
			// list.remove(valToBeDeleted);
		// }
		
		// Custom: Xóa tất cả các phần tử trong danh sách thỏa mãn yêu cầu
//		Iterator<String> iterator = list.iterator();
//		while(iterator.hasNext()) {
//			String s = iterator.next();
//			if (s.equals(valToBeDeleted)) {
//				iterator.remove();
//			}
//		}
		
		list.removeIf(s -> {
			return s.compareTo("d") > 0;
		});
		
		// Get, set tại vị trí thứ i
		list.set(0, "w123");
		
		// Duyệt for index, each, tuần tự Iterable#iterator()
		
		// Duyệt bất đồng bộ, đang duyệt tại phần tử i, có thể access phần tử k, list
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		
		System.out.println();
		
		list.remove("w123");
		
		list.forEach(s -> {
			System.out.print(s + " ** ");
		});
		
		System.out.println();
		
		// Duyệt tuần tự, duyệt đến phần tử nào chỉ được phép truy cập vào giá trị của phần tử đó
		
		
//		Iterator<String> iterator = list.iterator();
//		while(iterator.hasNext()) {
//			String each = iterator.next();
//			System.out.print(each + " ++ ");
//		}
		
		System.out.println();
	}
	
	private static List<String> mockData() {
		List<String> list = new ArrayList<>();
		
		list.add("b22");
		list.add("ttt");
		list.add("a20");
		list.add("z22");
		list.add("ttt");
		list.add("c02");
		list.add("m72");
		list.add("n45");
		list.add("d76");
		
		return list;
	}
	
}
