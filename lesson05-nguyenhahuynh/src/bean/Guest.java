package bean;

public class Guest {
	private String idGuest;
	private String name;
	private String phone;
	private String address;
	
	public Guest() {
	}

	public Guest(String idGuest, String name, String phone, String address) {
		this.idGuest = idGuest;
		this.name = name;
		this.phone = phone;
		this.address = address;
	}

	public String getIdGuest() {
		return idGuest;
	}

	public void setIdGuest(String idGuest) {
		this.idGuest = idGuest;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
		return "Guest [idGuest=" + idGuest + ", name=" + name + ", phone=" + phone + ", address=" + address + "]";
	}
}
