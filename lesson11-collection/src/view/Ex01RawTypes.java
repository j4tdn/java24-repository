package view;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Ex01RawTypes {
	
	public static void main(String[] args) {
		// numbers có KDL là List, lưu danh sách các phần tử là Integer
		List<Integer> numbers = new ArrayList<>();
		
		// thêm vào 1 vài phần tử
		numbers.add(7);
		numbers.add(12);
		// numbers.add("a"); lỗi tại compile
		numbers.add(29);
		numbers.add(36);
		numbers.add(2, 88);
		
		// array: length
		// collection: size --> length, capacity
		
		System.out.println("Độ dài numbers: " + numbers.size());
		for (Integer number: numbers) {
			System.out.println(number + " ==> " + (number * number));
		}
		
		String s1 = "??";
		String s2 = "??";
		
		System.out.println(s1.compareTo(s2));
		
		
		System.out.println("\n====================\n");
		
		// Khai báo theo kiểu raw types (không khuyến khích)
		// Khi KDL cần truyền vào KDL cho generic type, nếu ko truyền hiểu mặc định là KDL Object
		// Xuất hiện warning
		@SuppressWarnings("rawtypes")
		List list = new LinkedList(); // vd lưu danh sách số nguyên
		list.add(44);
		list.add(55);
		list.add("aa");
		list.add(12f);
		
		System.out.println("Độ dài list: " + list.size());
		System.out.println("In ra giá trị bình phương cho mỗi phần tử");
		for (Object object: list) {
			// ClassCastException
			System.out.println(object + " ==> " + ((int)object * (int)object));
		}
		
	}
	
}