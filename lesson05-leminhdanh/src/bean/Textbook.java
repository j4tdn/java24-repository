package bean;

public class Textbook extends Book {
	private int status;

	public Textbook() {
	}

	public Textbook(String idBook, double price, String author, int status) {
		super("SGK"+idBook, price, author);
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
		return "Textbook [status=" + status + ", toString()=" + super.toString() + "]";
	}

}
