package bean;

import java.time.LocalDate;

public class Item implements Comparable<Item> {

	private Integer id;
	private String name;
	private Double salesPrice;
	private Integer storeId;
	private LocalDate expiredDate;
	
	public Item() {
	}

	public Item(Integer id, String name, Double salesPrice) {
		this.id = id;
		this.name = name;
		this.salesPrice = salesPrice;
	}
	

	public Integer getStoreId() {
		return storeId;
	}

	public void setStoreId(Integer storeId) {
		this.storeId = storeId;
	}

	public LocalDate getExpiredDate() {
		return expiredDate;
	}

	public void setExpiredDate(LocalDate expiredDate) {
		this.expiredDate = expiredDate;
	}

	public Item(Integer id, String name, Double salesPrice, Integer storeId, LocalDate expiredDate) {
		super();
		this.id = id;
		this.name = name;
		this.salesPrice = salesPrice;
		this.storeId = storeId;
		this.expiredDate = expiredDate;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalesPrice() {
		return salesPrice;
	}

	public void setSalesPrice(Double salesPrice) {
		this.salesPrice = salesPrice;
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", salesPrice=" + salesPrice + ", storeId=" + storeId
				+ ", expiredDate=" + expiredDate + "]";
	}

	@Override
	public int compareTo(Item that) {
		Item i1 = this;
		Item i2 = that;
		return i1.getId().compareTo(i2.getId());
	}

	
	
	
}
