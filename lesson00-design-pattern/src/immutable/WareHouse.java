package immutable;

public class WareHouse {
    private int id;
    private String address;

    public WareHouse() {}
    public WareHouse(int id, String address) {
        this.id = id;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "WareHouse{" +
                "id=" + id +
                ", address='" + address + '\'' +
                '}';
    }
}
