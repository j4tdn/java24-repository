package bean;

public class TextBook extends Book {
	
	private boolean Status;
	
	public TextBook() {
		// TODO Auto-generated constructor stub
	}

	public TextBook(Integer idBook, Double price, String nanufacturer, boolean status) {
		super(idBook, price, nanufacturer);
		Status = status;
	}

	public boolean isStatus() {
		return Status;
	}

	public void setStatus(boolean status) {
		Status = status;
	}

	@Override
	public String toString() {
		return "TextBook [Status=" + Status + ", getIdBook()=" + getIdBook() + ", getPrice()=" + getPrice()
				+ ", getNanufacturer()=" + getNanufacturer() + "]";
	}
	

	
	

	

}
