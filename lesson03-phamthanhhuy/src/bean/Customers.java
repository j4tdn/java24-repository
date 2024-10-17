package bean;

public class Customers {
	
	private String name;
	private Vehicles vehicle;
	
	
	public Customers() {
	}

	public Customers(String name, Vehicles vehicle) {
		this.name = name;
		this.vehicle = vehicle;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Vehicles getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicles vehicle) {
		this.vehicle = vehicle;
	}
	


	@Override
	public String toString() {
		return "Customers [name=" + name + ", vehicle=" + vehicle + "]";
	}
	
	




	

}
