package bean;

public class TextBook extends Book {

	private String status;
	
	public TextBook() {
		
	}

	public TextBook(String idBook, double cost, String publisher, String status) {
		super(idBook, cost, publisher);
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
		return "TextBook [status=" + status + ", getIdBook()=" + getIdBook() + ", getCost()=" + getCost()
				+ ", getPublisher()=" + getPublisher() + "]";
	}
}
