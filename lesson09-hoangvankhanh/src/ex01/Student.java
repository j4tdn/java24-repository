package ex01;

public class Student {
	private int id;
	private String name;
	private Point point;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	
	public Student(int id, String name, Point point) {
		this.id = id;
		this.name = name;
		this.point = point;
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


	public Point getPoint() {
		return point;
	}


	public void setPoint(Point point) {
		this.point = point;
	}


	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", point=" + point + "]";
	}
}
