package builder;

import java.time.LocalDate;

public class AdvItem {
	
	private int id;
	private String name;
	private double salesPrice;
	private LocalDate expireDate;
	
	private AdvItem() {
	}
	
	//Shortcut method to create new AdvItem
	public static AdvItem of() {
		return new AdvItem();
	}

	public int getId() {
		return id;
	}

	public AdvItem withId(int id) {
		this.id = id;
		return this;
	}

	public String getName() {
		return name;
	}

	public AdvItem withName(String name) {
		this.name = name;
		return this;
	}

	public double getSalesPrice() {
		return salesPrice;
	}

	public AdvItem withSalesPrice(double salesPrice) {
		this.salesPrice = salesPrice;
		return this;
	}

	public LocalDate getExpireDate() {
		return expireDate;
	}

	public AdvItem withExpireDate(LocalDate expireDate) {
		this.expireDate = expireDate;
		return this;
	}

	@Override
	public String toString() {
		return "AdvItem [id=" + id + ", name=" + name + ", salesPrice=" + salesPrice + ", expireDate=" + expireDate
				+ "]";
	}
	
	
	
	
}
