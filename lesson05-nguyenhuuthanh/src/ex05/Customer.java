package ex05;

public class Customer {
	
	private String id;
	private String name;
	private String phoneNum;
	private String address;
	
	
	public Customer() {
		// TODO Auto-generated constructor stub
	}


	public Customer(String id, String name, String phoneNum, String address) {
		this.id = id;
		this.name = name;
		this.phoneNum = phoneNum;
		this.address = address;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getPhoneNum() {
		return phoneNum;
	}


	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", phoneNum=" + phoneNum + ", address=" + address + "]";
	}
	
	
	

}
