package ex01;

import ex01.Grades.Grade;

public class Student {
	private int id;
	private String name;
	private Grades.Grade grade;
	public Student(int id, String name, Grade grade) {
		super();
		this.id = id;
		this.name = name;
		this.grade = grade;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Grades.Grade getGrade() {
		return grade;
	}
	public void setGrade(Grades.Grade grade) {
		this.grade = grade;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", grade=" + grade + "]";
	}
	
	

}
