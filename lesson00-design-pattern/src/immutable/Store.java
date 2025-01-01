package immutable;

public final class Store { // class có final thì k thể thừa kế

	private final int id;
	private final String name;
	private final String address;

	public Store(int id, String name, String address) {
		this.id = id;
		this.name = name;
		this.address = address;
	}

	public String getAddress() {
		return address;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Store [id=" + id + ", name=" + name + ", address=" + address + "]";
	}

}
