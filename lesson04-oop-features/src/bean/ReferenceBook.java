package bean;

public class ReferenceBook extends Book {
	private String id;
	private String name;
	private Double price;
	private Double taxInPercent;
	
	
	public ReferenceBook(String id, String name, Double price, Double taxInPercent) {
		this.id = id;
		this.name = name;
		this.price = price;
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
		return "ReferenceBook [id=" + id + ", name=" + name + ", price=" + price + ", taxInPercent=" + taxInPercent
				+ "]";
	}
	
	
}
