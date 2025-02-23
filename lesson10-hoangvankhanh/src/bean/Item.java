package bean;

public class Item {
	private int id;
	private String name;
	private int salesPrice;
	private int idShop;
	
	public Item() {
		
	}
	
	public Item(int id, String name, int salesPrice, int idShop) {
		this.id = id;
		this.name = name;
		this.salesPrice = salesPrice;
		this.idShop = idShop;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalesPrice() {
		return salesPrice;
	}

	public void setSalesPrice(int salesPrice) {
		this.salesPrice = salesPrice;
	}

	public int getIdShop() {
		return idShop;
	}

	public void setIdShop(int idShop) {
		this.idShop = idShop;
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", salesPrice=" + salesPrice + ", idShop=" + idShop + "]";
	}
}
