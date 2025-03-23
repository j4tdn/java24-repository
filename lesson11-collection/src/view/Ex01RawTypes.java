package view;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Ex01RawTypes {
	public static void main(String[] args) {
		
		// luôn luôn lấy cha new con nếu có quan hệ cha con
		// -> để có thể gán qua về, cha có thể gán cho chính nó hoặc con
				
		List<Integer> numbers = new ArrayList<Integer>();
		// numbers co KDL la list, luu ds cac ptu la Integer
		
		//them 1 ptu
		numbers.add(12);
		numbers.add(7);
		numbers.add(2);
	//	numbers.add("a"); lỗi tại compile
		numbers.add(38);
		numbers.add(2, 88);
		
		
		//array: length
		//collection: size --> length, capacity
		
		System.out.println("Do dai numbers: "+ numbers.size());
		for(Integer number: numbers) {
			System.out.println(number + "==> "+(number*number));
		}
		//Khai báo theo kiểu raw types (ko khuyến khích)
		//Khi KDL can truyen vao KDL cho generic type, neu ko truyen hieu mac dinh la object
		
		List list = new LinkedList(); //vd luu danh sach so nguyen
		list.add(44);
		list.add(55);
		list.add("as");
		list.add(12f);
		
		System.out.println("Do dai numbers: "+ list.size());
		
		System.out.println("In ra gia tri binh phuong cho moi phan tu: ");
		for (Object object:list) {
			System.out.println(object + "==> "+((int)object * (int)object));
		}
		//khai bao phai dung generic type 100% (neu co)
		
		
	}     

}
