package ex05;

public class Customer {
	private int customerCode;
	private String nameCustomer;
	private String phoneNumber;
	private String address;
	
	public Customer() {
		
	}

	public Customer(int customerCode, String nameCustomer, String phoneNumber, String address) {
		super();
		this.customerCode = customerCode;
		this.nameCustomer = nameCustomer;
		this.phoneNumber = phoneNumber;
		this.address = address;
	}

	public int getCustomer() {
		return customerCode;
	}

	public void setCustomerCode(int customerCode) {
		this.customerCode = customerCode;
	}

	public String getNameCustomer() {
		return nameCustomer;
	}

	public void setNameCustomer(String nameCustomer) {
		this.nameCustomer = nameCustomer;
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
		return "Customer [customeCoder=" + customerCode + ", nameCustomer=" + nameCustomer + ", phoneNumber=" + phoneNumber
				+ ", address=" + address + "]";
	}
	
	
}
