package bean;

public class Vehicle {
	private String type;
	private int engineDisp;
	private double cost;

	public Vehicle() {
		// TODO Auto-generated constructor stub
	}

	public Vehicle(String type, int engineDisp, double cost) {
		super();
		this.type = type;
		this.engineDisp = engineDisp;
		this.cost = cost;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getEngineDisp() {
		return engineDisp;
	}

	public void setEngineDisp(int engineDisp) {
		this.engineDisp = engineDisp;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "Vehicle [type=" + type + ", engineDisp=" + engineDisp + ", cost=" + cost + "]";
	}

}
