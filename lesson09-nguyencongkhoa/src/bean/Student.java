package bean;

public class Student {

	private int id;
	private String name;
	private String learningForce;

	public Student() {
	}

	public Student(int id, String name, String learningForce) {
		this.id = id;
		this.name = name;
		this.learningForce = learningForce;
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

	public String getLearningForce() {
		return learningForce;
	}

	public void setLearningForce(String learningForce) {
		this.learningForce = learningForce;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", learningForce=" + learningForce + "]";
	}
	
}
