package bean;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Locale;
import java.util.Objects;

public class Item implements Serializable {
    private static final long serialVersionUID = 1L;
    private int id;
    private String name;
    private LocalDate expiredDate;
    private Double price;

    public Item(int id, String name, LocalDate expiredDate, Double price) {
        this.id = id;
        this.name = name;
        this.expiredDate = expiredDate;
        this.price = price;
    }

    public String toLine() {
        return getId() + "," + getName() + "," + getExpiredDate() + "," + getPrice();
    }

    public Item(String line) {
        String[] parts = line.split(",");
        if (parts.length == 4) {
            setId(Integer.parseInt(parts[0]));
            setName(parts[1]);
            setExpiredDate(LocalDate.parse(parts[2]));
            setPrice(Double.parseDouble(parts[3]));
        }
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

    public LocalDate getExpiredDate() {
        return expiredDate;
    }

    public void setExpiredDate(LocalDate expiredDate) {
        this.expiredDate = expiredDate;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return id == item.id;
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
                ", expiredDate=" + expiredDate +
                ", price=" + price +
                '}';
    }
}
