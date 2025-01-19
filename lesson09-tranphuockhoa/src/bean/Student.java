package bean;

public class Student {
	private int studentID; // studentId
	private String studentName;
	
	// Em nên tạo 1 enum chưa các giá trị xếp loại A, B, C, D, F sẽ hay hơn
	// Ni a nghĩ chắc đặt là rank chẳng hạn chứ score thường dùng cho điểm số em hè
	private String score;
	
	public Student() {
	}
	
	public Student(int studentID, String studentName, String score) {
		this.studentID = studentID;
		this.studentName = studentName;
		this.score = score;
	}


	// Nhớ format code em hi
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
