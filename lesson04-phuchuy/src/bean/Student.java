package bean;

public class Student {
	private Integer studentId;
	private String name;
	private Double theoryScore;
	private Double practicalScore;
	private Double averageScore;

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(Integer studentId, String name, Double theoryScore, Double practicalScore) {
		super();
		this.studentId = studentId;
		this.name = name;
		this.theoryScore = theoryScore;
		this.practicalScore = practicalScore;
		this.averageScore = 0.0d;
	}

	public Integer getStudentId() {
		return studentId;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getTheoryScore() {
		return theoryScore;
	}

	public void setTheoryScore(Double theoryScore) {
		this.theoryScore = theoryScore;
	}

	public Double getPracticalScore() {
		return practicalScore;
	}

	public void setPracticalScore(Double practicalScore) {
		this.practicalScore = practicalScore;
	}

	public Double averageScoreCal() {
		averageScore = (theoryScore + practicalScore) / 2;
		return averageScore;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", name=" + name + ", theoryScore=" + theoryScore
				+ ", practicalScore=" + practicalScore + ", averageScore=" + averageScoreCal() + "]";
	}

}
