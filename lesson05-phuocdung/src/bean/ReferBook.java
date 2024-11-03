package bean;

public class ReferBook extends Book {
	
	private Double tax;
	
	public ReferBook() {

	}

	public ReferBook(String code, Double price, String author) {
		super(code, price, author);
	}

	public Double getTax() {
		return getPrice() * 0.01;
	}

	@Override
	public String toString() {
		return "ReferBook [tax=" + tax + ", getCode()=" + getCode() + ", getPrice()=" + getPrice() + ", getAuthor()="
				+ getAuthor() + "]";
	}
	
	

}
