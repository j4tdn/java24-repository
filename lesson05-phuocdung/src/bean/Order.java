package bean;

public class Order {
	
	private Customers customer;
	private BookDetail books;
	
	public Order() {
		// TODO Auto-generated constructor stub
	}

	public Order(Customers customer, BookDetail books) {
		this.customer = customer;
		this.books = books;
	}

	public Customers getCustomer() {
		return customer;
	}

	public void setCustomer(Customers customer) {
		this.customer = customer;
	}

	public BookDetail getBooks() {
		return books;
	}

	public void setBooks(BookDetail books) {
		this.books = books;
	}

	@Override
	public String toString() {
		return "Order [customer=" + customer + ", books=" + books + "]";
	}
	
	
	
	
	

}
