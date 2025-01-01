package builder;

import java.time.LocalDate;

public class F1Item {
    private int id;
    private String name;
    private Double salePrice;
    private Double buyPrice;
    private Double tax;
    private int quantity;
    private LocalDate startDate;
    private LocalDate expiredDate;

    public F1Item() {
    }

    public F1Item(int id, String name, int quantity, Double buyPrice, Double salePrice, Double tax, LocalDate startDate, LocalDate expiredDate) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.buyPrice = buyPrice;
        this.salePrice = salePrice;
        this.tax = tax;
        this.startDate = startDate;
        this.expiredDate = expiredDate;
    }

    public F1Item(int id, String name, Double salePrice) {
        this.id = id;
        this.name = name;
        this.salePrice = salePrice;
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

    public Double getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(Double salePrice) {
        this.salePrice = salePrice;
    }

    public Double getBuyPrice() {
        return buyPrice;
    }

    public void setBuyPrice(Double buyPrice) {
        this.buyPrice = buyPrice;
    }

    public Double getTax() {
        return tax;
    }

    public void setTax(Double tax) {
        this.tax = tax;
    }
}
