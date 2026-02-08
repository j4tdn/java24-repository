package persistence;

import java.util.List;
import java.util.Objects;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@Table(name = "T07_ITEM_GROUP")
@NamedQueries(
	@NamedQuery(
			name = ItemGroup.Q_GET_ALL, 
			query = "FROM ItemGroup",
			resultClass = ItemGroup.class)
)
public class ItemGroup {
	
	public static final String Q_GET_ALL = "Q_GET_ALL";
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "C07_ITEM_GROUP_ID")
	private Integer id;
	
	@Column(name = "C07_ITEM_GROUP_NAME")
	private String name;
	
	@Column(name = "C07_STATUS")
	private Boolean status;
	
	// @OneToMany mặc định fetch type là lazy
	
	@OneToMany(mappedBy = "group")
	private List<Item> items;
	
	/**
	 * Required default constructor
	 */
	public ItemGroup() {
	}

	public ItemGroup(Integer id, String name, Boolean status) {
		this.id = id;
		this.name = name;
		this.status = status;
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

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}
	
	public List<Item> getItems() {
		return items;
	}
	
	public void setItems(List<Item> items) {
		this.items = items;
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
		return "ItemGroup [id=" + id + ", name=" + name + ", status=" + status + "]";
	}
	
	
}
