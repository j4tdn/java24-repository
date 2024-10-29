package bean;

public class Students {

	private Integer studentID;
	private String name;
	private Double theoryScore;
	private Double practiceScore;

	public Students() {
	}

	public Students(Integer studentID, String name, Double theoryScore, Double practiceScore) {
		super();
		this.studentID = studentID;
		this.name = name;
		this.theoryScore = theoryScore;
		this.practiceScore = practiceScore;
	}

	public Integer getStudentID() {
		return studentID;
	}

	public void setStudentID(Integer studentID) {
		this.studentID = studentID;
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

	public Double getPracticeScore() {
		return practiceScore;
	}

	public void setPracticeScore(Double practiceScore) {
		this.practiceScore = practiceScore;
	}

	public double AvarageScore() {
		double aveScore = (this.getTheoryScore() + this.getPracticeScore()) / 2;
		return aveScore;
	}
	
	@Override
	public String toString() {
		return "Students [studentID=" + studentID + ", name=" + name + ", theoryScore=" + theoryScore
				+ ", practiceScore=" + practiceScore + "]";
	}

}
