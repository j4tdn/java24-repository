package bean;

import java.math.BigDecimal;
import java.util.Objects;

public class Item {

	private Integer itemId;
	private String name;
	private BigDecimal salesPrice;
	private Integer storeId;

	public Item() {
	}
	
	public Item(Integer itemId, String name) {
		this.itemId = itemId;
		this.name = name;
	}

	public Item(Integer itemId, String name, BigDecimal salesPrice, Integer storeId) {
		this.itemId = itemId;
		this.name = name;
		this.salesPrice = salesPrice;
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

	public BigDecimal getSalesPrice() {
		return salesPrice;
	}

	public void setSalesPrice(BigDecimal salesPrice) {
		this.salesPrice = salesPrice;
	}

	public Integer getStoreId() {
		return storeId;
	}

	public void setStoreId(Integer storeId) {
		this.storeId = storeId;
	}
	
	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		
		if (!(o instanceof Item that)) {
			return false;
		}
		
		return getItemId() == that.getItemId();
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(getItemId());
	}

	@Override
	public String toString() {
		return "Item [itemId=" + itemId + ", name=" + name + ", salesPrice=" + salesPrice + ", storeId=" + storeId
				+ "]";
	}
}