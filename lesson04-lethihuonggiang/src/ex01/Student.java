package ex01;

public class Student {
	
	private int studentID;
	private String name;
	private double theoryScore;
	private double practiceScore;
	
	public Student() {
	}

	public Student(int studentID, String name, double theoryScore, double practiceScore) {
		this.studentID = studentID;
		this.name = name;
		this.theoryScore = theoryScore;
		this.practiceScore = practiceScore;
	}

	public int getStudentID() {
		return studentID;
	}

	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getTheoryScore() {
		return theoryScore;
	}

	public void setTheoryScore(double theoryScore) {
		this.theoryScore = theoryScore;
	}

	public double getPracticeScore() {
		return practiceScore;
	}

	public void setPracticeScore(double practiceScore) {
		this.practiceScore = practiceScore;
	}
	public double calcAverageScore() {
		return (theoryScore + practiceScore) / 2;
	}

	@Override
	public String toString() {
		return "Student [studentID=" + studentID + ", name=" + name + ", theoryScore=" + theoryScore
				+ ", practiceScore=" + practiceScore + "]";
	}
	
	

	
	

}
