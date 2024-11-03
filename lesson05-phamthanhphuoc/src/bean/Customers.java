package bean;

public class Customers {
	private Integer Id;
	private String FullName;
	private Integer Phone;
	private String Address;
	
	public Customers() {
		// TODO Auto-generated constructor stub
	}

	public Customers(Integer id, String fullName, Integer phone, String address) {
		Id = id;
		FullName = fullName;
		Phone = phone;
		Address = address;
	}

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getFullName() {
		return FullName;
	}

	public void setFullName(String fullName) {
		FullName = fullName;
	}

	public Integer getPhone() {
		return Phone;
	}

	public void setPhone(Integer phone) {
		Phone = phone;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	@Override
	public String toString() {
		return "Customers [Id=" + Id + ", FullName=" + FullName + ", Phone=" + Phone + ", Address=" + Address + "]";
	}
	
	
	
	
	

}
