package builder;

import java.time.LocalDate;

public class PvItem {

	private int id;
	private String name;
	private Double salesPrice;
	private LocalDate expiredDate;

	private PvItem() {
	}

	// PvItem.of() // H1
	// .withSalesPrice(22d) H4
	// .withId(12) // H2
	// .withName("A") // H3

	public PvItem clone(PvItem source) {
		PvItem target = new PvItem();
		target.id = source.id;
		target.name = source.name;
		target.salesPrice = source.salesPrice;
		target.expiredDate = source.expiredDate;
		return target;
	}

	// Shortcut method to create new PvItem
	public static PvItem of() {
		return new PvItem();
	}

	public int getId() {
		return id;
	}

	// this(ô nhớ cũ): đối tượng đang gọi withId
	// return ô nhớ mới --> return đối tượng mới,
	// hoặc gán đối tượng mới cho this rồi return về this
	public PvItem withId(int id) {
		if (this.id == id) {
			return this;
		}
		PvItem newObject = clone(this);
		newObject.id = id;
		return newObject;
	}

	public String getName() {
		return name;
	}

	public PvItem withName(String name) {
		if (this.name == name) {
			return this;
		}
		PvItem newObject = clone(this);
		newObject.name = name;
		return newObject;
	}

	public Double getSalesPrice() {
		return salesPrice;
	}

	public PvItem withSalesPrice(Double salesPrice) {
		if (this.salesPrice == salesPrice) {
			return this;
		}
		PvItem newObject = clone(this);
		newObject.salesPrice = salesPrice;
		return newObject;
	}

	public LocalDate getExpiredDate() {
		return expiredDate;
	}

	public PvItem withExpiredDate(LocalDate expiredDate) {
		if (this.expiredDate == expiredDate) {
			return this;
		}
		PvItem newObject = clone(this);
		newObject.expiredDate = expiredDate;
		return newObject;
	}

	@Override
	public String toString() {
		return "PvItem [id=" + id + ", name=" + name + ", salesPrice=" + salesPrice + ", expiredDate=" + expiredDate
				+ "]";
	}

}