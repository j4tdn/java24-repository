package bean;

import java.io.Serializable;
import java.time.LocalDate;

public class Item implements Comparable<Item> {
    private int id;
    private String name;
    private Double salesPrice;
    private int storeId;
    private LocalDate expiryDate;

    public Item() {

    }

    public Item(int id, String name, Double salesPrice, int storeId, LocalDate expiryDate) {
        this.id = id;
        this.name = name;
        this.salesPrice = salesPrice;
        this.storeId = storeId;
        this.expiryDate = expiryDate;
    }

    public Item(int i, String j, int i1, int i2, LocalDate of, Object o) {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalesPrice() {
        return salesPrice;
    }

    public void setSalesPrice(Double salesPrice) {
        this.salesPrice = salesPrice;
    }

    public int getStoreId() {
        return storeId;
    }

    public void setStoreId(int storeId) {
        this.storeId = storeId;
    }

    public LocalDate getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(LocalDate expiryDate) {
        this.expiryDate = expiryDate;
    }

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salesPrice=" + salesPrice +
                ", storeId=" + storeId +
                ", expiryDate=" + expiryDate +
                '}';
    }

    @Override
    public int compareTo(Item that) {
        Item i1 = this;
        Item i2 = that;
        return Double.compare(i1.salesPrice, i2.salesPrice);
    }
}
