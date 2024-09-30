package datastructure.object;

import been.Store;

public class Ex02ObjectTypeExercises {

	public static void main(String[] args) {
		/*
		 Khởi tạo DL cho CH gồm: tên CH, giờ mở cửa, đóng cửa
		 Khởi tạo 3 đối tượng: A 8 16
		 					   B 8 17
		 					   c 9 18
		 */
		
		Store s1 = new Store('A', 8, 16);
		Store s2 = new Store('B', 8, 17);
		Store s3 = new Store('C', 9, 18);
		
		System.out.println("s1 -> " + s1);
		System.out.println("s2 -> " + s2);
		System.out.println("s3 -> " + s3);
		
	}
}
