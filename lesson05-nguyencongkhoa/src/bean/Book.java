package bean;

public class Book {
	
	protected String bookID;
	protected int price;
	protected String nxb;
	
	public Book() {
	}

	public Book(String bookID, int price, String nxb) {
		super();
		this.bookID = bookID;
		this.price = price;
		this.nxb = nxb;
	}

	public String getBookID() {
		return bookID;
	}

	public void setBookID(String bookID) {
		this.bookID = bookID;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getNxb() {
		return nxb;
	}

	public void setNxb(String nxb) {
		this.nxb = nxb;
	}

	@Override
	public String toString() {
		return "Book [bookID=" + bookID + ", price=" + price + ", nxb=" + nxb + "]";
	}
}
	

	
