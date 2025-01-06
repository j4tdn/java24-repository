package Ex01;

public class Student {
	
	private int idStudent;
	private String nameStudent;
	private Grade gradeStudent;
	
	public Student(int idStudent, String nameStudent, Grade gradeStudent) {
		this.idStudent = idStudent;
		this.nameStudent = nameStudent;
		this.gradeStudent = gradeStudent;
	}
	public String getNameStudent() {
		return nameStudent;
	}
	public void setNameStudent(String nameStudent) {
		this.nameStudent = nameStudent;
	}
	public int getIdStudent() {
		return idStudent;
	}
	public void setIdStudent(int idStudent) {
		this.idStudent = idStudent;
	}
	public Grade getGradeStudent() {
		return gradeStudent;
	}
	public void setGradeStudent(Grade gradeStudent) {
		this.gradeStudent = gradeStudent;
	}
	@Override
	public String toString() {
		return "Student [idStudent=" + idStudent + ", nameStudent=" + nameStudent + ", gradeStudent=" + gradeStudent
				+ "]";
	}
	
	
	

}
