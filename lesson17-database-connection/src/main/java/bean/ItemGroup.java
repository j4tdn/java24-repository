package bean;

import java.util.Objects;

public class ItemGroup {
    private Integer id;
    private String name;
    private Integer status;

    public ItemGroup(String name, Integer status) {
        this.name = name;
        this.status = status;
    }

    public ItemGroup(Integer id, String name, Integer status) {
        this.id = id;
        this.name = name;
        this.status = status;
    }

    public Integer getId() {
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

    public Integer getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        return getId().equals(((ItemGroup) o).getId());
    }

    @Override
    public String toString() {
        return "ItemGroup " + id + ", " + name + ", " + status;
    }
}
