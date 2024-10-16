package ex01_purchasing_problem;

public class Customer {

	private String idCard;
	private String fullName;
	private String phoneNumber;
	private String address;

	public Customer() {
	}

	public Customer(String idCard, String fullName, String phoneNumber, String address) {
		this.idCard = idCard;
		this.fullName = fullName;
		this.phoneNumber = phoneNumber;
		this.address = address;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getIdCard() {
		return idCard;
	}

	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Customer [idCard=" + idCard + ", fullName=" + fullName + ", phoneNumber=" + phoneNumber + ", address="
				+ address + "]";
	}

}
