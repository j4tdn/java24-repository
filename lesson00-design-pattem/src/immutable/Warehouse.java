package immutable;

public class Warehouse {
	private int id;
	private String address;
	public Warehouse() {
	}
	public Warehouse(int id, String address) {
		this.id = id;
		this.address = address;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Warehouse [id=" + id + ", address=" + address + "]";
	}
	

}
