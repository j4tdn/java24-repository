package bean;

import java.util.Objects;

public class ItemGroup {
    private Integer id;
    private String name;
    private Boolean status;

    public ItemGroup() {
    }
    public ItemGroup(Integer id, String name, Boolean status) {
        this.id = id;
        this.name = name;
        this.status = status;
    }
    public ItemGroup(String name, Boolean status) {
        this.name = name;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public Boolean getStatus() {
        return status;
    }

    public String getName() {
        return name;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    @Override
    public String toString() {
        return "ItemGroup{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", status=" + status +
                '}';
    }
}
