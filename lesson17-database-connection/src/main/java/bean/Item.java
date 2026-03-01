package bean;

import java.util.Objects;

public class Item {
	private Integer id;
	private String name;
	private String color;
	private Integer refId;
	private ItemGroup group;

	public Item() {

	}
	public Item(Integer id, String name, String color, Integer refId) {
		this.id = id;
		this.name = name;
		this.color = color;
		this.refId = refId;
	}

	public Item(Integer id, String name, String color, Integer refId, ItemGroup group) {
		this.id = id;
		this.name = name;
		this.color = color;
		this.refId = refId;
		this.group = group;
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

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Integer getRefId() {
		return refId;
	}

	public void setRefId(Integer refId) {
		this.refId = refId;
	}

	public ItemGroup getGroup() {
		return group;
	}

	public void setGroup(ItemGroup group) {
		this.group = group;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (!(o instanceof Item that)) {
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
		return "Item [id=" + id + ", name=" + name + ", color=" + color + ", refId=" + "]";
	}

}
