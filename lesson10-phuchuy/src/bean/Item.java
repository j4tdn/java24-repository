package bean;

public class Item {
	private Integer itemId;
	private String name;
	private Integer salePrices;
	private Integer storeId;

	public Item() {
	}

	public Item(Integer itemId, String name, Integer salePrices, Integer storeId) {
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

	public Integer getSalePrices() {
		return salePrices;
	}

	public void setSalePrices(Integer salePrices) {
		this.salePrices = salePrices;
	}

	public Integer getStoreId() {
		return storeId;
	}

	public void setStoreId(Integer storeId) {
		this.storeId = storeId;
	}

	@Override
	public String toString() {
		return "Item [itemId=" + itemId + ", name=" + name + ", salePrices=" + salePrices + ", storeId=" + storeId
				+ "]";
	}
	
	
}
