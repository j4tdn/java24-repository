package book;
import java.util.ArrayList;
import java.util.List;

import book.BookClasses;
import book.TextBook;
import book.ReferenceBook;
public class NewBooks {
	private List<BookClasses> books;
	public NewBooks() {
		this.books = new ArrayList<>();
		newBook();
	}
	
	private void newBook() {
		books.add(new TextBook("SGK01", 123,"Nhi Dong", true));
		books.add(new TextBook("SGK02", 40,"Kim Dong", false));
		books.add(new TextBook("SGK03", 200,"Nhi Dong", true));
		
		books.add(new ReferenceBook("STK01", 145,"Nhi Dong", 0.23));
		books.add(new ReferenceBook("STK02", 20,"Kim Dong", 0.1));
		
	}
	 
	
		
	}


