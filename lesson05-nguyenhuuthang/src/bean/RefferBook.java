package bean;

public class RefferBook extends Book {
	private String state;
	
	public RefferBook() {
		// TODO Auto-generated constructor stub
	}
	
	public RefferBook(int idBook, double price, String nXB, String state) {
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
		// TODO Auto-generated method stub
		return 0;
	}
}
