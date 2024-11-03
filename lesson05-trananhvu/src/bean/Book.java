package bean;

public class Book {
	private int bookId;
	private double price;
	private String publisher;

	public Book() {
		// TODO Auto-generated constructor stub
	}

	public Book(int bookId, double price, String publisher) {
		this.bookId = bookId;
		this.price = price;
		this.publisher = publisher;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
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
		return "Book [bookId=" + bookId + ", price=" + price + ", publisher=" + publisher + "]";
	}

}
