package bean;

import java.math.BigDecimal;
import java.util.Objects;

public class Item {
	
	private Integer itemId;
	private String name;
	private BigDecimal salesPrice;
	private Integer storeId;
	
	public Item(Integer itemId, String name) {
		this.itemId = itemId;
		this.name = name;
	}
	 
	public Item() {
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

	public String getName() {
		return name;
	}

	public BigDecimal getSalesPrice() {
		return salesPrice;
	}

	public Integer getStoreId() {
		return storeId;
	}

	public void setItemId(Integer itemId) {
		this.itemId = itemId;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSalesPrice(BigDecimal salesPrice) {
		this.salesPrice = salesPrice;
	}

	public void setStoreId(Integer storeId) {
		this.storeId = storeId;
	}
	
	@Override
	public boolean equals(Object o) {
		if(this == o) {
			return true;
		}
		
		if(!(o instanceof Item)) {
			return false;
		}
		
		Item that = (Item)o;
		return this.getStoreId() == that.getStoreId();
		
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
