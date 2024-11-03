package book;

public class ReferenceBook extends BookClasses {
	
	private double taxRate;

	public ReferenceBook(String bookId, double price, String publisher, double taxRate) {
		super(bookId, price, publisher);
		this.taxRate = taxRate;
	}

	@Override
	public double calculaterPrice() {
		return price*(1+taxRate);
	}

	public double getTaxRate() {
		return taxRate;
	}

	public void setTaxRate(double taxRate) {
		this.taxRate = taxRate;
	}

	@Override
	public String toString() {
		return "ReferenceBook [taxRate=" + (taxRate *100) +"%" + ", bookId=" + bookId + ", price=" + price + ", publisher="
				+ publisher + "]";
	}
	
	
	
	
	

}
