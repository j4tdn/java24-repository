package builder;

import java.time.LocalDate;

public class AdvItem {
	
	private int id;
	private String name;
	private Double salesPrice;
	private LocalDate expiredDate;
	
	private AdvItem() {
	}
	
	// Shortcut method to create new AdvItem
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

	public Double getSalesPrice() {
		return salesPrice;
	}

	public AdvItem withSalesPrice(Double salesPrice) {
		this.salesPrice = salesPrice;
		return this;
	}

	public LocalDate getExpiredDate() {
		return expiredDate;
	}

	public AdvItem withExpiredDate(LocalDate expiredDate) {
		this.expiredDate = expiredDate;
		return this;
	}

	@Override
	public String toString() {
		return "AdvItem [id=" + id + ", name=" + name + ", salesPrice=" + salesPrice + ", expiredDate=" + expiredDate
				+ "]";
	}
}
