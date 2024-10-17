package Ex02;

public class Vehicle {

	private String vehicleOwnerName;
	private String vehicleType;
	private int capacity;
	private double vehiclePrice;

	public Vehicle() {
	}

	public Vehicle(String vehicleOwnerName, String vehicleType, int capacity, double vehiclePrice) {
		this.vehicleOwnerName = vehicleOwnerName;
		this.vehicleType = vehicleType;
		this.capacity = capacity;
		this.vehiclePrice = vehiclePrice;
	}

	public String getVehicleOwnerName() {
		return vehicleOwnerName;
	}

	public void setVehicleOwnerName(String vehicleOwnerName) {
		this.vehicleOwnerName = vehicleOwnerName;
	}

	public String getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public double getVehiclePrice() {
		return vehiclePrice;
	}

	public void setVehiclePrice(double vehiclePrice) {
		this.vehiclePrice = vehiclePrice;
	}

	@Override
	public String toString() {
		return "Tên chủ xe: " + vehicleOwnerName + ", loại xe: " + vehicleType + ", dung tích: "
				+ capacity + ", Trị giá: " + vehiclePrice;
	}
	
	public double taxPaypel() {
        if (capacity < 100) {
            return vehiclePrice * 0.01;
        } else if (capacity <= 200) {
            return vehiclePrice * 0.03;
        } else {
            return vehiclePrice * 0.05;
        }
    }

}