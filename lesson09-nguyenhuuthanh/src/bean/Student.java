package bean;

public class Student {
	private int Id;
	private String Name;
	private Grade Grade;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(int id, String name, bean.Grade grade) {
		Id = id;
		Name = name;
		Grade = grade;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public Grade getGrade() {
		return Grade;
	}

	public void setGrade(Grade grade) {
		Grade = grade;
	}

	@Override
	public String toString() {
		return "Student [Id=" + Id + ", Name=" + Name + ", Grade=" + Grade + "]";
	}
	
	
}
