package view;

import bean.Book;
import bean.ReferenceBooks;
import bean.Textbook;
import utils.BookUtils;

public class Ex05 {
	public static void main(String[] args) {
		Book tb1 = new Textbook("01", 20d, "Kim dong", 1);
		Book tb2 = new Textbook("02", 150d, "Kim lan", 0);
		Book tb3 = new Textbook("03", 100d, "Kim dong", 0);
		Book rb1 = new ReferenceBooks("01", 120d, "vu trong phung", 0.02d);
		Book rb2 = new ReferenceBooks("02", 154d, "Kim lan", 0.05d);

		Book[] books = new Book[] { tb1, tb2, tb3, rb1, rb2 };
		BookUtils.priceMaller50(books);
		BookUtils.price100to200(books);
	}
}
