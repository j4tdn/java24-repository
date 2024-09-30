package bean;

public class Item {

	// thuộc tính 
	public int id;
	public char name;
	public double salesPrice;
	
	public Item() {
		
	}
	
	public Item(int id, char name, double salesPrice) {
		this.id = id;
		this.name = name;
		this.salesPrice = salesPrice;
	}
	
	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", salesPrice=" + salesPrice + "]";
	}
	
}