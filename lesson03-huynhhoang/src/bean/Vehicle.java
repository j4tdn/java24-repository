package bean;

public class Vehicle {
	private String ownerName;
	private String vehicleType;
	private int engineCapacity;
	private double vehicleValue;

	public Vehicle() {
		// TODO Auto-generated constructor stub
	}

	public Vehicle(String ownerName, String vehicleType, int engineCapacity, double vehicleValue) {
		this.ownerName = ownerName;
		this.vehicleType = vehicleType;
		this.engineCapacity = engineCapacity;
		this.vehicleValue = vehicleValue;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

	public int getEngineCapacity() {
		return engineCapacity;
	}

	public void setEngineCapacity(int engineCapacity) {
		this.engineCapacity = engineCapacity;
	}

	public double getVehicleValue() {
		return vehicleValue;
	}

	public void setVehicleValue(double vehicleValue) {
		this.vehicleValue = vehicleValue;
	}

	@Override
	public String toString() {
		return "Vehicle [ownerName=" + ownerName + ", vehicleType=" + vehicleType + ", engineCapacity=" + engineCapacity
				+ ", vehicleValue=" + vehicleValue + "]";
	}
	
	
	public double caculateTax() {
		if(engineCapacity < 100) {
			return vehicleValue * 0.01;
		}else if(engineCapacity >= 100 && engineCapacity < 200) {
			return vehicleValue * 0.03;
		}else {
			return vehicleValue * 0.05;
		}
	}
}
