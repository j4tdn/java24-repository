package bean;

public class Customer {
	private String cusID;
	private String fullName;
	private String phoneNumber;
	private String adddress;

	public Customer() {
		// TODO Auto-generated constructor stub

	}

	public Customer(String cusID, String fullName, String phoneNumber, String adddress) {
		this.cusID = cusID;
		this.fullName = fullName;
		this.phoneNumber = phoneNumber;
		this.adddress = adddress;
	}

	public String getCusID() {
		return cusID;
	}

	public void setCusID(String cusID) {
		this.cusID = cusID;
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

	public String getAdddress() {
		return adddress;
	}

	public void setAdddress(String adddress) {
		this.adddress = adddress;
	}

	@Override
	public String toString() {
		return "Customer [cusID=" + cusID + ", fullName=" + fullName + ", phoneNumber=" + phoneNumber + ", adddress="
				+ adddress + "]";
	}

}
