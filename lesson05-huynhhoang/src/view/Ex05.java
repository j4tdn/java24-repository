package view;

import bean.Book;
import bean.ReferenceBook;
import bean.TextBook;


public class Ex05 {
	public static void main(String[] args) {
		TextBook tb1 = new TextBook("SGK1", 30, "Nhi Dong", false);
		TextBook tb2 = new TextBook("SGK2", 150, "Kim Dong", true);
		TextBook tb3 = new TextBook("SGK3", 200, "Nhi Dong", false);
		
		ReferenceBook rf1 = new ReferenceBook("STK1", 60, "Nhi Dong", 5);
		ReferenceBook rf2 = new ReferenceBook("STK2", 90, "Kim Dong", 5);
				
		Book[] books = {tb1,tb2,tb3,rf1,rf2};
		
		for(Book book: books) {
			if(book.getPublisher()=="Nhi Dong") {
				System.out.println("Sach  Nhi Dong \n"+ book);
			}
		}
		for (Book book : books) {
			if(book.getPrice()< 50) {
				System.out.println("sach co don gia nho hon 50 \n"+ book);
			}
		}
		for(Book book: books) {
			if(book instanceof TextBook textbook) {
				if(textbook.getPrice() >= 100 && textbook.getPrice() <=200) {
					System.out.println(textbook);
				}
			}
		}	
		
		Book[] book2 = {tb1,tb2};
		double result =0 ;
		for (Book book : book2) {
			result = result  + book.getPrice();
		}
		System.out.println(result);
		
		
	}
}
