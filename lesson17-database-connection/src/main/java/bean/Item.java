package bean;


public class Item {
    private Integer id;
    private String name;
    private Integer itemGroupId;
    private String color;
    private ItemGroup itemGroup;

    public Item(){}

    public Item(Integer id, String name, Integer itemGroupId, String color) {
        this.id = id;
        this.name = name;
        this.itemGroupId = itemGroupId;
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
    public Integer getItemGroupId() {
        return itemGroupId;
    }
    public void setItemGroupId(Integer itemGroupId) {
        this.itemGroupId = itemGroupId;
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
    public String toString() {
        return "Items{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", itemGroupId=" + itemGroupId +
                ", color='" + color + '\'' +
                '}';
    }
}
