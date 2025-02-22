package bean;

public class Item {
	private Integer ItemId;
	private String Name;
	private Double SalesPrice;
	private Integer StoreId;
	
	public Item() {
	}

	public Item(Integer itemId, String name, Double salesPrice, Integer storeId) {
		ItemId = itemId;
		Name = name;
		SalesPrice = salesPrice;
		StoreId = storeId;
	}

	public Integer getItemId() {
		return ItemId;
	}

	public void setItemId(Integer itemId) {
		ItemId = itemId;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public Double getSalesPrice() {
		return SalesPrice;
	}

	public void setSalesPrice(Double salesPrice) {
		SalesPrice = salesPrice;
	}

	public Integer getStoreId() {
		return StoreId;
	}

	public void setStoreId(Integer storeId) {
		StoreId = storeId;
	}

	@Override
	public String toString() {
		return "Item [ItemId=" + ItemId + ", Name=" + Name + ", SalesPrice=" + SalesPrice + ", StoreId=" + StoreId
				+ "]";
	}
	
	
	
}
