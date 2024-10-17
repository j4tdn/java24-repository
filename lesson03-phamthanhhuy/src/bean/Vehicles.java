package bean;

public class Vehicles {
	
	private String name;
	private int xilanh;
	private double cost;
	
	public Vehicles() {
	}
	

	public Vehicles(String name, int xilanh, double cost) {
		this.name = name;
		this.xilanh = xilanh;
		this.cost = cost;
	}
	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getXilanh() {
		return xilanh;
	}

	public void setXilanh(int xilanh) {
		this.xilanh = xilanh;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}


	@Override
	public String toString() {
		return "Vehicle [name=" + name + ", xilanh=" + xilanh + ", cost=" + cost + "]";
	}
	

	

}
