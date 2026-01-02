package bean;

import java.util.Objects;

public class ItemGroupAndItem {
    private Integer id;
    private String groupName;
    private Integer status;
    private Integer itemId;
    private String itemName;
    private String color;

    public ItemGroupAndItem(String groupName, Integer status) {
        this.groupName = groupName;
        this.status = status;
    }

    public ItemGroupAndItem(Integer id, String groupName, Integer status,  Integer itemId, String itemName,  String color) {
        this.id = id;
        this.groupName = groupName;
        this.status = status;
        this.itemId = itemId;
        this.itemName = itemName;
        this.color = color;
    }

    public Integer getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String groupName() {
        return groupName;
    }

    public void setName(String groupName) {
        this.groupName = groupName;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        return getId().equals(((ItemGroupAndItem) o).getId());
    }

    @Override
    public String toString() {
        return "ItemGroupAndItem " + id + ", " + groupName + ", " + status + ", " + itemName + ", " + itemId + ", " + color;
    }
}
