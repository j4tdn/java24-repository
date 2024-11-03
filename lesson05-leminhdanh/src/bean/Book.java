package bean;

public class Book {
	private String idBook;
	private double price;
	private String author;

	public Book() {
	}

	public Book(String idBook, double price, String author) {
		this.idBook = idBook;
		this.price = price;
		this.author = author;
	}

	public String getIdBook() {
		return idBook;
	}

	public void setIdBook(String idBook) {
		this.idBook = idBook;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "Book [idBook=" + idBook + ", price=" + price + ", author=" + author + "]";
	}

}
