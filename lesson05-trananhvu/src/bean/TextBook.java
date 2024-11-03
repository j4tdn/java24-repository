package bean;

public class TextBook extends Book {
	private int status;

	public TextBook() {
		// TODO Auto-generated constructor stub
	}

	public TextBook(int bookId, double price, String publisher, int status) {
		super(bookId, price, publisher);
		this.status = status;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "TextBook [status=" + status + ", getBookId()=" + getBookId() + ", getPrice()=" + getPrice()
				+ ", getPublisher()=" + getPublisher() + "]";
	}

}
