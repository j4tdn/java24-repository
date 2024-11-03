package utils;

import bean.Book;
import bean.Customer;
import bean.ReferenceBooks;
import bean.Textbook;

public class BookUtils {
	public static void priceMaller50(Book[] books) {
		System.out.println("Sách có giá nhỏ hơn 50");
		System.out.println("id\tgiá");
		for(Book book:books) {
			if(book.getPrice() < 50) {
				System.out.println(book.getIdBook() + "\t" + book.getPrice());
			}
		}
	}
	public static void price100to200(Book[] books) {
		System.out.println("Sách có giá nhỏ hơn 50");
		System.out.println("id\tgiá");
		for(Book book:books) {
			if(book.getPrice() < 200&&book.getPrice()>100) {
				System.out.println(book.getIdBook() + "\t" + book.getPrice());
			}
		}
	}
	public static void calPrice(Customer p) {
		Double price = 0d;
		for(Book book:p.getBooks()) {
			if(book instanceof Textbook) {
				if(((Textbook) book).getStatus() == 1) {
					price += book.getPrice();
				}else {
					price += book.getPrice()*0.7;
				}
			}else if(book instanceof ReferenceBooks) {
				price += book.getPrice()*(1+((ReferenceBooks) book).getTax());
			}
		}
		System.out.println("so tien thanh toan la:" + price);
	}
	
}
