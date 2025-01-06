package bean;

public class Student {
    private int Id;
    private String FullName;
    private char Grade;

    public Student(int Id, String FullName, char grade) {
        this.Id = Id;
        this.FullName = FullName;
        this.Grade = grade;
    }

	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getFullName() {
		return FullName;
	}
	public void setFullName(String fullName) {
		FullName = fullName;
	}
	public char getGrade() {
		return Grade;
	}
	public void setGrade(char grade) {
		Grade = grade;
	}
	@Override
    public String toString() {
        return "Student{" +
                "id=" + Id +
                ", name='" + FullName + '\'' +
                ", grade=" + Grade +
                '}';
    }
}