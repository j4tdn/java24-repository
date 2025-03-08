package collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ex01StringListOperations {
	public static void main(String[] args) {
		List<String> list = mockData();
		
		//thêm  vào vị trí bất kì , cuối --> 1 phần tử , collection
		
		
		//xóa theo vị trị index,value, điều kiện
//		list.remove("ttt");
		String valToBeDeleted = "ttt";
//		Iterator<String> iterator = list.iterator();
//		while(iterator.hasNext()) {
//			String s = iterator.next();
//			if(s.equals(valToBeDeleted)) {
//				iterator.remove();
//			}
//		}
		list.removeIf(s ->{
			return s.compareTo("d") > 0;
		});
		//Get ,set tại vị trí i
		
		//duyệt for , each, tuan tu interable
		//duyệt bất đồng bộ
		for(int i= 0; i< list.size();i++) {
			System.out.print(list.get(i)+" ");
		}
		System.out.println();
		list.forEach(s -> {
			System.out.print(s+" ** ");
		});
		System.out.println();
		//duyệt tuần tự , duyệt đến phần tử nào chỉ được phép truy cập vào giá trị
//		Iterator<String> iterator = list.iterator();
//		
//		while(iterator.hasNext()) {
//			String each =iterator.next();
//			System.out.print(each + " ++ ");
//		}
		 
		
	}
	private static List<String> mockData(){
		List<String> list = new ArrayList<>();
		list.add("b22");
		list.add("k81");
		list.add("a20");
		list.add("ttt");
		list.add("c718");
		list.add("c02");
		list.add("m72");
		list.add("n45");
		list.add("d76");
		
		return list;
	}
}
