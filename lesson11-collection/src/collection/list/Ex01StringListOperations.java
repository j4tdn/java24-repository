package collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ex01StringListOperations {

	// Khai báo KDL array hoặc collection
	// numbers, numberArray, numberList

	public static void main(String[] args) {
		List<String> list = mockData();

		// Thêm vào 1 vị trí bất kỳ --> 1 phần tửu collection

		// Xóa theo vị trí indexx, value, điều kiện

		// get và set tại vị trí thứ i

		// Duyệt for index, foreach, tuần tự iterable#iterator()
		
		// Duyệt bất đồng bộ, đang duyệt tại phần tử i, có thể acces phần tử k
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}

		System.out.println();

		list.forEach(s -> {
			System.out.print(s + " ** ");
		});

		System.out.println();
		
		// Duyệt tuần tự, duyệt đến phần tử nào chỉ được phép truy cập vào giá trị của phần tử đó
		Iterator<String> iterator = list.iterator();
		while(iterator.hasNext()) {
		    String each = iterator.next();
		    System.out.print(each + " ++ ");
		}

		System.out.println();

		
	}

	public static List<String> mockData() {
		List<String> list = new ArrayList<String>();

		list.add("b22");
		list.add("bk81");
		list.add("a20");
		list.add("z22");
		list.add("ttt");
		list.add("m72");
		list.add("n45");
		list.add("d76");

		return list;
	}

}
