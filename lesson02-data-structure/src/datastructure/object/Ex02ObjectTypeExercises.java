package datastructure.object;

import bean.Store;

public class Ex02ObjectTypeExercises {
	/*
	 * Khởi tạo dữ liệu cho cửa hàng gồm tên cửa hàng, giờ mở cửa, giờ đống của
	 * 
	 */
	public static void main(String[] args) {
		Store s1 = new Store('A', 8, 16);
		Store s2 = new Store('B', 8, 17);
		Store s3 = new Store('C', 9, 18);
		
		System.out.println("s1 -> "+ s1);
		System.out.println("s2 -> "+ s2);
		System.out.println("s3 -> "+ s3);
		
	}
	
	

	

}
