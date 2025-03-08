package view;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class EX01RawTypes {
	public static void main(String[] args) {
		//nunbers có KDL la List,lưu dánh sách các phần tử là Interger
		List<Integer> numbers = new ArrayList<>();  
		
		//thêm vào 1 vài phần tử
		numbers.add(7);
		numbers.add(12);
		numbers.add(29);
		numbers.add(36);
		numbers.add(2,88);
		numbers.remove(new Integer(29));
		System.out.println("Độ dài mảng numbers "+numbers.size());
		for(Integer number : numbers) {
			System.out.println(number + " ==> "+(number * number));
		}
		
		//khai báo theo kiểu raw types (Ko khuyến khích)
		//Khi KDL cần truyền vào KDl cho generic types,nếu khong truyền để mặc định
		
		@SuppressWarnings("rawtypes")
		List list = new LinkedList(); // lưu danh sách
		list.add(44);
		list.add(55);
		list.add("as");
		list.add(12f);
		System.out.println("độ dài list"+list.size());
		System.out.println("In ra giá trị bình phương ");
		
	}
}
