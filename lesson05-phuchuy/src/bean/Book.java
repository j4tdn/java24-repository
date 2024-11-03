package bean;

public class Book {
	private String bookID;
	private Double price;
	private String pushlisher;

	public Book() {
		// TODO Auto-generated constructor stub
	}

	public Book(String bookID, Double price, String pushlisher) {
		this.bookID = bookID;
		this.price = price;
		this.pushlisher = pushlisher;
	}

	public Book(Double price, String pushlisher) {
		this.price = price;
		this.pushlisher = pushlisher;
	}

	public String getBookID() {
		return bookID;
	}

	public void setBookID(String bookID) {
		this.bookID = bookID;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getPushlisher() {
		return pushlisher;
	}

	public void setPushlisher(String pushlisher) {
		this.pushlisher = pushlisher;
	}

	@Override
	public String toString() {
		return "Book [bookID=" + bookID + ", price=" + price + ", pushlisher=" + pushlisher + "]";
	}

}
