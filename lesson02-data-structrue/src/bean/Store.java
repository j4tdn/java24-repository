package bean;

public class Store {

	public char nameStore;
	public int openingHours;
	public int closingHours;

	public Store() {
	}

	public Store(char nameStore, int openingHours, int closingHours) {
		this.nameStore = nameStore;
		this.openingHours = openingHours;
		this.closingHours = closingHours;
	}

	@Override
	public String toString() {
		return "Store [nameStore=" + nameStore + ", openingHours=" + openingHours + ", closeinngHours=" + closingHours
				+ "]";
	}

}
