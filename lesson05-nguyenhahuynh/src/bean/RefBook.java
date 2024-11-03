package bean;

public class RefBook extends Book {

	private double tax;
	
	public RefBook() {

	}

	public RefBook(String idBook, double cost, String publisher, double tax) {
		super(idBook, cost, publisher);
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
		return "RefBook [tax=" + tax + ", getIdBook()=" + getIdBook() + ", getCost()=" + getCost() + ", getPublisher()="
				+ getPublisher() + "]";
	}
	
}
