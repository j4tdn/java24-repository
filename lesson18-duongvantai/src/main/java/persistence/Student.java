package persistence;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "T02_STUDENT")
public class Student {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "C02_STUDENT_ID")
    private Integer studentId;
	
	@Column(name = "C02_STUDENT_NAME", nullable = false)
    private String studentName;
	
	@Enumerated(EnumType.STRING) 
    @Column(name = "C02_STUDENT_GENDER", nullable = false)
    private Gender studentGender;
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "C02_CLASS_ID", referencedColumnName = "C01_CLASS_ID")
    private Class studentClass;
	
	public Student() {
	}
	
	public Integer getStudentId() {
		return studentId;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	

	public Class getStudentClass() {
		return studentClass;
	}

	public void setStudentClass(Class studentClass) {
		this.studentClass = studentClass;
	}


	

	public Student(Integer studentId, String studentName, Gender studentGender, Class studentClass) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentGender = studentGender;
		this.studentClass = studentClass;
	}

	public Gender getStudentGender() {
		return studentGender;
	}

	public void setStudentGender(Gender studentGender) {
		this.studentGender = studentGender;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (!(o instanceof Student that)) {
			return false;
		}

		return getStudentId() == that.getStudentId();
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(getStudentId());
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentGender=" + studentGender
				+ ", studentClass=" + studentClass + "]";
	}
	
}
