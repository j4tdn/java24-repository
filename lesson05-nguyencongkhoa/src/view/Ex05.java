package view;

import bean.Book;
import bean.ReferenceBook;
import bean.TextBook;

public class Ex05 {

	public static void main(String[] args) {

		TextBook tb1 = new TextBook("SGK1", 25, "Nhi Đồng", true);
		TextBook tb2 = new TextBook("SGK2", 55, "Kim Đồng", true);
		TextBook tb3 = new TextBook("SGK3", 30, "Nhi Đồng", false);

		ReferenceBook rf1 = new ReferenceBook("STK1", 50, "Nhi Đồng", 0.2);
		ReferenceBook rf2 = new ReferenceBook("STK1", 25, "Nhi Đồng", 0.5);

		Book[] books = new Book[] { tb1, tb2, tb3, rf1, rf2 };
		
		System.out.println("Toàn bộ sách thuộc nhà xuất bản Nhi Đồng:");
		findNXBNhiDong(books);
		
		System.out.println("\nToàn bộ sách có đơn giá nhỏ hơn 50:");
		findPriceLessThan50(books);
		
		System.out.println("\nToàn bộ sách giáo khoa có đơn giá từ 100 đến 200:");
		findSGKPriceRange100to200(books);
		
	}
	
	private static void findNXBNhiDong(Book[] books) {
		for (Book b : books) {
			if (b.getNxb().equals("Nhi Đồng")) {
				System.out.println(b);
			}
		}
	}
	
	private static void findPriceLessThan50(Book[] books) {
		for (Book b : books) {
			if (b.getPrice() < 50) {
				System.out.println(b);
			}
		}
	}
	
	private static void findSGKPriceRange100to200(Book[] books) {
		for (Book b : books) {
			if (b instanceof TextBook) {
				if (b.getPrice() >= 100 && b.getPrice() <= 200) {
					System.out.println(b);
				}
			}
		}
	}
}
