package view;

import bean.BookStore;
import bean.Customer;
import bean.ReferenceBook;
import bean.TextBook;

public class Ex05BookManage {
	public static void main(String[] args) {
		BookStore[] books = bookData();
		findPub(books);
		System.out.println("===============================");
		findPrice(books);
		System.out.println("===============================");
		findPriceBetween(books);
		
	}
	public static BookStore[] bookData() {
		TextBook tx1 = new TextBook("SGK Hoa", 30d, "Kim Dong", false);
		TextBook tx2 = new TextBook("SGK Ly", 144d, "Dung", true);
		TextBook tx3 = new TextBook("SGK Anh", 70d, "Nhi Dong", false);

		ReferenceBook rf1 = new ReferenceBook("STK Hoa", 220d, "Kim Dong", 0.3);
		ReferenceBook rf2 = new ReferenceBook("STK Ly", 150d, "Nhi Dong", 0.2);
		return new BookStore[] {tx1,tx2,tx3,rf1,rf2};
	}
	
	public static void findPub(BookStore[] books) {
		for(BookStore book: books) {
			if(book.getPublisher().contains("Kim Dong")) {
				System.out.println("Sach nha xuat ban Kim Dong la: " + book);
			}
		}
	}
	
	public static void findPrice(BookStore[] books) {
		for(BookStore book: books) {
			if(book.getPrice() < 50) {
				System.out.println("Sach co gia nho hon 50 la: " + book);
			}
		}
	}
	
	public static void findPriceBetween(BookStore[] books) {
		for(BookStore book: books) {
			if(book.getId().contains("SGK ") && book.getPrice() < 200 && book.getPrice() > 100) {
				System.out.println("Sach Giao Khoa co gia khoang 100 den 200 la " + book);
			}
		}
	}
	
	
}
