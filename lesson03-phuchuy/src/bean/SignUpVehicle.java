package bean;

public class SignUpVehicle {
	private Customer customer;
	private Vehicle vehicle;

	public SignUpVehicle() {
		// TODO Auto-generated constructor stub
	}

	public SignUpVehicle(Customer customer, Vehicle vehicle) {
		super();
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
		return "SignUpVehicle [customer=" + customer + ", vehicle=" + vehicle + "]";
	}

}
