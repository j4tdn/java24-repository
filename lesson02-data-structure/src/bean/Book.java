package bean;

public class Book {
	public char name;
	public int numberPage;
	public double price;
	
	public Book() {}
	
	public Book(char name, int numberPage, double price) {
		this.name = name;
		this.numberPage = numberPage;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return ("book [name = " + name + ", numberPage = " + numberPage + ", price = " + price + "]");
	}

	
}
