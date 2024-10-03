package bean;

public class Store {
	
	public char name;
	public int openingTime;
	public int closingTime;
	
	public Store() {
	}

	public Store(char name, int openingTime, int closingTime) {
		this.name = name;
		this.openingTime = openingTime;
		this.closingTime = closingTime;
	}

	@Override
	public String toString() {
		return "Store [name=" + name + ", openingTime=" + openingTime + ", closingTime=" + closingTime + "]";
	}

}
