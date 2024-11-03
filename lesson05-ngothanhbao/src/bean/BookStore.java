package bean;

public abstract class BookStore {
	private String id;
	private Double price;
	private String publisher;
	private boolean isNew;
	private double tax;
	public abstract double totalPrice();

	public BookStore() {
		// TODO Auto-generated constructor stub
	}

	public BookStore(String id, Double price, String publisher, boolean isNew, double tax) {
		super();
		this.id = id;
		this.price = price;
		this.publisher = publisher;
		this.isNew = isNew;
		this.tax = tax;
	}
	
	

	public BookStore(String id, Double price, String publisher, double tax) {
		super();
		this.id = id;
		this.price = price;
		this.publisher = publisher;
		this.tax = tax;
	}

	public BookStore(String id, Double price, String publisher, boolean isNew) {
		super();
		this.id = id;
		this.price = price;
		this.publisher = publisher;
		this.isNew = isNew;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public boolean getNew() {
		return isNew;
	}

	public void setNew(boolean isNew) {
		this.isNew = isNew;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}

	@Override
	public String toString() {
		return "BookStore [id=" + id + ", price=" + price + ", publisher=" + publisher + ", isNew=" + isNew + ", tax="
				+ tax + "]";
	}
	
	
}
