package bean;

public class Book {

	private String code;
	private Double price;
	private String author;

	public Book() {
		
	}

	public Book(String code, Double price, String author) {
		this.code = code;
		this.price = price;
		this.author = author;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
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
		return "Book [code=" + code + ", price=" + price + ", author=" + author + "]";
	}

	
}
