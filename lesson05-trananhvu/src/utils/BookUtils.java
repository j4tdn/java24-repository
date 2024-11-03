package utils;

import bean.Book;

public class BookUtils {
	private BookUtils() {
	}

	public static void filterBookTo50(Book[] books) {
		System.out.println("\nSach co don gia nho hon 50: ");
		for (Book book : books) {
			if (book.getPrice() < 50) {
				System.out.println(book.toString());
			}
		}
	}

	public static void filterBookFrom100To200(Book[] books) {
		System.out.println("\nSach co don gia tu 100 den 200: ");
		for (Book book : books) {
			if (book.getPrice() > 100 && book.getPrice() < 200) {
				System.out.println(book.toString());
			}
		}
	}

	public static void filterBookNhiDong(Book[] books) {
		System.out.println("\nSach thuoc nha xuat ban Nhi Dong: ");
		for (Book book : books) {
			if (book.getPublisher().equals("Nhi Đồng")) {
				System.out.println(book.toString());
			}
		}
	}

	public static void export() {

	}
}
