package bean;

import java.time.LocalDate;

import functional.ItemCompFunc;

public class Item implements Comparable<Item> {
	private String name;
	private Integer id;
	private Double salePrices;
	private Integer storeId;
	private LocalDate expriredDate;
	
	public Item() {
	}
	

	public Item(String name, Integer id, Double salePrices) {
		this.name = name;
		this.id = id;
		this.salePrices = salePrices;
	}

	public Item( Integer id, String name, Double salePrices, Integer storeId, LocalDate expriredDate) {
		this.name = name;
		this.id = id;
		this.salePrices = salePrices;
		this.expriredDate = expriredDate;
		this.storeId = storeId;
	}

	public Integer getStoreId() {
		return storeId;
	}


	public void setStoreId(Integer storeId) {
		this.storeId = storeId;
	}


	public LocalDate getExpriredDate() {
		return expriredDate;
	}

	public void setExpriredDate(LocalDate expriredDate) {
		this.expriredDate = expriredDate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Double getSalePrices() {
		return salePrices;
	}


	public void setSalePrices(Double salePrices) {
		this.salePrices = salePrices;
	}

	@Override
	public String toString() {
		return "Item [name=" + name + ", id=" + id + ", salePrices=" + salePrices + ", storeId=" + storeId
				+ ", expriredDate=" + expriredDate + "]";
	}


	@Override
	public int compareTo(Item that) {
		Item i1 = this;
		Item i2 = that;
		// return i1.getId().compareTo(i2.getId());
		return Double.compare(i2.getSalePrices(), i1.getSalePrices());
	}
	
}
