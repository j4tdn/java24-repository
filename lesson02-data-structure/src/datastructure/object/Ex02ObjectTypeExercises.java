package datastructure.object;

import bean.Store;

public class Ex02ObjectTypeExercises {
	public static void main(String[] args) {
	/*
	 khởi tạo dữ liệu cho CH gồm: tên CH, giờ mở cửa, giờ đóng cửa
	 Khởi tạo 3 đối tượng: A 8 16, B 8 17, C 9 18
	 */
		Store store1 = new Store('A',8 ,16);
		
		
		Store store2 = new Store('B', 8, 14);
		
		
		Store store3 = new Store('C', 9, 18);
		System.out.println("s1--> "+ store1);
		System.out.println("s2--> "+ store2);
		System.out.println("s3--> "+ store3);
	
		
	}		
}
