package builder;

import java.time.LocalDate;

public class PvItem {
	
	private int id;
	private String name;
	private Double salesPrice;
	private LocalDate expiredDate;
	
	private PvItem() {
	}	
	
	public PvItem clone(PvItem source) {
		PvItem target = new PvItem();
		target.id = source.id;
		target.name = source.name;
		target.salesPrice = source.salesPrice;
		target.expiredDate = source.expiredDate;
		return target;
	}
		// Shorten method to create new Pvitem
	public static PvItem of() {
		return new PvItem();
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public Double getSalesPrice() {
		return salesPrice;
	}
	public LocalDate getExpiredDate() {
		return expiredDate;
	}
	public PvItem withId(int id) {
		if(this.id == id) {
			return this;
		}
		PvItem newObject = clone(this);
		newObject.id = id;
		return newObject;
		
	}
	public PvItem withName(String name) {
		if(this.name == name) {
			return this;
		}
		PvItem newObject = clone(this);
		newObject.name = name;
		return newObject;
	}
	public PvItem withSalesPrice(Double salesPrice) {
		if(this.salesPrice == salesPrice) {
			return this;
		}
		PvItem newObject = clone(this);
		newObject.salesPrice = salesPrice;
		return newObject;
	}
	public PvItem withExpiredDate(LocalDate expiredDate) {
		if(this.expiredDate == expiredDate) {
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
