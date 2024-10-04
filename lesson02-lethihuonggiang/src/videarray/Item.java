package videarray;


public class Item {
	public int id;
	public String name;
	public int salesPrice;
	
	public Item() {
		// TODO Auto-generated constructor stub
	}
	
	public Item(int id, String name, int salesPrice) {
		this.id = id;
		this.name = name;
		this.salesPrice = salesPrice;
	}



	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", salesPrice=" + salesPrice + "]";
	}
	

}
