package ex02_manage_vehicle_purchase_registration;

public class Vehicle {

	private String vehicleOwnerName;
	private String typeOfVehicle;
	private Integer capacity;
	private Double price;

	public Vehicle() {
	}

	public Vehicle(String vehicleOwnerName, String typeOfVehicle, Integer capacity, Double price) {
		this.vehicleOwnerName = vehicleOwnerName;
		this.typeOfVehicle = typeOfVehicle;
		this.capacity = capacity;
		this.price = price;
	}

	public String getVehicleOwnerName() {
		return vehicleOwnerName;
	}

	public void setVehicleOwnerName(String vehicleOwnerName) {
		this.vehicleOwnerName = vehicleOwnerName;
	}

	public String getTypeOfVehicle() {
		return typeOfVehicle;
	}

	public void setTypeOfVehicle(String typeOfVehicle) {
		this.typeOfVehicle = typeOfVehicle;
	}

	public Integer getCapacity() {
		return capacity;
	}

	public void setCapacity(Integer capacity) {
		this.capacity = capacity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Double getTax(Double capacity) {
		if (capacity == null) {
			return null;
		}
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
		return String.format(" %-30s %-20s %-20s %-20.2f %-17.2f", 
				this.getVehicleOwnerName(), this.getTypeOfVehicle(),
				this.getCapacity(), this.getPrice(), this.getTax(this.getPrice()));
	}

}
