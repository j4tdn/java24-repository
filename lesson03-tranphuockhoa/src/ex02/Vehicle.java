package ex02;

public class Vehicle {

	private String ownerName;
	private String type;
	private int capacity;
	private double price;

	public Vehicle() {
	}

	public Vehicle(String ownerName, String type, int capacity, double price) {
		super();
		this.ownerName = ownerName;
		this.type = type;
		this.capacity = capacity;
		this.price = price;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
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

	public double calculateTax() {
		if (capacity < 100) {
			return price * 0.01;
		} else if (capacity <= 200) {
			return price * 0.03;
		} else {
			return price * 0.05;
		}
	}

	@Override
	public String toString() {
	    return String.format("%-20s || %-15s || %15d || %15.2f || %15.2f", 
	            ownerName, type, capacity, price, calculateTax());
	}

}
