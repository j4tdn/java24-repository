package datastructure.object;

import bean.Store;

public class Ex02ObjectTypeExercises {
	public static void main(String[] args) {
		/*
		 Khởi tạo dữ liệu cho cửa hàng gồm: tên cửa hàng, giờ mở cửa, giờ đóng cửa
		 Khởi tạo 3 đối tượng:
		 	Store A, giờ mở cửa : 8, giờ đóng cửa: 16
		 	Store B, giờ mở cửa : 8, giờ đóng cửa: 17
		 	Store C, giờ mở cửa : 9, giờ đóng cửa: 18
		 */
		
		Store s1 = new Store('A', 8, 16);
		Store s2 = new Store('B', 8, 17);
		Store s3 = new Store('C', 9, 18);
		
		System.out.println("s1 " + s1 );
		System.out.println("s2 " + s2 );
		System.out.println("s3 " + s3 );
	}
	
	
}
