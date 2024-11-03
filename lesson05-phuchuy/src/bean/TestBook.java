package bean;

public class TestBook extends Book {
	private Boolean isNew;

	public TestBook() {
		// TODO Auto-generated constructor stub
	}

	public TestBook(Double price, String pushlisher, Boolean isNew) {
		super("SGK", price, pushlisher);
		this.isNew = isNew;

	}

	public Boolean getIsNew() {
		return isNew;
	}

	public void setIsNew(Boolean isNew) {
		this.isNew = isNew;
	}

	@Override
	public String toString() {
		return "TestBook [isNew=" + isNew + ", getBookID()=" + getBookID() + ", getPrice()=" + getPrice()
				+ ", getPushlisher()=" + getPushlisher() + "]";
	}

}
