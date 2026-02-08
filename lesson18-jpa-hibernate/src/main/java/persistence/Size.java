package persistence;

import java.util.Objects;

import enumerator.SizeName;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "T02_SIZE")
public class Size {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "C02_SIZE_ID")
	private Integer id;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "C02_SIZE_NAME")
	private SizeName name;
	
	@Column(name = "C02_GENDER")
	private Boolean gender;
	
	@Column(name = "C02_SIZE_DESC")
	private String desc;
	
	public Size() {
	}

	public Size(Integer id, SizeName name, Boolean gender, String desc) {
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.desc = desc;
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
		if (this == o) {
			return true;
		}
		
		if (!(o instanceof Size that)) {
			return false;
		}
		
		return getId() == that.getId();
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(getId());
	}
	
	@Override
	public String toString() {
		return "Size [id=" + id + ", name=" + "hello" + ", gender=" + gender + ", desc=" + desc + "]";
	}
	
}
