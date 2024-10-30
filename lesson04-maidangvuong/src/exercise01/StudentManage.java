package exercise01;

public class StudentManage {

	private int id;
	private String name;
	private double theoryScore;
	private double practiceScore;
	
	public StudentManage() {
	}

	public StudentManage(int id, String name, double theoryScore, double practiceScore) {
		this.id = id;
		this.name = name;
		this.theoryScore = theoryScore;
		this.practiceScore = practiceScore;
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

	public double getTheoryScore() {
		return theoryScore;
	}

	public void setTheoryScore(double theoryScore) {
		this.theoryScore = theoryScore;
	}

	public double getPracticeScore() {
		return practiceScore;
	}

	public void setPracticeScore(double practiceScore) {
		this.practiceScore = practiceScore;
	}
	
	public double calcAverageScore() {
		return (theoryScore + practiceScore) / 2;
	}

	@Override
	public String toString() {
		return "StudentManage [id=" + id + ", name=" + name + ", theoryScore=" + theoryScore + ", practiceScore="
				+ practiceScore + ", averageScore()=" + calcAverageScore() + "]";
	}
	
	
}
