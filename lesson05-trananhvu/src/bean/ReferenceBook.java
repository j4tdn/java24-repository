package bean;

public class ReferenceBook extends Book {
	private double tax;

	public ReferenceBook() {
		// TODO Auto-generated constructor stub
	}

	public ReferenceBook(int bookId, double price, String publisher, double tax) {
		super(bookId, price, publisher);
		this.tax = tax;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}

	@Override
	public String toString() {
		return "ReferenceBook [tax=" + tax + ", getBookId()=" + getBookId() + ", getPrice()=" + getPrice()
				+ ", getPublisher()=" + getPublisher() + "]";
	}

}
