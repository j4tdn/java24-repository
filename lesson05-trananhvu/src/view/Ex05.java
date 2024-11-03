package view;

import bean.Book;
import bean.ReferenceBook;
import bean.TextBook;
import utils.BookUtils;

public class Ex05 {
	public static void main(String[] args) {
		String[] publisherChoice = { "Nhi Đồng", "Trẻ", "Kim Đồng", "Tư pháp" };
		Book t1 = new TextBook(27, 60d, publisherChoice[0], 1);
		Book t2 = new TextBook(26, 22d, publisherChoice[3], 0);
		Book t3 = new TextBook(02, 42d, publisherChoice[0], 1);

		Book r1 = new ReferenceBook(7, 150d, publisherChoice[2], 0.1);
		Book r2 = new ReferenceBook(10, 130d, publisherChoice[0], 0.05);

		Book[] b = new Book[] { t1, t2, t3, r1, r2 };
		BookUtils.filterBookTo50(b);
		BookUtils.filterBookFrom100To200(b);
		BookUtils.filterBookNhiDong(b);
	}
}
