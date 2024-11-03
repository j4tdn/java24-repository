package bean;

public class ReferenceBook extends BookStore {
	

	public ReferenceBook() {
	}

	public ReferenceBook(String id, Double price, String publisher, double tax) {
		super(id, price, publisher, tax);
	}

	@Override
	public double totalPrice() {
		double total = this.getPrice() * (1 + this.getTax());
		return total;
	}
	
	@Override
	public String toString() {
		return "ReferenceBook Id=" + getId() + ",Price=" + getPrice() + ", Publisher=" + getPublisher()
				+ ", Tax=" + getTax() + "]";
	}
	
	

}
