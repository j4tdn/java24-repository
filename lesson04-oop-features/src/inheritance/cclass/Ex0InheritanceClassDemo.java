package inheritance.cclass;

import bean.TextBook;
import bean.ReferenceBook;

public class Ex0InheritanceClassDemo {
	
	/*
	 Giải lập bài toán về manage sách ở văn phòng phẩm
	 
	 Sách Giáo Khoa : mã sách, tên sách, giá bán,tình trạng(Cũ mới), phần trăm giảm giá
	 Sách tham khảo : mã sách, tên sách, giá bán, thuế sản xuất
	 
	 Tạo ra class
	 Sách: mã sách, tên sách, giá bán
	 Sách giáo khoa extends Sách: Tình trạng(Cũ mới), phần trăm giảm giá
	 Sách kham khảo extends Sách: Thuế sản xuất;
	 
	 Yêu cầu:
	 1. tạo N đối tượng SGK, STK
	 2, Tìm những SGK cũ có % giảm giá > 2
	 
	 */
	
	public static void main(String[] args) {
		
		TextBook tb1 = new TextBook("SGK-1","Toán",22d);
		TextBook tb2 = new TextBook("SGK-2","Lịch Sử",14d);
		TextBook tb3 = new TextBook("SGK-3","Khoa Học Tự Nhiên",38d);
		
		ReferenceBook  rb1 = new ReferenceBook("STK-1","STK Toán",220d,4d);
		ReferenceBook  rb2 = new ReferenceBook("STK-2","STK Lý",180d,1d);
		
		
		System.out.println("tb1 -->" + tb1);
		System.out.println("tb2 -->" + tb2);
		System.out.println("tb3 -->" + tb3);
		
		System.out.println("\n==================================\n");
		
		System.out.println("rb1 -->" + rb1);
		System.out.println("rb2 -->" + rb2);
	}

}
