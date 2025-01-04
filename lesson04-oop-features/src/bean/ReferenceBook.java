package bean;

public class ReferenceBook extends Book{
	
	private Double taxInPercent;
	
	public ReferenceBook() {
	}

	public ReferenceBook(String id, String name, Double price, Double taxInPercent) {
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
		return "ReferenceBook [id=" + super.getId() + ", name=" + super.getName() + ", price=" + super.getPrice() + ", taxInPercent=" + taxInPercent
				+ "]";
	}
}