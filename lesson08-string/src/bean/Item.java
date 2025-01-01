package bean;

import java.util.Objects;

public class Item implements Comparable<Item> {

    private Integer id;
    private String name;

    public Item() {
    }

    public Item(Integer id, String name) {
        this.id = id;
        this.name = name;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Item that)) return false;
        return Objects.equals(getId(), that.getId());
    }

    @Override
    public int compareTo(Item o) {
        Item i1 = this;
        Item i2 = o;
        Integer id1 = i1.getId();
        Integer id2 = i2.getId();
        if(id1==null && id2==null) {
            return 0;
        }

        if(id1==null) {
            return -1;
        }
        if(id2==null) {
            return 1;
        }

        return i1.getId() - i2.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
