package bean;

public class Item {

	// thuộc tính
	public int id;
	public char name;
	public double salesPrice;

	/*
	 * Trong class Mặc định constructor sẽ khởi tạo rỗng 1 hàm
	 */
	public Item() {

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
