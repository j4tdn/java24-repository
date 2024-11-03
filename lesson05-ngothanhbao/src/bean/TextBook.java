package bean;

public class TextBook extends BookStore {

	public TextBook() {
	}

	public TextBook(String id, Double price, String publisher, boolean isNew) {
		super(id, price, publisher, isNew);
	}

	@Override
	public double totalPrice() {
		double total = 0;
		if(this.getNew() == false) {
			return total = this.getPrice() * 30 / 100;
		} else {
			total = this.getPrice();
		}
		return total;
	}
	
	@Override
	public String toString() {
		return "TextBook Id=" + getId() + ", Price=" + getPrice() + ", Publisher=" + getPublisher()
				+ ", New=" + getNew() + "]";
	}
	
	
	

}
