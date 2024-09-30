package bean;

public class Item {
	public int id; 
	public char name;
	public double salesPrice;
	public Item( ) {
	}
	
	public Item(int pId, char pName, double pSalesPrice) {
		this.id = pId;
		this.name = pName;
		this.salesPrice = pSalesPrice;
	}
	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", salesPrice=" + salesPrice + "]";
	}
	
}
