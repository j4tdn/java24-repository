package bean;

public class Student {
	private Integer IdStudent;
	private String Name;
	private Double PointTheory;
	private Double PointPractical;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(Integer idStudent, String name, Double pointTheory, Double pointPractical) {
		IdStudent = idStudent;
		Name = name;
		PointTheory = pointTheory;
		PointPractical = pointPractical;
	}

	public Integer getIdStudent() {
		return IdStudent;
	}

	public void setIdStudent(Integer idStudent) {
		IdStudent = idStudent;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public Double getPointTheory() {
		return PointTheory;
	}

	public void setPointTheory(Double pointTheory) {
		PointTheory = pointTheory;
	}

	public Double getPointPractical() {
		return PointPractical;
	}

	public void setPointPractical(Double pointPractical) {
		PointPractical = pointPractical;
	}

	@Override
	public String toString() {
		return "Student [IdStudent=" + IdStudent + ", Name=" + Name + ", PointTheory=" + PointTheory
				+ ", PointPractical=" + PointPractical + "]";
	}
	public Double Average() {
		return (this.PointTheory + this.PointPractical) / 2;
	}
	
	
	
	

}
