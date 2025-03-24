package bean;

import java.util.Objects;

public class Disk {
    private int id;
    private String type;
    private String singer;
    private int quantity;
    private Double price;

    public Disk() {}

    public Disk(int id, String type, String singer, int quantity, Double price) {
        this.id = id;
        this.type = type;
        this.singer = singer;
        this.quantity = quantity;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Disk{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", singer='" + singer + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Disk disk = (Disk) o;
        return id == disk.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
