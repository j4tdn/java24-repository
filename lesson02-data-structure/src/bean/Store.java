package bean;

public class Store {
	public String name;
	public int openTime;
	public int closeTime;

	public Store() {
		// TODO Auto-generated constructor stub
	}

	public Store(String name, int openTime, int closeTime) {
		this.name = name;
		this.openTime = openTime;
		this.closeTime = closeTime;
	}

	@Override
	public String toString() {
		return "Store [name=" + name + ", openTime=" + openTime + ", closeTime=" + closeTime + "]";
	}

}
