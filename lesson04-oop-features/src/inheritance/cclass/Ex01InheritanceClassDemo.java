package inheritance.cclass;

import bean.ReferenceBook;
import bean.TestBook;

public class Ex01InheritanceClassDemo {
	/*
	 Giải lập bài toán về manager sách ở văn phòng phẩm
	 
	 Sách giáo khoa: mã sách, tên sách, giá bản, tình trạng (cũ, mới), phần % giảm giá
	 Sách tham khảo: mã sách, tên sách, giá bản, thuế xuất bản
	 
	 Yêu cầu: 
	 1. Tạo N đối tượng SGK, STK
	 2. Tìm những SGK cũ có % giảm giá lớn hơn 2
	 
	 
	 */
	
	public static void main(String[] args) {
		TestBook tb1 =  new TestBook("SGK-1","Toán",22d);
		TestBook tb2 =  new TestBook("SGK-2","Lịch Sử",14d);
		TestBook tb3 =  new TestBook("SGK-3","Khoa học tự nhiên",38d);
		
		ReferenceBook rb1 = new ReferenceBook(" STK-1","STK Toán", 220d, 4d);
		ReferenceBook rb1 = new ReferenceBook(" STK-1","STK Toán", 18-=0d, 1d);
				
		
	}

}
