package bean;

public class Simulating {
	private Customer cus;
	private ReferenceBook refBook;
	private TestBook testBook;

	public Simulating() {
		// TODO Auto-generated constructor stub
	}

	public Simulating(Customer cus, ReferenceBook refBook, TestBook testBook) {
		this.cus = cus;
		this.refBook = refBook;
		this.testBook = testBook;
	}

	public Simulating(Customer cus, TestBook testBook) {
		this.cus = cus;
		this.testBook = testBook;
	}

	public Simulating(Customer cus, ReferenceBook refBook) {
		this.cus = cus;
		this.refBook = refBook;
	}

	public static Double totalOfMoney(Customer cus, TestBook testBook, ReferenceBook refBook) {
		double testBookCost;
		if (!testBook.getIsNew()) {
			testBookCost = testBook.getPrice() * 0.7;
		} else {
			testBookCost = testBook.getPrice();
		}
		double refBookCost = refBook.getPrice() * (1 + refBook.getTaxPercent());
		return refBookCost + testBookCost;
	}

	@Override
	public String toString() {
		return "Simulating [cus=" + cus + ", refBook=" + refBook + ", testBook=" + testBook + "]";
	}

}
