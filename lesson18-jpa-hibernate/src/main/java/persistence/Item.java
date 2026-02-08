package persistence;

import java.util.List;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "T01_ITEM")
public class Item {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "C01_ITEM_ID")
	private Integer id;
	
	@Column(name = "C01_ITEM_NAME")
	private String name;
	
	@Column(name = "C01_COLOR")
	private String color;
	
	// Mặc định @ManyToOne là eager fetch
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "C01_ITEM_GROUP_ID", referencedColumnName = "C07_ITEM_GROUP_ID")
	private ItemGroup group;
	
	@OneToMany(mappedBy = "item")
	private List<ItemDetail> itemDetails;

	public Item() {
	}
	
	public Item(Integer id, String name, String color, Integer refId) {
		this.id = id;
		this.name = name;
		this.color = color;
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
	
	public ItemGroup getGroup() {
		return group;
	}
	
	public void setGroup(ItemGroup group) {
		this.group = group;
	}
	
	public List<ItemDetail> getItemDetails() {
		return itemDetails;
	}
	
	public void setItemDetails(List<ItemDetail> itemDetails) {
		this.itemDetails = itemDetails;
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
		return "Item [id=" + id + ", name=" + name + ", color=" + color + "]";
	}

}
