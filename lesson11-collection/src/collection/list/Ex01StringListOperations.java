package collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ex01StringListOperations {

	// Khai báo biến KDL array hoặc collection
	// numbers, numerArray, numberList

	public static void main(String[] args) {
		List<String> list = mockData();

		String valToBeDeleted = "ttt";

		Iterator<String> iterator = list.iterator();

//		while(iterator.hasNext()) {
//			String s = iterator.next();
//			if(s.equals(valToBeDeleted)) {
//				iterator.remove();
//			}
//		}

		list.removeIf(s -> {
			return s.compareTo("d") > 0;
		});

		// thêm vào vị trí bất kì, cuối -> 1 phần tử, collection

		// Xóa theo vị trí index, value, điều kiện

		// Get, set tại vị trí thứ i

		// Duyệt for index, each, tuần tự Iterable#iterator()
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}

		System.out.println();

		list.forEach(s -> {
			System.out.print(s + " ");
		});

		System.out.println();

//		while(iterator.hasNext()) {
//			String each = iterator.next();
//			System.out.print(each + " ++ ");
//		}

	}

	private static List<String> mockData() {
		List<String> list = new ArrayList<String>();

		list.add("b22");
		list.add("k12");
		list.add("a43");
		list.add("z23");
		list.add("ttt");
		list.add("c09");
		list.add("m54");
		list.add("n51");
		list.add("n85");
		list.add("d93");

		return list;
	}

}
