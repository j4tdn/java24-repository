package bean;

public abstract class Book implements IBook{
	private int  idBook;
	private double price;
	private String NXB;
	
	public Book() {
		// TODO Auto-generated constructor stub
	}

	public Book(int idBook, double price, String nXB) {
		super();
		this.idBook = idBook;
		this.price = price;
		NXB = nXB;
	}

	public int getIdBook() {
		return idBook;
	}

	public void setIdBook(int idBook) {
		this.idBook = idBook;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getNXB() {
		return NXB;
	}

	public void setNXB(String nXB) {
		NXB = nXB;
	}
	
	
}
