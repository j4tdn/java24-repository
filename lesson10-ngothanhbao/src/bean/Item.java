package bean;

public class Item {
	private int id;
	private String name;
	private double price;
	private int idStore;
	
	public Item() {
	}

	public Item(int id, String name, double price, int idStore) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.idStore = idStore;
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

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getIdStore() {
		return idStore;
	}

	public void setIdStore(int idStore) {
		this.idStore = idStore;
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", price=" + price + ", idStore=" + idStore + "]";
	}
	
	
	
}
