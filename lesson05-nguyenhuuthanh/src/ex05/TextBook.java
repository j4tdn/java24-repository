package ex05;

public class TextBook extends Book {
	private String status;

	public TextBook() {
		
	}

	public TextBook(String id, double price, String publisher, String status) {
		super(id, price, publisher);
		this.status = status;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "TextBook [status=" + status + ", getId()=" + getId() + ", getPrice()=" + getPrice()
				+ ", getPublisher()=" + getPublisher() + "]";
	}
	
	
	

}
