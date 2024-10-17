package bean;

public class Vehice {

	private String owner;
	private String type;
	private int volume;
	private double price;
	private double tax;

	public Vehice() {
	}

	public Vehice(String owner, String type, int volume, double price) {
		this.owner = owner;
		this.type = type;
		this.volume = volume;
		this.price = price;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getTax() {
		if (volume < 100) {
			tax = price * 0.01;
		} else if (volume < 200) {
			tax = price * 0.03;
		} else {
			tax = price * 0.05;
		}

		return tax;
	}

	@Override
	public String toString() {
		return "Vehice [owner=" + owner + ", type=" + type + ", volume=" + volume + ", price=" + price + ", tax=" + tax
				+ "]";
	}

}
