package bean;

public class TextBook extends Book {
	private boolean status;

	public TextBook() {
	}

	public TextBook(String id, double price, String publisher, boolean status) {
		super(id, price, publisher);
		this.status = status;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "TextBook [Id=" + getId() 
		+ ", Price=" + getPrice() 
		+ ", Publisher=" + getPublisher()
		+ ",status=" + isStatus() + "]";
	}
	
	public double newPrice() {
		double price = 0;
		if(this.status == false) {
			price= this.getPrice() * 0.7;
		}
		return price;
	}

}