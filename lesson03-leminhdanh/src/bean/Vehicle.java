package bean;

public class Vehicle {
	private String name;
	private String type;
	private int capacity;
	private double price;
	
	public Vehicle() {
	}
	public Vehicle( String name, String type, int capacity, double price) {
		this.type = type;
		this.capacity = capacity;
		this.price = price;
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double tax() {
		double tax = 0;
		if (this.price <= 100) {
			tax = this.price * 0.01;
		} else if (this.price <= 200) {
			tax = this.price * 0.03;
		} else {
			tax = this.price * 0.05;
		}
		return tax;
	}
	
	public void export() {
		System.out.printf("%-20s %-20s %-15s %20.2f %20.2f\n", this.name, this.type, this.capacity, this.price, tax());
	}

	@Override
	public String toString() {
		return "Vehicle [type=" + type + ", capacity=" + capacity + ", price=" + price + ", name=" + name + "]";
	}

}
