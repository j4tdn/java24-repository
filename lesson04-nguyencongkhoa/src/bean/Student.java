package bean;

public class Student {
	
	private int id;
	private String name;
	private double theoryPoint;
	private double practicePoint;
	
	public Student() {
	}

	public Student(int id, String name, double theoryPoint, double practicePoint) {
		this.id = id;
		this.name = name;
		this.theoryPoint = theoryPoint;
		this.practicePoint = practicePoint;
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

	public double getTheoryPoint() {
		return theoryPoint;
	}

	public void setTheoryPoint(double theoryPoint) {
		this.theoryPoint = theoryPoint;
	}

	public double getPracticePoint() {
		return practicePoint;
	}

	public void setPracticePoint(double practicePoint) {
		this.practicePoint = practicePoint;
	}
	
	public double avgPoint() {
		return (this.theoryPoint + this.practicePoint) / 2;
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", theoryPoint=" + theoryPoint + ", practicePoint="
				+ practicePoint + "]";
	}
	
}
