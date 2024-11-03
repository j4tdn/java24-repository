package bean;

public class TextBook extends Book {
	private String state;
	
	public TextBook() {
		// TODO Auto-generated constructor stub
	}

	public TextBook(int idBook, double price, String nXB, String state) {
		super(idBook, price, nXB);
		this.state = state;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	@Override
	public double tatolMoney() {
		return getPrice() - getPrice()*0.3;
	}
}
