package bean;

public class Student {
	private int studentID;
	private String studentName;
	private String score;
	
	public Student() {
	}
	
	public Student(int studentID, String studentName, String score) {
		this.studentID = studentID;
		this.studentName = studentName;
		this.score = score;
	}



	public int getStudentID() {
		return studentID;
	}
	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getScore() {
		return score;
	}
	public void setScore(String score) {
		this.score = score;
	}
	@Override
	public String toString() {
		return "Students [studentID=" + studentID + ", score=" + score + "]";
	}
	
	
}
