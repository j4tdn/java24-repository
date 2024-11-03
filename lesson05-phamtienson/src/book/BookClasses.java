package book;

public abstract class BookClasses {
	String bookId;
	double price;
	String publisher;
	
	public BookClasses(String bookId, double price, String publisher) {
		super();
		this.bookId = bookId;
		this.price = price;
		this.publisher = publisher;
	}

	public abstract double calculaterPrice();
	
	public String getBookId() {
		return bookId;
	}

	public void setBookId(String bookId) {
		this.bookId = bookId;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	@Override
	public String toString() {
		return "BookClasses [bookId=" + bookId + ", price=" + price + ", publisher=" + publisher + "]";
	}
	
	
	

}

