package bean;

/*
 
 
  
 * */

public class Item {

	// thuộc tính
	public int id;
	public char name;
	public double salesPrice;
	
	public Item() {
		// TODO Auto-generated constructor stub
	}
	
	public Item(int pId, char pName, double pSalesPrice) {
		// TODO Auto-generated constructor stub
		this.id = pId;
		this.name = pName;
		this.salesPrice = pSalesPrice;
	}
	
//	this là ô nhớ trên HEAP
	
	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", salesPrice=" + salesPrice + "]";
	}
	
	
}
