package bean;

public class Book {
	private String idBook;
	private double cost;
	private String publisher;
	
	public Book() {

	}

	public Book(String idBook, double cost, String publisher) {
		super();
		this.idBook = idBook;
		this.cost = cost;
		this.publisher = publisher;
	}

	public String getIdBook() {
		return idBook;
	}

	public void setIdBook(String idBook) {
		this.idBook = idBook;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	@Override
	public String toString() {
		return "Book [idBook=" + idBook + ", cost=" + cost + ", publisher=" + publisher + "]";
	}

}
