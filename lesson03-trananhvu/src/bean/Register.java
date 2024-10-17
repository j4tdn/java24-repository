package bean;

public class Register {
	private Customer customer;
	private Vehicle vehicle;

	public Register() {
		// TODO Auto-generated constructor stub
	}

	public Register(Customer customer, Vehicle vehicle) {
		this.customer = customer;
		this.vehicle = vehicle;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	@Override
	public String toString() {
		return "Register [customer=" + customer + ", vehicle=" + vehicle + "]";
	}

}
