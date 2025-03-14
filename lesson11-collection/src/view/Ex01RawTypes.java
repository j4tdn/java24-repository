package view;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Ex01RawTypes {

	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>();

		numbers.add(8);
		numbers.add(12);
		numbers.add(24);
		numbers.add(32);
		numbers.add(2, 88);

		System.out.println("Độ dài numbers: " + numbers.size());
		for (Integer num : numbers) {
			System.out.println(num + " ==> " + (num * num));
		}

		System.out.println("\n=================\n");

		String s1 = "??";
		String s2 = "??";

		System.out.println(s1.compareTo(s2));

		System.out.println("\n====================\n");

		// Khai báo theo kiểu raw types (không khuyến khích)
		// Khi KDL cần truyền vào KDL cho generic type, nếu ko truyền hiểu mặc định là
		// KDL Object
		// Xuất hiện warning
		@SuppressWarnings("rawtypes")
		List list = new LinkedList();
		list.add(44);
		list.add(55);
		list.add("aa");
		list.add(12f);

		System.out.println("Độ dài list: " + list.size());
		System.out.println("In ra giá trị bình phương cho mỗi phần tử");
		for (Object object : list) {
			// ClassCastException
			System.out.println(object + " ==> " + ((int) object * (int) object));
		}
	}

}
