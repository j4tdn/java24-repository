package bean;

public class Students {
	
	private Integer id;
	private String name;
	private Double theoryPoint;
	private Double practicePoint;
	
	public Students() {
	}

	public Students(Integer id, String name, Double theoryPoint, Double practicePoint) {
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

	public Double getTheoryPoint() {
		return theoryPoint;
	}

	public void setTheoryPoint(Double theoryPoint) {
		this.theoryPoint = theoryPoint;
	}

	public Double getPracticePoint() {
		return practicePoint;
	}

	public void setPracticePoint(Double practicePoint) {
		this.practicePoint = practicePoint;
	}
	




	@Override
	public String toString() {
		return "Students [id=" + id + ", name=" + name + ", theoryPoint=" + theoryPoint + ", practicePoint="
				+ practicePoint + "]";
	}
	
	
	
}	
