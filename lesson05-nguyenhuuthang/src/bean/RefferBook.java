package bean;

public class RefferBook extends Book {
	private double tax;
	
	public RefferBook() {
		// TODO Auto-generated constructor stub
	}
	
	public RefferBook(int idBook, double price, String nXB, double tax) {
		super(idBook, price, nXB);
		this.tax = tax;
	}
	

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}

	@Override
	public double tatolMoney() {
//		đơn giá * (1 + %
//		thuế)
		return (getPrice() * (1 + getTax()));
	}
}
