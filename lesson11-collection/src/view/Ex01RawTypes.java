package view;

import java.util.ArrayList;
import java.util.List;

public class Ex01RawTypes {
	
	
	public static void main(String[] args) {
		
		// number có KDL là list
		List<Integer> numbers = new ArrayList<>();
		
		// thêm vào 1 vài phàn từ
		numbers.add(7);
		numbers.add(12);
		//numbers.add("a"); lỗi tại compile
		numbers.add(29);
		numbers.add(88);
		numbers.add(2, 88);
		
		numbers.remove(new Integer(29));
		
		// mảng: length
		// collection: size --> length
		
		System.out.println("ĐỘ dài numbers: " + numbers.size());
		
		
		
		// Khai báo theo kiểu raw types (không khuyến khích)
		// Khi KDL cần truyền vào KDL cho generic type, nếu không truyền
		// 			thì hiểu mặc định là Object
		// xuất hiện warning
		
		
	}

}
