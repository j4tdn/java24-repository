package bean;

public class Customer {
	
	private int customerID;
	private String name;
	private String phoneNumber;
	private String address;
	
	public Customer() {
	}

	public Customer(int customerID, String name, String phoneNumber, String address) {
		this.customerID = customerID;
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.address = address;
	}

	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Customer [customerID=" + customerID + ", name=" + name + ", phoneNumber=" + phoneNumber + ", address="
				+ address + "]";
	}
}
