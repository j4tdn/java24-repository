package bean;

public class Student {
	private Integer studentId;
	private String studentName;
	private Double theoreticalPoint;
	private Double practicePoint;

	public Student() {
	}

	public Student(Integer studentId, String studentName, Double theoreticalPoint, Double practicePoint) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.theoreticalPoint = theoreticalPoint;
		this.practicePoint = practicePoint;
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

	public Double getTheoreticalPoint() {
		return theoreticalPoint;
	}

	public void setTheoreticalPoint(Double theoreticalPoint) {
		this.theoreticalPoint = theoreticalPoint;
	}

	public Double getPracticePoint() {
		return practicePoint;
	}

	public void setPracticePoint(Double practicePoint) {
		this.practicePoint = practicePoint;
	}

	public Double avg() {
		if (theoreticalPoint == null || practicePoint == null) {
			return null; 
		}
		double avg = (this.theoreticalPoint + this.practicePoint) / 2;
		return avg;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", theoreticalPoint="
				+ theoreticalPoint + ", practicePoint=" + practicePoint + "]";
	}

}
