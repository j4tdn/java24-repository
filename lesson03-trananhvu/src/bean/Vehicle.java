package bean;

public class Vehicle {
	private String model;
	private int capacity;
	private double cost;
	private double tax;

	public Vehicle() {
		// TODO Auto-generated constructor stub
	}

	public Vehicle(String model, int capacity, double cost) {
		super();
		this.model = model;
		this.capacity = capacity;
		this.cost = cost;
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

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public double getTax() {
		if (this.getCapacity() < 100)
			tax = this.getCost() * 0.01;
		else if (this.getCapacity() <= 200)
			tax = this.getCost() * 0.03;
		else
			tax = this.getCost() * 0.05;
		return tax;
	}

	@Override
	public String toString() {
		return "Vehicle [model=" + model + ", capacity=" + capacity + ", cost=" + cost + "]";
	}

}
