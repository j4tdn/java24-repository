package inheritance.cclass;

import java.lang.ref.Reference;

import bean.ReferenceBook;
import bean.Textbook;

public class Ex01InheritanceClassDemo {
	public static void main(String[] args) {
		
		/*
		 
		 Giải lập bài toán về manage sách ở văn phòng phẩm
		 
		 Sách giáo khoa: mã sách, tên sách, giá bán, tình trạng(cũ mới), phần trăm giảm giá
		 Sách tham khảo: mã sách, tên sách, giá bán, thuế xuất bản
		 
		 Tạo ra class
		 Sách: mã sách, tên sách, giá bán
		 Sách giáo khoa extends Sách:  tình trạng(cũ mới), phần trăm giảm giá
		 Sách tham khảo extends Sách:  thuế xuất bản
		 
		 Yêu cầu:
		 1. Tạo N(100) đối tượng SGK, STK
		 2. Tìm những cuốn sách là SGK cũ có % giảm giá > 2
		 
		 */
		
		Textbook tb1 = new Textbook("SGK-1", "Toan", 22d);
		Textbook tb2 = new Textbook("SGK-2", "Lich su", 14d);
		Textbook tb3 = new Textbook("SGK-3", "Khoa hoc tu nhien", 38d);
		
		ReferenceBook rb1 = new ReferenceBook("STK-1", "STK Toan", 220d , 4d);
		ReferenceBook rb2 = new ReferenceBook("STK-2", "STK Ly", 1800d , 1d);
		
		System.out.println("tb1 --> " + tb1);
		System.out.println("tb2 --> " + tb2);
		System.out.println("tb3 --> " + tb3);
		
		System.out.println("\n=======================");
		
		System.out.println("rb1 --> "+ rb1);
		System.out.println("rb2 --> "+ rb2);
	}
}	
