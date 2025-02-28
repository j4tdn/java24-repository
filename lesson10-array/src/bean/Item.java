package bean;

import java.time.LocalDate;

public class Item {

	private Integer id;
	private String name;
	private Double salesPrices;
	private Integer storeId;
	private LocalDate expiredDate;

	public Item() {
		// TODO Auto-generated constructor stub
	}

	public Item(Integer id, String name, Double salesPrices) {
		this.id = id;
		this.name = name;
		this.salesPrices = salesPrices;
	}

	public Item(Integer id, String name, Double salesPrices, Integer storeId, LocalDate expiredDate) {
		this.id = id;
		this.name = name;
		this.salesPrices = salesPrices;
		this.storeId = storeId;
		this.expiredDate = expiredDate;
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

	public Double getSalesPrices() {
		return salesPrices;
	}

	public void setSalesPrices(Double salesPrices) {
		this.salesPrices = salesPrices;
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", salesPrices=" + salesPrices + ", storeId=" + storeId
				+ ", expiredDate=" + expiredDate + "]";
	}

	
}
