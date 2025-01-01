package immutable;

public class Warehouse {
	
	private int id;
	private String address;
	
	public Warehouse() {
		// TODO Auto-generated constructor stub
	}

	public Warehouse(int id, String address) {
		super();
		this.id = id;
		this.address = address;
	}
	
	public String getAddress() {
		return address;
	}
	
	public int getId() {
		return id;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "WareHouse [id=" + id + ", address=" + address + "]";
	}
	
	
	
}
