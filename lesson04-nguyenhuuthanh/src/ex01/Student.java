package ex01;

public class Student {
	private int studentId;
	private String name;
	private double theoryPoint;
	private double practicePoint;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(int studentId, String name, double theoryPoint, double practicePoint) {
		super();
		this.studentId = studentId;
		this.name = name;
		this.theoryPoint = theoryPoint;
		this.practicePoint = practicePoint;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getTheoryPoint() {
		return theoryPoint;
	}

	public void setTheoryPoint(double theoryPoint) {
		this.theoryPoint = theoryPoint;
	}

	public double getPracticePoint() {
		return practicePoint;
	}

	public void setPracticePoint(double practicePoint) {
		this.practicePoint = practicePoint;
	}
	
	public double averagePoint() {
		return (theoryPoint + practicePoint) /2;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", name=" + name + ", theoryPoint=" + theoryPoint
				+ ", practicePoint=" + practicePoint + "]";
	}
	
	
	
	

}
