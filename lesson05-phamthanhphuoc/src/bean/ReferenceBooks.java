package bean;

public class ReferenceBooks extends Book {
	private Double taxInPercent;

	 public ReferenceBooks() {
		// TODO Auto-generated constructor stub
	}

	public ReferenceBooks(Integer idBook, Double price, String nanufacturer, Double taxInPercent) {
		super(idBook, price, nanufacturer);
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
		return "ReferenceBooks [taxInPercent=" + taxInPercent + ", getIdBook()=" + getIdBook() + ", getPrice()="
				+ getPrice() + ", getNanufacturer()=" + getNanufacturer() + "]";
	}
	 
	 
	

}
