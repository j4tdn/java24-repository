package ex02;

public class Tax {
	private Vehicle vehicle;
	private double submitTax;
	
	public Tax() {
		// TODO Auto-generated constructor stub
	}

	public Tax(Vehicle vehicle, double submitTax) {
		this.vehicle = vehicle;
		this.submitTax = submitTax;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public double getSubmitTax() {
		return submitTax;
	}

	public void setSubmitTax(double submitTax) {
		this.submitTax = submitTax;
	}

	@Override
	public String toString() {
		return "tax [vehicle=" + vehicle + ", submitTax=" + submitTax + "]";
	}
	
	
}
