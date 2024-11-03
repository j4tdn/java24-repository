package view;

import java.awt.Container;
import java.beans.Customizer;
import java.lang.reflect.Array;
import java.util.Arrays;

import bean.Book;
import bean.BookDetail;
import bean.Customers;
import bean.Order;
import bean.ReferBook;
import bean.TextBook;

public class Ex05 {

	public static void main(String[] args) {

		Book sgk1 = new TextBook("SGK-1", 40d, "Nhi Đồng", true);
		Book sgk2 = new TextBook("SGK-2", 60d, "Fahasa", false);
		Book sgk3 = new TextBook("SGK-3", 120d, "Phương Nam", true);

		Book stk1 = new ReferBook("STK-4", 80d, "Nhi Đồng");
		Book stk2 = new ReferBook("STK-5", 90d, "Đồng Khởi");

		Book[] books = { sgk1, sgk2, sgk3, stk1, stk2 };
		
		Customers c1 = new Customers("01","Tuấn","0905123456","Đà Nẵng");
		
		System.out.println("Những sách thuộc nhà xuất bản Kim Đồng");
		System.out.println(Arrays.toString(checkAuthor(books)));
		
		System.out.println("Những sách có đơn giá nhỏ hơn 50");
		System.out.println(Arrays.toString(checkPrice(books)));
		
		System.out.println("Những sách giáo khoa có đơn giá từ 100 đến 200");
		System.out.println(Arrays.toString(checkTextBook(books)));		
	}

	private static Book[] checkAuthor(Book[] books) {
		Book[] targetBooks = new Book[books.length];

		int i = 0;
		for (Book book : books) {
			if (book.getAuthor() == "Nhi Đồng") {
				targetBooks[i] = book;
				i++;
			}
		}
		return targetBooks;
	}

	private static Book[] checkPrice(Book[] books) {
		Book[] targetBooks = new Book[books.length];

		int i = 0;
		for (Book book : books) {
			if (book.getPrice() < 50) {
				targetBooks[i] = book;
				i++;
			}
		}
		return targetBooks;
	}

	private static Book[] checkTextBook(Book[] books) {
		Book[] targetBooks = new Book[books.length];

		int i = 0;
		for (Book book : books) {
			if (book instanceof TextBook && book.getPrice() > 100 && book.getPrice() < 200) {
				targetBooks[i] = book;
				i++;
			}
		}
		return targetBooks;
	}

}
