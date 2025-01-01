package builder;

import java.time.LocalDate;

/**
 * Sử dụng builder pattern để tạo đối tượng cho Item
 * --> Cách 1: truyền thống
 * <p>
 * Từ Item
 * B1: nhờ builder tạo ra 1 đối tượng chứa đầy đủ thông tin như Item
 * --> có đầy đủ thuộc tính giống Item
 * B2: Item muốn set bnhieu thuộc tính thì dùng builder set trước rồi copy sau
 * B3: Gọi hàm builder trong class Builder để build ra đối tượng Item
 * <p>
 * Bản thân class Item ko được phép tự tạo đối tượng --> Private constructor
 * Muốn Item immutable
 * --> Chỉ tạo hàm getter ko tạo setter
 * <p>
 * Class nằm bên trong class --> nested class
 * Hàm nằm bên trong hàm --> nested func
 * <p>
 * Builder là static class vì
 * + Nếu non-static, muốn truy cập được Builder thì phải tạo 1 đối tượng Item
 * --> ko hợp lý vì nếu tạo đối tượng Item thì ko cần dùng Builder
 * mục đích dùng Builder là để khởi tạo đối tượng
 * + Tạo đối tượng builder thông qua Item.builder()
 */

public class Item {

    private int id;
    private String name;
    private Double salePrice;
    private Double buyPrice;
    private Double tax;
    private int quantity;
    private LocalDate startDate;
    private LocalDate expiredDate;

    private Item(){

    }

    private Item(Builder builder){
        this.id = builder.id;
        this.name = builder.name;
        this.salePrice = builder.salePrice;
        this.buyPrice = builder.buyPrice;
        this.tax = builder.tax;
        this.quantity = builder.quantity;
        this.expiredDate = builder.expiredDate;
        this.startDate = builder.startDate;
    }

    public static Builder builder() {
        return new Builder();
    }

    //Chỉ có getters
    //ko có setters muốn immutable


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Double getSalePrice() {
        return salePrice;
    }

    public Double getBuyPrice() {
        return buyPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public Double getTax() {
        return tax;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public LocalDate getExpiredDate() {
        return expiredDate;
    }

    @Override
    public String toString() {
        return "Item{" +
                "buyPrice=" + buyPrice +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", salePrice=" + salePrice +
                ", tax=" + tax +
                ", quantity=" + quantity +
                ", startDate=" + startDate +
                ", expiredDate=" + expiredDate +
                '}';
    }

    public static class Builder {
        private int id;
        private String name;
        private Double salePrice;
        private Double buyPrice;
        private Double tax;
        private int quantity;
        private LocalDate startDate;
        private LocalDate expiredDate;

        // chỉ setters, để gán giá trị sau khi khởi tạo đối tượng builder
        // ko có getters


        public Builder withId(int id) {
            this.id = id;
            return this;
        }

        public Builder withName(String name) {
            this.name = name;
            return this;
        }

        public Builder withQuantity(int quantity) {
            this.quantity = quantity;
            return this;
        }

        public Builder withSalePrice(Double salePrice) {
            this.salePrice = salePrice;
            return this;
        }

        public Builder withBuyPrice(Double buyPrice) {
            this.buyPrice = buyPrice;
            return this;
        }

        public Builder withTax(Double tax) {
            this.tax = tax;
            return this;
        }

        public Builder withStartDate(LocalDate startDate) {
            this.startDate = startDate;
            return this;
        }

        public Builder withExpiredDate(LocalDate expiredDate) {
            this.expiredDate = expiredDate;
            return this;
        }

        public Item build() {
            return new Item(this);
        }
    }
}
