package bean;

public class Student {
	
	private Integer idStudent;
	private String nameStudent;
	private Double theoryPoint;
	private Double labPoint;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(Integer idStudent, String nameStudent, Double theoryPoint, Double labPoint) {
		super();
		this.idStudent = idStudent;
		this.nameStudent = nameStudent;
		this.theoryPoint = theoryPoint;
		this.labPoint = labPoint;
	}

	public Integer getIdStudent() {
		return idStudent;
	}

	public void setIdStudent(Integer idStudent) {
		this.idStudent = idStudent;
	}

	public String getNameStudent() {
		return nameStudent;
	}

	public void setNameStudent(String nameStudent) {
		this.nameStudent = nameStudent;
	}

	public Double getTheoryPoint() {
		return theoryPoint;
	}

	public void setTheoryPoint(Double theoryPoint) {
		this.theoryPoint = theoryPoint;
	}

	public Double getLabPoint() {
		return labPoint;
	}

	public void setLabPoint(Double labPoint) {
		this.labPoint = labPoint;
	}

	@Override
	public String toString() {
		return "Students [idStudent=" + idStudent + ", nameStudent=" + nameStudent + ", theoryPoint=" + theoryPoint
				+ ", labPoint=" + labPoint + "]";
	}
	
	public Double averagePoint() {
		return (getTheoryPoint() + getLabPoint())/2;
	}
}	
