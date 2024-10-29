package bean;

public class Student {
	private Integer id;
	private String name;
	private Float theoryPoint;
	private Float practicePoint;
	
	public Student() {
	}

	public Student(Integer id, String name, Float theoryPoint, Float practicePoint) {
		this.id = id;
		this.name = name;
		this.theoryPoint = theoryPoint;
		this.practicePoint = practicePoint;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Float getTheoryPoint() {
		return theoryPoint;
	}

	public void setTheoryPoint(Float theoryPoint) {
		this.theoryPoint = theoryPoint;
	}

	public Float getPracticePoint() {
		return practicePoint;
	}

	public void setPracticePoint(Float practicePoint) {
		this.practicePoint = practicePoint;
	}
	
	public float calMeanPoint() {
		return (theoryPoint + practicePoint) / 2;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", theoryPoint=" + theoryPoint + ", practicePoint="
				+ practicePoint + "]";
	}
	
	
}
