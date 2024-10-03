package bean;

public class Item {
	public int itemId;
	public String name ;
	public double price;
	
	
	
	public Item() {
		
	}



	public Item(int itemId, String name, double price) {
		
		this.itemId = itemId;
		this.name = name;
		this.price = price;
	}



	@Override
	public String toString() {
		return "Item [itemId=" + itemId + ", name=" + name + ", price=" + price + "]";
	}
	
	
	
}
