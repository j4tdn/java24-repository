package bean;

public class ReferenceBook extends Book{
	
	private double tax;
	
	public ReferenceBook() {
	}

	public ReferenceBook(String bookID, int price, String nxb, double tax) {
		super(bookID, price, nxb);
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
		return "ReferenceBook [bookID=" + bookID + ", price=" + price + ", nxb=" + nxb + ", tax=" + tax + "]";
	}
}
