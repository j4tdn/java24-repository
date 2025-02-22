package bean;

public class Store {
	private int id;
	private String name;
	private double salePrice;
	private int storeId;

	public Store() {
	}

	public Store(int id, String name, double salePrice, int storeId) {
		this.id = id;
		this.name = name;
		this.salePrice = salePrice;
		this.storeId = storeId;
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

	public double getSalePrice() {
		return salePrice;
	}

	public void setSalePrice(double salePrice) {
		this.salePrice = salePrice;
	}

	public int getStoreId() {
		return storeId;
	}

	public void setStoreId(int storeId) {
		this.storeId = storeId;
	}

	@Override
	public String toString() {
		return "id=" + id + ", name=" + name + ", salePrice=" + salePrice + ", storeId=" + storeId;
	}

}
