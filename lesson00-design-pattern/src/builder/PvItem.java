package builder;

import java.time.LocalDate;
import java.util.Objects;

public class PvItem {
    private int id;
    private String name;
    private Double salePrice;
    private LocalDate expiredDate;

    private PvItem(){}

    public PvItem clone(PvItem pvItem){
        PvItem target = new PvItem();
        target.id = this.id;
        target.name = this.name;
        target.salePrice = this.salePrice;
        target.expiredDate = this.expiredDate;
        return target;
    }

    public static PvItem of() {
        return new PvItem();
    }

    public int getId() {
        return id;
    }

    public PvItem withId(int id) {
        if(this.id == id) return this;
        PvItem newItem = clone(this);
        newItem.id = id;
        return newItem;
    }

    public String getName() {
        return name;
    }

    public PvItem withName(String name) {
        if(Objects.equals(this.name, name)) return this;
        PvItem newItem = clone(this);
        newItem.name = name;
        return newItem;
    }

    public Double getSalePrice() {
        return salePrice;
    }

    public PvItem withSalePrice(Double salePrice) {
        if(Objects.equals(this.salePrice, salePrice)) return this;
        PvItem newItem = clone(this);
        newItem.id = id;
        return newItem;
    }

    public LocalDate getExpiredDate() {
        return expiredDate;
    }

    public PvItem withExpiredDate(LocalDate expiredDate) {
        if(Objects.equals(this.expiredDate, expiredDate)) return this;
        PvItem newItem = clone(this);
        newItem.expiredDate = expiredDate;
        return newItem;
    }

    @Override
    public String toString() {
        return "AdvItem{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salePrice=" + salePrice +
                ", expiredDate=" + expiredDate +
                '}';
    }
}
