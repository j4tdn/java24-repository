package view;

import java.util.Set;

import bean.*;
public class Ex05 {
	public static void main(String[] args) {
		TextBook sgk1 = new TextBook(01, 150d, "Phạm Thanh Phước", true);
		TextBook sgk2 = new TextBook(02, 170d, "Phạm Thanh Phông", false);
		TextBook sgk3 = new TextBook(03, 190d, "Nhi Đồng", false);
		
		ReferenceBooks stk1 = new ReferenceBooks(01, 23d, "Phạm văn A", 1d);
		ReferenceBooks stk2 = new ReferenceBooks(02, 40d, "Phạm Văn B", 2d);
		ReferenceBooks stk3 = new ReferenceBooks(03, 140d, "Phạm Văn C", 3d);
		Book[] books = {sgk1,sgk2,sgk3,stk1,stk2,stk3};
		ind();
		unitPrice();
		
		
		
		
		
	}
	public static void ind() {
		for(Book book: books) {
			if(Book.getNanufacturer() == "Nhi Đồng") {
				System.out.println("bo sach co don gia nho hon 50 :" + Book);
			}
		}
	}
	public static void unitPrice() {
		for(Book book:books) {
			if(Book.getPrice() < 50) {
				System.out.println("bo sach co don gia nho hon 50 :" + Book);
			}
		}
		
	}
	

}
