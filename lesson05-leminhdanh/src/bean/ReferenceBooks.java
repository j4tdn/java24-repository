package bean;

public class ReferenceBooks extends Book {
	private Double tax;

	public ReferenceBooks() {
	}

	public ReferenceBooks(String idBook, double price, String author, Double tax) {
		super("STK"+idBook, price, author);
		this.tax = tax;
	}

	public Double getTax() {
		return tax;
	}

	public void setTax(Double tax) {
		this.tax = tax;
	}

	@Override
	public String toString() {
		return "ReferenceBooks [tax=" + tax + ", toString()=" + super.toString() + "]";
	}

}
