package collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ex01StringListOperations {
	// khai báo biến KD; array hoặc collection
	// numbers, numberArray, numberList
	public static void main(String[] args) {
		List<String> list = mockData();
		
		// Thêm vào 1 vị trí bất kì, cuối -> 1 phần tử, collection
		
		//Xoá theo vị trí index, value, điều kiện
		//list.remove("ttt"); chỉ xoá phần tử đầu tiên thoả mảng
//		String valToBeDeleted = "ttt";
//		Iterator<String> iterator = list.iterator();
//		while(iterator.hasNext()) {
//			String s = iterator.next();
//			if(s.equals(valToBeDeleted)) {
//				iterator.remove();
//			}
//		}
		list.removeIf(s -> {
			return s.compareTo("d")>0;
		});
		//Get, set tại vị trí thứ i
		list.set(0, "w123");
		
		//Duyệt for index, each, tuần tự Iterable#iterator
		//1.Duyệt bất động bộ, đang duyệt tại phần tử i, có thể access phần tử k list
		for(int i = 0; i < list.size();i++)
		{
			System.out.print(list.get(i)+ " ");
		}
		System.out.println();
		list.forEach(s -> {
			System.out.print(s + " ** ");
		});
		System.out.println();
		//2. Duyệt tuần tự, duyệt đến phần tử nào chỉ được phép truy cập vào giá trị
		
		Iterator<String> iterator = list.iterator();
		while(iterator.hasNext()) {
			String each = iterator.next();
			System.out.print(each + " ++ ");
		}
		System.out.println();
		
		
	}
	private static List<String> mockData(){
		List<String> list = new ArrayList<>();
		
		list.add("b22");
		list.add("k81");
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
