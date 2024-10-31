package bean;

public class Student {

	private String idStudent;
	private String nameStudent;
	private float theoryPoint;
	private float practicePoint;

	public Student() {

	}

	public Student(String idStudent, String nameStudent, float theoryPoint, float practicePoint) {
		this.idStudent = idStudent;
		this.nameStudent = nameStudent;
		this.theoryPoint = theoryPoint;
		this.practicePoint = practicePoint;
	}

	public String getIdStudent() {
		return idStudent;
	}

	public void setIdStudent(String idStudent) {
		this.idStudent = idStudent;
	}

	public String getNameStudent() {
		return nameStudent;
	}

	public void setNameStudent(String nameStudent) {
		this.nameStudent = nameStudent;
	}

	public float getTheoryPoint() {
		return theoryPoint;
	}

	public void setTheoryPoint(float theoryPoint) {
		this.theoryPoint = theoryPoint;
	}

	public float getPracticePoint() {
		return practicePoint;
	}

	public void setPracticePoint(float practicePoint) {
		this.practicePoint = practicePoint;
	}
	
	public float averagePoint() {
		return (theoryPoint + practicePoint) / 2;
	}

	@Override
	public String toString() {
		return "Student [idStudent=" + idStudent + ", nameStudent=" + nameStudent + ", theoryPoint=" + theoryPoint
				+ ", practicePoint=" + practicePoint + "]";
	}
	
	

}
