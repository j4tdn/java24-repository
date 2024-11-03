package bean;

public class TextBook extends Book {
	
	private boolean isNew;
	
	public TextBook() {
	}

	public TextBook(String bookID, int price, String nxb, boolean isNew) {
		super(bookID, price, nxb);
		this.isNew = isNew;
	}

	public boolean getNew() {
		return isNew;
	}

	public void setNew(boolean isNew) {
		this.isNew = isNew;
	}

	@Override
	public String toString() {
		return "TextBook [bookID=" + bookID + ", price=" + price + ", nxb=" + nxb + ", isNew=" + isNew + "]";
	}
}
