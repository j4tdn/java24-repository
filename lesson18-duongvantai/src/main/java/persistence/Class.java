package persistence;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "T01_CLASS")
public class Class {
	@Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "C01_CLASS_ID")
		private Integer id;
	
	 @Column(name = "C01_CLASS_NAME", nullable = false)
	    private String name;

	 @Column(name = "C01_CLASS_TEACHER")
	    private String teacher;
	 @OneToMany(mappedBy = "studentClass")
	 private List<Student> student = new ArrayList<Student>();
	 
	public Class() {
	}

	public Class(Integer id, String name, String teacher, List<Student> student) {
		super();
		this.id = id;
		this.name = name;
		this.teacher = teacher;
		this.student = student;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTeacher() {
		return teacher;
	}

	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}

	public List<Student> getStudent() {
		return student;
	}

	public void setStudent(List<Student> student) {
		this.student = student;
	}
	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (!(o instanceof Class that)) {
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
		return "Class [id=" + id + ", name=" + name + ", teacher=" + teacher + ", student=" + student + "]";
	}
	
	
}
