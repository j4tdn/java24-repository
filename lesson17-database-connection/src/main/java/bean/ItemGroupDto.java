package bean;

import java.util.Objects;

public class ItemGroupDto {
	
	public static final String PROP_ID = "id";
	public static final String PROP_NAME = "name";
	public static final String PROP_AMOUNT_OF_ITEM = "amountOfItem";
	public static final String PROP_ITEM_DETAIL = "itemDetails";
	
	private Integer id;
	private String name;
	private Integer amountOfItem;
	private String itemDetails;
	
	public ItemGroupDto() {
	}

	public ItemGroupDto(Integer id, String name, Integer amountOfItem, String itemDetails) {
		super();
		this.id = id;
		this.name = name;
		this.amountOfItem = amountOfItem;
		this.itemDetails = itemDetails;
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

	public Integer getAmountOfItem() {
		return amountOfItem;
	}

	public void setAmountOfItem(Integer amountOfItem) {
		this.amountOfItem = amountOfItem;
	}

	public String getItemDetails() {
		return itemDetails;
	}

	public void setItemDetails(String itemDetails) {
		this.itemDetails = itemDetails;
	}
	
	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (!(o instanceof ItemGroup that)) {
			return false;
		}
		
		return getId() == that.getId();
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(getId());
	}

	@Override
	public String toString() {
		return "ItemGroupDto [id=" + id + ", name=" + name + ", amountOfItem=" + amountOfItem + ", itemDetails="
				+ itemDetails + "]";
	}
	
	

}
