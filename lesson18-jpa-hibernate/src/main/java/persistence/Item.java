package persistence;

import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "T01_ITEM")
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "C01_ITEM_ID")
    private Integer id;

    @Column(name = "C01_ITEM_NAME")
    private String name;

    @Column(name  = "C01_COLOR")
    private String color;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "C01_ITEM_GROUP_ID")
    private ItemGroup itemGroup;

    public Item() {
    }

    public Item(Integer id, String name, String color) {
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

    public ItemGroup getItemGroup() {
        return itemGroup;
    }

    public void setItemGroup(ItemGroup itemGroup) {
        this.itemGroup = itemGroup;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return Objects.equals(id, item.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", -->group='" + itemGroup + '\'' +
                '}';
    }
}
