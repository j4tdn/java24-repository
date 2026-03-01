package persistence;

import enumerator.SizeName;
import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "T02_SIZE")
public class Size {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "C02_SIZE_ID")
    private Integer id;

    @Column(name = "C02_SIZE_NAME")
    private SizeName name;

    @Column(name = "C02_GENDER")
    private Boolean gender;

    @Column(name = "C02_SIZE_DESC")
    private String desc;

    public Size() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public SizeName getName() {
        return name;
    }

    public void setName(SizeName name) {
        this.name = name;
    }

    public Boolean getGender() {
        return gender;
    }

    public void setGender(Boolean gender) {
        this.gender = gender;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Size size = (Size) o;
        return Objects.equals(id, size.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "Size{" +
                "id=" + id +
                ", name=" + name +
                ", gender=" + gender +
                ", desc='" + desc + '\'' +
                '}';
    }
}
