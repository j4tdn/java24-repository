package bean;

public class ReferenceBook extends Book {

	private Double TaxInPercent;
	
	public ReferenceBook() {
	}
	
	public ReferenceBook(String id, String name, Double price) {
		this(id, name, price, 0d);
	}
	
	public ReferenceBook(String id, String name, Double price, Double taxInPercent) {
		super(id, name, price);
		TaxInPercent = taxInPercent;
	}

	public Double getTaxInPercent() {
		return TaxInPercent;
	}

	public void setTaxInPercent(Double taxInPercent) {
		TaxInPercent = taxInPercent;
	}

	@Override
	public String toString() {
		return "ReferenceBook [TaxInPercent=" + TaxInPercent + ", getId()=" + getId() + ", getName()=" + getName()
				+ ", getPrice()=" + getPrice() + "]";
	}

}
