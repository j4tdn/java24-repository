package persistence;

import jakarta.persistence.*;

import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "t07_item_group")
//@NamedNativeQueries(
//        @NamedNativeQuery(name = ItemGroup.Q_GET_ALL,
//                query = "SELECT * FROM T07_ITEM_GROUP",
//                resultClass = ItemGroup.class)
//)

@NamedQueries(
        @NamedQuery(
                name = ItemGroup.Q_GET_ALL,
                query = "FROM ItemGroup",
                resultClass = ItemGroup.class
        )
)
public class ItemGroup {

    public static final String Q_GET_ALL = "Q_GET_ALL";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "c07_item_group_id")
    private Integer id;

    @Column(name = "c07_item_group_name")
    private String name;

    @Column(name = "c07_status")
    private Boolean status;

    @OneToMany(mappedBy = "itemGroup")
    private List<Item> items;

    public ItemGroup() {}

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
        if (o == null || getClass() != o.getClass()) return false;
        ItemGroup itemGroup = (ItemGroup) o;
        return Objects.equals(id, itemGroup.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "ItemGroup{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", status=" + status +
                '}';
    }
}
