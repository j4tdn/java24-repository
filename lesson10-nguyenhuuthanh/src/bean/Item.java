package bean;

public class Item {
	private Integer itemID;
	private String name;
	private Integer salesPrice;
	private Integer storeID;
	
	public Item() {
		// TODO Auto-generated constructor stub
	}

	public Item(Integer itemID, String name, Integer salesPrice, Integer storeID) {
		this.itemID = itemID;
		this.name = name;
		this.salesPrice = salesPrice;
		this.storeID = storeID;
	}

	public Integer getItemID() {
		return itemID;
	}

	public void setItemID(Integer itemID) {
		this.itemID = itemID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getSalesPrice() {
		return salesPrice;
	}

	public void setSalesPrice(Integer salesPrice) {
		this.salesPrice = salesPrice;
	}

	public Integer getStoreID() {
		return storeID;
	}

	public void setStoreID(Integer storeID) {
		this.storeID = storeID;
	}

	@Override
	public String toString() {
		return "Item " + itemID + ", " + name + ", " + salesPrice + ", " + storeID+ "";
	}
	
	
}
