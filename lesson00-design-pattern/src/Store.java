
public class Store {
	
	private final int id;
	private final String name;
	private final String address;

	public Store(int id, String name, String address) {
		this.id = id;
		this.name = name;
		this.address = address;
	}
	
	public int getId() {
		return id;
	}
	
	public String getAddress() {
		return address;
	}
	
	public String getName() {
		return name;
	}
	
	
	
}
