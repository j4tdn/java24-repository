package bean;

public class Store {

	public String nameStore;
	public int openingTime;
	public int closingTime;

	public Store() {
	}

	public Store(String nameStore, int openingTime, int closingTime) {
		super();
		this.nameStore = nameStore;
		this.openingTime = openingTime;
		this.closingTime = closingTime;
	}

	@Override
	public String toString() {
		return "Store [nameStore=" + nameStore + ", openingTime=" + openingTime + ", closingTime=" + closingTime + "]";
	}

	
}
