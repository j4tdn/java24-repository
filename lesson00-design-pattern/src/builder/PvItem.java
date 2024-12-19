package builder;

import java.time.LocalDate;

public class PvItem {
	
	private int id;
	private String name;
	private double salesPrice;
	private LocalDate expireDate;
	
	private PvItem() {
	}
	
	//PvItem.of()  H1
	//		.withSalesPrice     H4
	//		.withId(12) 		H2
	// 		.withName("A")  	H3
	
	public PvItem clone(PvItem source) {
		PvItem target = new PvItem();
		target.id = source.id;
		target.name = source.name;
		target.salesPrice = source.salesPrice;
		target.expireDate = source.expireDate;
		return target;
	}
	
	//Shortcut method to create new PvItem
	public static PvItem of() {
		return new PvItem();
	}

	public int getId() {
		return id;
	}

	public PvItem withId(int id) {
		if (this.id == id ) {
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
		if (this.name == name ) {
			return this;
		}
		PvItem newObject = clone(this);
		newObject.name = name;
		return newObject;
	}

	public double getSalesPrice() {
		return salesPrice;
	}

	public PvItem withSalesPrice(double salesPrice) {
		if (this.salesPrice == salesPrice ) {
			return this;
		}
		PvItem newObject = clone(this);
		newObject.salesPrice = salesPrice;
		return newObject;
	}

	public LocalDate getExpireDate() {
		return expireDate;
	}

	public PvItem withExpireDate(LocalDate expireDate) {
		if (this.expireDate == expireDate ) {
			return this;
		}
		PvItem newObject = clone(this);
		newObject.expireDate = expireDate;
		return newObject;
	}

	@Override
	public String toString() {
		return "PvItem [id=" + id + ", name=" + name + ", salesPrice=" + salesPrice + ", expireDate=" + expireDate
				+ "]";
	}
	
}
