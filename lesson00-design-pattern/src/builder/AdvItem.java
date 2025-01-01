package builder;

import java.time.LocalDate;

public class AdvItem {
    private int id;
    private String name;
    private Double salePrice;
    private LocalDate expiredDate;

    private AdvItem(){}

    public static AdvItem of() {
        return new AdvItem();
    }

    public int getId() {
        return id;
    }

    public AdvItem withId(int id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public AdvItem withName(String name) {
        this.name = name;
        return this;
    }

    public Double getSalePrice() {
        return salePrice;
    }

    public AdvItem withSalePrice(Double salePrice) {
        this.salePrice = salePrice;
        return this;
    }

    public LocalDate getExpiredDate() {
        return expiredDate;
    }

    public AdvItem withExpiredDate(LocalDate expiredDate) {
        this.expiredDate = expiredDate;
        return this;
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
