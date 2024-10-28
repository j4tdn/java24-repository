package bean;

public class ReferBook extends Book {
	
	private Double taxInPercent;
	
	public ReferBook() {
	}

	public ReferBook(String id, String name, Double price, Double taxInPercent) {
		super(id, name, price);
		this.taxInPercent = taxInPercent;
	}

	public Double getTaxInPercent() {
		return taxInPercent;
	}

	public void setTaxInPercent(Double taxInPercent) {
		this.taxInPercent = taxInPercent;
	}

	@Override
	public String toString() {
		return "ReferBook [taxInPercent=" + taxInPercent + ", getId()=" + getId() + ", getName()=" + getName()
				+ ", getPrice()=" + getPrice() + "]";
	}
	
	
	


}
