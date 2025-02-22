package bean;

public class Item {
	private String name;
	private int id;
	private double salePrices;
	
	public Item() {
	}

	public Item( int id, String name, double salePrices) {
		super();
		this.name = name;
		this.id = id;
		this.salePrices = salePrices;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getSalePrices() {
		return salePrices;
	}

	public void setSalePrices(double salePrices) {
		this.salePrices = salePrices;
	}

	@Override
	public String toString() {
		return "Item [name=" + name + ", id=" + id + ", salePrices=" + salePrices + "]";
	}
	
}
