package bean;

public class Customer {
	private String name;
	private String model;
	private int capacity;
	private long price;
	private long tax;
	
	public Customer() {
	}
	
	
	public Customer(String name, String model, int capacity, long price) {
		super();
		this.name = name;
		this.model = model;
		this.capacity = capacity;
		this.price = price;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	  
	public String getModel() {
		return model;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public int getCapacity() {
		return capacity;
	}
	
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	
	public long getPrice() {
		return price;
	}
	
	public void setPrice(long price) {
		this.price = price;
	}
	
	public long getTax() {
		return tax;
	}
	
	public void setTax(long capacity, long price) {
		if (this.capacity < 100) {
			this.tax = (long) (0.01 * this.price);
		} else if (this.capacity < 200) {
			this.tax = (long) (0.03 * this.price);
		} else {
			this.tax = (long) (0.05 * this.price);
		}
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", model=" + model + ", capacity=" + capacity + ", price=" + price + ", tax="
				+ tax + "]";
	}
	
}
