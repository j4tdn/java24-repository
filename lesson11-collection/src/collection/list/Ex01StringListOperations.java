package collection.list;

import java.util.ArrayList;
import java.util.List;

public class Ex01StringListOperations {
	
	// Khai báo biến KDL array hoặc collection
	// numbers, numberArray, numberList
	public static void main(String[] args) {
		List<String> list = mockData();
		
		// Thêm	vào vị trí bất kì, cuối -> 1 phần tử, collection
		
		// Xóa theo vị trí index, value, điều kiện, collection
		// Xóa phần tử đầu tiên thỏa mãn
		// -> list.remove("ttt");
		
		// Cơ chế remove: thực chất ko phải xóa khỏi mảng, mà là nó copy mảng đối tượng sang mảng khác
		// rồi loại phần tử đó ra
		// -> Vừa duyệt vừa xử lí element thì nó ko cho -> bị exception
		
		//Custom: Xóa hết tất cả phần tử trong danh sách thỏa mãn yêu cầu
		String valToBeDeleted = "ttt";
//		Iterator<String> iterator = list.iterator();
	//	while (iterator.hasNext()) {
	//		String s = iterator.next();
	//		if (s.equals(valToBeDeleted)) {
	//			iterator.remove();
	//		}
	//		}
		list.removeIf(s -> {
			return s.compareTo("d") > 0;
		});
		// get, set tại vị trí thứ i
		list.set(0, "w123");
		
		// Duyệt for index, each, tuần tự Iterable#iterator()
		
		// Duyệt bất đồng bộ: duyệt tại ptu i, có thẻ access tới phần tử k, list ...
		for (int i = 0; i< list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		System.out.println();
		
		
		list.forEach(s -> {
			System.out.print(s + " ** ");
		});
		System.out.println();
		
		
		//Duyệt tuần tự, duyệt đến ptu nào thì chỉ dc phép truy cập đến giá trị ptu đó
	
		System.out.println();
	}
	private static List<String> mockData(){
		List<String> list = new ArrayList<>();
		
		list.add("b22");
		list.add("k81");
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
