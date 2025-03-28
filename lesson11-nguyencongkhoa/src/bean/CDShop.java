package bean;

public class CDShop {
	
	private int CDId;
	private String typeCD;
	private String single;
	private int amountOfSong;
	private double price;
	
	public CDShop() {
	}

	public CDShop(int CDId, String typeCD, String single, int amountOfSong, double price) {
		this.CDId = CDId;
		this.typeCD = typeCD;
		this.single = single;
		this.amountOfSong = amountOfSong;
		this.price = price;
	}

	public int getCDId() {
		return CDId;
	}

	public void setCDId(int cDId) {
		CDId = cDId;
	}

	public String getTypeCD() {
		return typeCD;
	}

	public void setTypeCD(String typeCD) {
		this.typeCD = typeCD;
	}

	public String getSingle() {
		return single;
	}

	public void setSingle(String single) {
		this.single = single;
	}

	public int getAmountOfSong() {
		return amountOfSong;
	}

	public void setAmountOfSong(int amountOfSong) {
		this.amountOfSong = amountOfSong;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "CDShop [CDId=" + CDId + ", typeCD=" + typeCD + ", single=" + single + ", amountOfSong=" + amountOfSong
				+ ", price=" + price + "]";
	}

}
