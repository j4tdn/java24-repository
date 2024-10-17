package bean;

public class Customer {
	private String ownerName;

	public Customer() {
		// TODO Auto-generated constructor stub
	}

	public Customer(String ownerName) {
		super();
		this.ownerName = ownerName;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	@Override
	public String toString() {
		return "Customer [ownerName=" + ownerName + "]";
	}

}
