package bean;

public class Item {
	// thuộc tính (nằm trong ô nhớ)
	public int id;
	public char name;
	public double salesPrice;

	public Item() {
	}

	// Item item3 = new Item(3, 'A', 33d)
	public Item(int pId, char pName, double pSalesPrice) {
		this.id = pId;
		this.name = pName;
		this.salesPrice = pSalesPrice;

	}

	@Override
	public String toString() {
		return "Item [id=" + this.id + ", name=" + this.name + ", salesPrice=" + this.salesPrice + "]";
	}

	// ctrl + d: xóa nhanh 1 dòng

}
