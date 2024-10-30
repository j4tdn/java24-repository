package bean;

public class ReferenceBook extends Book{
	private Double taxInPecent;
	public ReferenceBook() {
		
	}
	
	public ReferenceBook(Double taxInPecent) {
		super();
		this.taxInPecent = taxInPecent;
	}
	public Double getTaxInPecent() {
		return taxInPecent;
	}
	public void setTaxInPecent(Double taxInPecent) {
		this.taxInPecent = taxInPecent;
	}
	@Override
	public String toString() {
		return "ReferenceBook [taxInPecent=" + taxInPecent + ", getId()=" + getId() + ", getName()=" + getName()
				+ ", getPrice()=" + getPrice() + "]";
	}

	

}
