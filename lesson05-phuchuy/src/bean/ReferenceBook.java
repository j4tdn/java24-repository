package bean;

public class ReferenceBook extends Book {
	private Double taxPercent;

	public ReferenceBook() {
		// TODO Auto-generated constructor stub
	}

	public ReferenceBook(Double price, String pushlisher, Double taxPercent) {
		super("STK", price, pushlisher);
		this.taxPercent = taxPercent;
	}

	public Double getTaxPercent() {
		return taxPercent;
	}

	public void setTaxPercent(Double taxPercent) {
		this.taxPercent = taxPercent;
	}

	@Override
	public String toString() {
		return "ReferenceBook [taxPercent=" + taxPercent + ", getBookID()=" + getBookID() + ", getPrice()=" + getPrice()
				+ ", getPushlisher()=" + getPushlisher() + "]";
	}

}
