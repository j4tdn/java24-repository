package bean;

import java.math.BigDecimal;
import java.util.Objects;

public class Item {
	
	private Integer itemId;
	private String name;
	private BigDecimal salePrices;
	private Integer  storeId;
	
	public Item() {
	}
	
	public Item(Integer itemId, String name) {
		this.itemId = itemId;
		this.name = name;
	}
	public Item(Integer itemId, String name, BigDecimal salePrices, Integer storeId) {
		this.itemId = itemId;
		this.name = name;
		this.salePrices = salePrices;
		this.storeId = storeId;
	}

	public Integer getItemId() {
		return itemId;
	}

	public void setItemId(Integer itemId) {
		this.itemId = itemId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getSalePrices() {
		return salePrices;
	}

	public void setSalePrices(BigDecimal salePrices) {
		this.salePrices = salePrices;
	}

	public Integer getStoreId() {
		return storeId;
	}

	public void setStoreId(Integer storeId) {
		this.storeId = storeId;
	}
	@Override
	public boolean equals(Object o) {
		if (this == o){
			return true;
		}
		if (!(o instanceof Item)) { // o ko phai KDL Item 
			return false;
		}
		Item that = (Item) o; // ep kieu Item cho o neu cau tren fale
		return getItemId() == that.getItemId();
	}
	@Override
	public int hashCode() {
		
		return Objects.hash(getItemId());
	}
	

	@Override
	public String toString() {
		return "Item [itemId=" + itemId + ", name=" + name + ", salePrices=" + salePrices + ", storeId=" + storeId
				+ "]";
	}
	

}
