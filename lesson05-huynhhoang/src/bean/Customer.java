package bean;

public class Customer {
	private Integer customerCode ;
	private String fullName;
	private String phone;
	private String address;
	
	public Customer() {
		
	}
	public Customer(Integer customerCode, String fullName, String phone, String address) {
		
		this.customerCode = customerCode;
		this.fullName = fullName;
		this.phone = phone;
		this.address = address;
	}
	public Integer getCustomerCode() {
		return customerCode;
	}
	public void setCustomerCode(Integer customerCode) {
		this.customerCode = customerCode;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Customer [customerCode=" + customerCode + ", fullName=" + fullName + ", phone=" + phone + ", address="
				+ address + "]";
	}
	
	
}
