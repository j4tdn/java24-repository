package bean;

import java.math.BigDecimal;

public class Item {
	
	private Integer itemId;
	private String name;
	private BigDecimal salesPrice;
	private Integer storiId;
	
	public Item() {
	}

	public Item(Integer itemId, String name, BigDecimal salesPrice, Integer storiId) {
		this.itemId = itemId;
		this.name = name;
		this.salesPrice = salesPrice;
		this.storiId = storiId;
	}
	
	public Item(Integer itemId, String name) {
		this.itemId = itemId;
		this.name = name;
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

	public Integer getStoriId() {
		return storiId;
	}

	public void setStoriId(Integer storiId) {
		this.storiId = storiId;
	}
	
	@Override
	public boolean equals(Object o) {
	    if (this == o) {
	        return true;
	    }
	    if (!(o instanceof Item that)) {
	        return false;
	    }
	    return this.getItemId() == that.getItemId();
	}

	
	@Override
	public String toString() {
		return "Item [itemId=" + itemId + ", name=" + name + ", salesPrice=" + salesPrice + ", storiId=" + storiId
				+ "]";
	}
	
	
}
