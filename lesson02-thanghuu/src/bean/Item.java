package bean;

public class Item {

	public int MaHD;
	public String name;
	public double price;
	
	public Item() {
		// TODO Auto-generated constructor stub
	}

	
	
	public Item(int maHD, String name, double price) {
		this.MaHD = maHD;
		this.name = name;
		this.price = price;
	}



	@Override
	public String toString() {
		return "Item [MaHD=" + MaHD + ", name=" + name + ", price=" + price + "]";
	}
	
	
	
}
