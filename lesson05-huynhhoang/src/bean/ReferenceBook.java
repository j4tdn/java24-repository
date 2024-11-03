package bean;

public class ReferenceBook extends Book{

	private double tax;
	
	public ReferenceBook() {
	}

	public ReferenceBook(String id, double price, String publisher, double tax) {
		super(id, price, publisher);
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
		return "ReferenceBook [Id=" + getId() 
		+ ", Price=" + getPrice() 
		+ ", Publisher=" + getPublisher()
		+ ", Tax=" + getTax()	+ "]";
	}
	public double newPrice() {
		double price = this.getPrice() * (1 + this.tax);
		return price;
	}

	
}