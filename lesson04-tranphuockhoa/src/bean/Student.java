package bean;

public class Student {
	
	private Integer studentID;
	private String studentName;
	private Double theoryPoint;
	private Double practicePoint;
	
	public Student() {
	}

	public Student(Integer studentID, String studentName, Double theoryPoint, Double practisePoint) {
		this.studentID = studentID;
		this.studentName = studentName;
		this.theoryPoint = theoryPoint;
		this.practicePoint = practisePoint;
	}

	public Integer getStudentID() {
		return studentID;
	}

	public void setStudentID(Integer studentID) {
		this.studentID = studentID;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public Double getTheoryPoint() {
		return theoryPoint;
	}

	public void setTheoryPoint(Double theoryPoint) {
		this.theoryPoint = theoryPoint;
	}

	public Double getPracticePoint() {
		return practicePoint;
	}

	public void setPracticePoint(Double practicePoint) {
		this.practicePoint = practicePoint;
	}
	
	public Double calAveragePoint() {
		return (theoryPoint + practicePoint) / 2;
	}

	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", theoryPoint=" + theoryPoint + ", practisePoint="
				+ practicePoint + "]";
	}
	
	 
}
