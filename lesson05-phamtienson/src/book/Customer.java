package book;

public class Customer {
private Integer customerId;
private String name;
private Integer phonenumber;
private String address;

public Customer() {
	
}

public Customer(Integer idcustom, String name, Integer phonenumber, String address) {
	super();
	this.customerId = idcustom;
	this.name = name;
	this.phonenumber = phonenumber;
	this.address = address;
}

public Integer getIdcustom() {
	return customerId;
}

public void setIdcustom(Integer idcustom) {
	this.customerId = idcustom;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public Integer getPhonenumber() {
	return phonenumber;
}

public void setPhonenumber(Integer phonenumber) {
	this.phonenumber = phonenumber;
}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}

@Override
public String toString() {
	return "Custom [customerId=" + customerId + ", name=" + name + ", phonenumber=" + phonenumber + ", address=" + address
			+ "]";
}


}
