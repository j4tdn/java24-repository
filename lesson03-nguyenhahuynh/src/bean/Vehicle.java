package bean;

public class Vehicle {

	private String name;
	private String typeVehicle;
	private int capacity;
	private double cost;
	
	public Vehicle() {
	}

	public Vehicle(String name, String typeVehicle, int capacity, double cost) {
		this.name = name;
		this.typeVehicle = typeVehicle;
		this.capacity = capacity;
		this.cost = cost;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTypeVehicle() {
		return typeVehicle;
	}

	public void setTypeVehicle(String typeVehicle) {
		this.typeVehicle = typeVehicle;
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

	@Override
	public String toString() {
		return "Vehicle [name=" + name + ", typeVehicle=" + typeVehicle + ", capacity=" + capacity + ", cost=" + cost
				+ "]";
	}

	
}
