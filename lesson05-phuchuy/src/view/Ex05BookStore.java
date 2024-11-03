package view;

import java.util.Arrays;

import bean.Book;
import bean.Customer;
import bean.ReferenceBook;
import bean.Simulating;
import bean.TestBook;

public class Ex05BookStore {
	public static void main(String[] args) {
		Customer c1 = new Customer("112", "Nguyen Huy", "090239120", "Da Nang");

		TestBook t1 = new TestBook(28d, "Van A", true);
		TestBook t2 = new TestBook(40d, "Thu Hoai", false);
		TestBook t3 = new TestBook(50d, "To Huu", true);
		ReferenceBook r1 = new ReferenceBook(101d, "Toan Hoc", 0.3d);
		ReferenceBook r2 = new ReferenceBook(150d, "Kim Dong", 0.2d);

		Book[] books = new Book[] { t1, t2, t3, r1, r2 };

		System.out.println(Arrays.toString(findPublisher(books)));
		System.out.println(Arrays.toString(findRangeBookPrice(books)));
		Simulating s1 = new Simulating(c1, r2, t3);
		System.out.println(s1);
		System.out.println("Thanh tien: " + Simulating.totalOfMoney(c1, t3, r2));

	}

	private static Book[] findPublisher(Book[] books) {
		Book[] result = new Book[books.length];
		int count = 0;
		for (Book book : books) {
			if (book.getPushlisher().equals("Kim Dong")) {
				result[count] = book;
				count++;
			}
		}
		return Arrays.copyOfRange(result, 0, count);
	}

	private static Book[] findPrice(Book[] books) {
		Book[] result = new Book[books.length];
		int count = 0;

		for (Book book : books) {
			if (book.getPrice() < 50d) {
				result[count] = book;
				count++;
			}
		}
		return Arrays.copyOfRange(result, 0, count);
	}

	private static Book[] findRangeBookPrice(Book[] books) {
		Book[] result = new Book[books.length];
		int count = 0;
		for (Book book : books) {
			if (book.getPrice() >= 100 && book.getPrice() < 200) {
				result[count] = book;
				count++;
			}
		}
		return Arrays.copyOfRange(result, 0, count);
	}

}
