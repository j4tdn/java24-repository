package bean;

public class ListGroups {
    private Integer itemGroupId;
    private String itemGroupName;
    private Integer sumOfItems;

    public ListGroups(Integer itemGroupId, String itemGroupName, Integer sumOfItems) {
        this.itemGroupId = itemGroupId;
        this.itemGroupName = itemGroupName;
        this.sumOfItems = sumOfItems;
    }

    public Integer getItemGroupId() {
        return itemGroupId;
    }

    public void setItemGroupId(Integer itemGroupId) {
        this.itemGroupId = itemGroupId;
    }

    public String getItemGroupName() {
        return itemGroupName;
    }

    public void setItemGroupName(String itemGroupName) {
        this.itemGroupName = itemGroupName;
    }

    public Integer getSumOfItems() {
        return sumOfItems;
    }

    public void setSumOfItems(Integer sumOfItems) {
        this.sumOfItems = sumOfItems;
    }

    @Override
    public String toString() {
        return "ListGroups{" +
                "itemGroupId=" + itemGroupId +
                ", itemGroupName='" + itemGroupName + '\'' +
                ", sumOfItems=" + sumOfItems +
                '}';
    }
}
