package bean;

public class Shop {
	
	public char name;
	public int timeOpen;
	public int timeClose;
	
	public Shop() {
		
	}
	
	public Shop(char name, int timeOpen, int timeClose) {
		this.name = name;
		this.timeOpen = timeOpen;
		this.timeClose = timeClose;
	}

	@Override
	public String toString() {
		return "Shop [name=" + name + ", timeOpen=" + timeOpen + ", timeClose=" + timeClose + "]";
	}

}
